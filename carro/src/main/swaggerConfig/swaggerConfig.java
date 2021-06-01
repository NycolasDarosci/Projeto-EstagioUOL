import org.springframework.context.annotation.Configuration;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class swaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(ParthSelectors.any()).build();

    }
}

// basePackage("carro/carro/src/main/java/com/example/carro/carro")
// http://localhost:8080/swagger-ui.html#