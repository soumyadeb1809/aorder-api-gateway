package in.aorder.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class GatewayConfig {


    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("restaurant-service-route", r -> r.path("/api/rfs/**")
                        .uri("lb://restaurant-service/"))

                .route("qrcode-service-route", r -> r.path("/api/qrs/**")
                        .uri("lb://qrcode-service/"))
                .build();
    }

}
