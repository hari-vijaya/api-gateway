package com.codebasicz.apigateway.routeConfiguration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIRouteConfiguration {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route(r -> r.path("/employee/**")
                        .uri("http://localhost:8081/"))

                .route(r -> r.path("/consumer/**")
                        .uri("http://localhost:8082/"))
                .build();
    }

}
