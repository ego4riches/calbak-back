package com.calbak.utils.swagger;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@Slf4j
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("캘박사 Swagger")
                .description("캘박사 API 명세서 (2025.03)")
                .version("1.0.0");
    }

    @Bean
    public OpenApiCustomizer openApiCustomizer() {
        return openApi -> {
            // 📌 1️⃣ 컨트롤러 경로(paths) 정렬 (기존 코드 유지)
            openApi.setPaths(getSortedPaths(openApi));

            // 📌 2️⃣ 태그(tags) 정렬 추가
            List<Tag> sortedTags = getSortedTags(openApi.getTags());
            openApi.setTags(sortedTags);
        };
    }

    private Paths getSortedPaths(OpenAPI openApi) {
        Map<String, PathItem> sortedPaths = new LinkedHashMap<>();
        openApi.getPaths().entrySet().stream()
                .sorted(Comparator.comparingInt(this::getIndexFromPathItem))
                .forEachOrdered(x -> sortedPaths.put(x.getKey(), x.getValue()));
        Paths paths = new Paths();
        paths.putAll(sortedPaths);
        return paths;
    }

    private int getIndexFromPathItem(Map.Entry<String, PathItem> pathItem) {
        List<Operation> operations = new ArrayList<>();
        PathItem value = pathItem.getValue();
        operations.add(value.getGet());
        operations.add(value.getPut());
        operations.add(value.getPost());
        operations.add(value.getDelete());
        operations.add(value.getPatch());

        operations = operations.stream().filter(Objects::nonNull).toList();

        if (operations.isEmpty() || operations.get(0).getSummary() == null) {
            return 999;
        }

        try {
            return Integer.parseInt(operations.get(0).getSummary().split("\\.")[0]);
        } catch (NumberFormatException e) {
            return 999;
        }
    }

    // 📌 3️⃣ 태그 정렬 메서드 추가
    private List<Tag> getSortedTags(List<Tag> tags) {
        if (tags == null) return Collections.emptyList();

        return tags.stream()
                .sorted(Comparator.comparingInt(this::getIndexFromTag))
                .toList();
    }

    private int getIndexFromTag(Tag tag) {
        try {
            return Integer.parseInt(tag.getName().split("\\.")[0]); // 예: "5. 알림 Controller" → 5 추출
        } catch (NumberFormatException e) {
            return 999; // 숫자가 없으면 가장 뒤로 정렬
        }
    }
}