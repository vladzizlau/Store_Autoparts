package by.pvt.core.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig{


    @Bean
    public PasswordEncoder passwordEncoderByCrypt() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
// ------------   Вариант как на занятити
//    @Bean
//    public SecurityFilterChain configure (HttpSecurity http) throws Exception {
//        http.csrf(AbstractHttpConfigurer::disable).httpBasic(Customizer.withDefaults()).authorizeHttpRequests(authorize -> authorize
//
//                .requestMatchers( "/shop/").hasAuthority("Admin")
//                .requestMatchers(HttpMethod.POST, "/akbedit/**").hasAuthority("Admin")
//                .requestMatchers(HttpMethod.POST, "/bodypartedit/**").hasAuthority("Admin")
//                .requestMatchers( "/caredit/**").hasAuthority("Admin")
//                .requestMatchers(HttpMethod.POST, "/carlampedit/**").hasAuthority("Admin")
//                .requestMatchers(HttpMethod.POST, "/engineedit/**").hasAuthority("Admin")
//                .requestMatchers(HttpMethod.POST, "/brandtires/**").hasAuthority("Admin")
//                .requestMatchers(HttpMethod.POST, "/brandakb/**").hasAuthority("Admin")
//                .requestMatchers(HttpMethod.POST, "/tireedit/**").hasAuthority("Admin")
//                .requestMatchers("/u/**").hasAuthority("Admin")
//                .requestMatchers("/new/**").permitAll()
//                .requestMatchers(HttpMethod.GET, "/prod/**").authenticated());
//        return http.build();
//    }
// ------------   Самостоятельные поиски
    @Bean
    public SecurityFilterChain configure (HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable).httpBasic(Customizer.withDefaults()).authorizeHttpRequests(authorize -> authorize

                .requestMatchers(new AntPathRequestMatcher( "/shop/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher("/akbedit/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher("/bodypartedit/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher( "/caredit/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher( "/carlampedit/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher ("/engineedit/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher("/brandtires/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher("/brandakb/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher("/tireedit/**")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher("/u/**", "GET")).hasAuthority("Admin")
                .requestMatchers(new AntPathRequestMatcher("/new/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/prod/**")).authenticated());

        return http.build();
    }



}