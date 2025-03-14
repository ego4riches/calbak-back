package com.calbak.utils.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class QueryDslConfig {


    private final EntityManager em;

    private final DataSource datasource;

    @Bean
    public JPAQueryFactory jpaQueryFactory() {

        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(em);

        return jpaQueryFactory;
    }



    private String camelCaseToSnakeCase(String camel) {
        return camel.replaceAll("([A-Z])", "_$1").toLowerCase();
    }


}
