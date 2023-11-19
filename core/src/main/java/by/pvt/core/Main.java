package by.pvt.core;

import by.pvt.core.domain.shopDomain.*;
import by.pvt.core.service.carService.*;
import by.pvt.core.repository.*;
import by.pvt.core.service.shopService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Pageable;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Main {



    public static void main(String[] args) {

//        addUSer();
//        addCar();
//        addBodypart();
//             deluser();
//        addEngine();
//            getUsers();
//        getCars();
//        searchUser();
//editUSer();
//        UserRepository userrepo = new UserRepository();
//        User user = userrepo.findById(1L);
//        user.setAge(1);
//        user.setFirstName("o");
//        user.setAmountSum(1.0);
//        userrepo.updateUser(user);

//            ShopCartRepository shopCartRepository = new ShopCartRepository();
//            Shopcart shopcart = Shopcart.builder()
//                    .orderid(1)
//                    .status("OK")
//                    .cost(500)
//                    .build();
//            shopCartRepository.addShopcart(shopcart);
//
//            OrderRepository orderRepository = new OrderRepository();
//            Order order1 = Order.builder()
//                    .userid(1L)
//                    .productid(1L)
//                    .cost(500)
//                    .count(10)
//                    .shopcart(shopcart)
//            .build();
//            orderRepository.addOrder(order1);

//

//        System.out.println(dz_20.getAKBbyVoltage(12));
//        System.out.println(dz_20.getAKBbyPrice(new BigDecimal(10), new BigDecimal(250)));
//        System.out.println(dz_20.getEngineByPrice(new BigDecimal(10), new BigDecimal(1000)));
//        System.out.println(dz_20.getModelByBrand(1L));
//        System.out.println(dz_20.getTirebySeason(TireType.ALL_SEASON));

//        Session session = sessionFactory.openSession();
//        org.hibernate.query.Query query = session.createQuery("Select c from Car c");
//        Car car = session.load(Car.class, 1L);
//        System.out.println(car);
//        session.close();
//
//        Session session3 = sessionFactory.openSession();
//        Car car1 = session3.load(Car.class, 1L);
//        System.out.println(car1);
//        session.close();
//UserRepository ur = new UserRepository();
//UserService us = new UserService(ur);
//        System.out.println(us.getAllUsers());

//        ApplicationContext ac = new AnnotationConfigApplicationContext(PropertiesConfig.class);
//        AkbService us = ac.getBean(AkbService.class);
////        System.out.println(us.getAll());
////        System.out.println(us.getAKBbyVoltage(12));
////        System.out.println(us.getAKBbyPrice(new BigDecimal(100), new BigDecimal(999999)));
////        System.out.println(us.searchById(1));
////        System.out.println(us.getAKBbyBatteryCapacity(120.0));
//
//
//       TiresService ts = ac.getBean(TiresService.class);
//       ts.getTirebyWidth(250);



    }







}
