package github.alexander1914.springjpa.restfull;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot RESTFull Web Services",
                description = "This application about RESTFull services, JPA, Validations and Spring Actuator " +
                        "and SpringDoc with Swagger OpenAPI",
                version = "v1.0",
                contact = @Contact(
                        name = "Alexander Albuquerque Oliveira",
                        email = "alexander.oliveira99@gmail.com",
                        url = "https://github.com/alexander1914"
                ),
                license = @License(
                        name = "Apache 2.8.14",
                        url = "https://github.com/alexander1914/license"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Management Documentation",
                url = "https://github.com/alexander1914/spring-6-and-spring-boot-3-review/tree/main/springjpa-restfull-webservices"
        )
)
public class SpringjpaRestfullWebservicesApplication {

	@Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringjpaRestfullWebservicesApplication.class, args);

	}

}
