package by.pvt.core.config;

import by.pvt.api.dto.shopDTO.CommentResponse;
import by.pvt.core.repository.*;
import by.pvt.core.repository.manufacturer.ManufacturerAKBRepo;
import by.pvt.core.repository.manufacturer.ManufacturerTiresRepo;
import by.pvt.core.service.carService.*;
import by.pvt.core.service.shopService.CommentService;
import by.pvt.core.service.shopService.OrderService;
import by.pvt.core.service.shopService.ShopcartService;
import by.pvt.core.service.shopService.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//Lesson 24
@Configuration
@ComponentScan("by.pvt.core")
public class BeanConfig {

    //Service
    @Bean
    public AkbService akbService()
    {
        return new AkbService(akbRepository());
    }
    @Bean
    public BodyPartService bodyPartService(){
        return new BodyPartService(bodyPartRepository());
    }
    @Bean
    public CarLampService carLampService(){
        return new CarLampService(carLampRepository());
    }
    @Bean
    public CarService carService(){
        return new CarService(carRepository(), carModelRepository());
    }
    @Bean
    public EngineService engineService(){
        return new EngineService(engineRepository());
    }
    @Bean
    public ManufacturerAKBService manufacturerAKBService(){
        return new ManufacturerAKBService(manufacturerAKBRepo());
    }
    @Bean
    public ManufacturerTiresService manufacturerTiresService(){
        return new ManufacturerTiresService(manufacturerTiresRepo());
    }
    @Bean
    public TiresService tiresService(){
        return new TiresService(tiresRepository());
    }
    @Bean
    public CommentService commentService(){
        return new CommentService(commentRepository());
    }
    @Bean
    public OrderService orderService(){
        return new OrderService(orderRepository());
    }
    @Bean
    public ShopcartService shopcartService(){
        return new ShopcartService(shopCartRepository());
    }
    @Bean
    public UserService userService(){
        return new UserService(userRepository());
    }


    //Repository
    @Bean
    public AKBRepository akbRepository(){
        return new AKBRepository();
    }
    @Bean
    public BodyPartRepository bodyPartRepository(){
        return new BodyPartRepository();
    }
    @Bean
    public CarLampRepository carLampRepository(){
        return new CarLampRepository();
    }
    @Bean
    public CarModelRepository carModelRepository(){
        return new CarModelRepository();
    }
    @Bean
    public CarRepository carRepository(){
        return new CarRepository();
    }
    @Bean
    public CommentRepository commentRepository(){
        return new CommentRepository();
    }
    @Bean
    public EngineRepository engineRepository(){
        return new EngineRepository();
    }
    @Bean
    public OrderRepository orderRepository(){
        return new OrderRepository();
    }
    @Bean
    public ShopCartRepository shopCartRepository(){
        return new ShopCartRepository();
    }
    @Bean
    public TiresRepository tiresRepository(){
        return new TiresRepository();
    }
    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }
    @Bean
    public ManufacturerAKBRepo manufacturerAKBRepo(){
        return new ManufacturerAKBRepo();
    }
    @Bean
    public ManufacturerTiresRepo manufacturerTiresRepo(){
        return new ManufacturerTiresRepo();
    }
}
