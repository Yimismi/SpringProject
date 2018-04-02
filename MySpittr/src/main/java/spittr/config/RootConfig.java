package spittr.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan(basePackages={"spittr"},
        excludeFilters={
                @ComponentScan.Filter(type=FilterType.ANNOTATION, value= EnableWebMvc.class)
        })
public class RootConfig {
}
