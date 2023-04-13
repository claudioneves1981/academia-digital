package me.dio.academia.digital;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class AcademiaDigitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcademiaDigitalApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Academia Digital")
                .description(buildDescription().toString())
                .version("1.0")
                .termsOfService("http://swagger.io/terms")
                .contact(new Contact()
                        .name("Cláudio Neves")
                        .url("https://www.github.com/claudioneves1981")
                        .email("cfneguacu@hotmail.com"))
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

    private StringBuilder buildDescription() {
        StringBuilder text = new StringBuilder();
        text.append("Um exemplo de sistema de Academia Digital com Spring Boot , REST API e PostgreSQL, documentada com Swagger");
        return text;
    }

}
