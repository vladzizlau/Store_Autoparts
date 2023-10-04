package by.pvt.core.config;
import by.pvt.core.domain.Comments;
import by.pvt.core.domain.Order;
import by.pvt.core.domain.Shopcart;
import by.pvt.core.domain.User;
import by.pvt.core.domain.shopDomain.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import java.util.Properties;

public class HibernateConfig {

    private final static StandardServiceRegistryBuilder standardServiceRegistryBuilder;
    private final static Configuration configuration;

    static {
        Properties properties = new Properties();

        properties.setProperty("hibernate.hbm2ddl.auto", "none");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.use_sql_comments", "true");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");

        properties.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/autoparts"); //autoparts
        properties.setProperty("hibernate.connection.username", "postgres");
        properties.setProperty("hibernate.connection.password", "sa");

        configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(Shopcart.class);
        configuration.addAnnotatedClass(AKB.class);
        configuration.addAnnotatedClass(BodyPart.class);
        configuration.addAnnotatedClass(Car.class);
        configuration.addAnnotatedClass(CarModel.class);
        configuration.addAnnotatedClass(CarLamp.class);
        configuration.addAnnotatedClass(Engine.class);
        configuration.addAnnotatedClass(ManufacturerAKB.class);
        configuration.addAnnotatedClass(ManufacturerTires.class);
        configuration.addAnnotatedClass(Tire.class);
        configuration.addAnnotatedClass(Comments.class);
        configuration.setProperties(properties);
        standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
        standardServiceRegistryBuilder.applySettings(properties);

    }

    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        return sessionFactory;
    }
}
