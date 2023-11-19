package by.pvt.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan ("by.pvt.core")
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {
    private ApplicationContext applicationContext;

    @Autowired
    public MVCConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }





}
