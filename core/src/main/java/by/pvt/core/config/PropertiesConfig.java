package by.pvt.core.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.sql.DataSource;
import java.util.Properties;

//lesson 25
@Configuration
@EnableTransactionManagement
@ComponentScan("by.pvt.core")
@PropertySource("app.properties")
public class PropertiesConfig {
    @Value("${server.url}")
    private String url;
    @Value("${server.driver}")
    private String driver;
    @Value("${server.username}")
    private String username;
    @Value("${server.password}")
    private String pass;

    @Value("${hibernate.hbm2ddl.auto}")
    private String h_Auto;
    @Value("${hibernate.show_sql}")
    private String show_sql;
    @Value("${hibernate.format_sql}")
    private String format_sql;
    @Value("${hibernate.dialect}")
    private String dialect;
    @Value("${hibernate.packagesToScan}")
    private String packagesToScan;


    @Bean
    public DataSource dataSource(){

        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driver);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(pass);
        HikariDataSource ds = new HikariDataSource(hikariConfig);
        return ds;
    }

    @Bean
    public Properties hiberProperties(){
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", h_Auto);
        properties.setProperty("hibernate.show_sql", show_sql);
        properties.setProperty("hibernate.format_sql", format_sql);
        properties.setProperty("hibernate.dialect", dialect);
        properties.setProperty("hibernate.packagesToScan", packagesToScan);
        return properties;
    }

    @Bean
    public SessionFactory sessionFactory() throws Exception{
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setPackagesToScan(packagesToScan);
        localSessionFactoryBean.setDataSource(dataSource());
        localSessionFactoryBean.setHibernateProperties(hiberProperties());
        localSessionFactoryBean.afterPropertiesSet();
        return localSessionFactoryBean.getObject();
    }

    @Bean
   public PlatformTransactionManager transactionManager(SessionFactory sessionFactory){
        return new HibernateTransactionManager(sessionFactory);
    }

}
