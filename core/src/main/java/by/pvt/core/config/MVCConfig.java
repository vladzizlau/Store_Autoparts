package by.pvt.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan ("by.pvt.core")
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {


    ApplicationContext applicationContext;

    @Autowired
    public MVCConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }




}
