package by.pvt.core;

import by.pvt.core.domain.Order;
import by.pvt.core.domain.Shopcart;
import by.pvt.core.repository.OrderRepository;
import by.pvt.core.repository.ShopCartRepository;
import by.pvt.core.repository.UserRepository;
import by.pvt.core.service.shopService.UserService;
import by.pvt.core.domain.User;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    private final static UserService userService = new UserService();


    public static void main(String[] args) {
//        addUSer();
//             deluser();
//            getUsers();
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


    }

    public static void addUSer() {
        User user1 = User.builder()
                .id(1L)
                .age(23)
                .amountSum(500)
                .firstName("Антон")
                .surName("Коржиков")
                .lastVisitDate(LocalDate.of(2019, Month.JUNE, 3))
                .phoneNumber("+375175682345")
                .build();



//        User user2 = new User();
//        user2.setId(2);
//        user2.setAge(17);
//        user2.setAmountSum(35);
//        user2.setFirstName("Василий");
//        user2.setSurName("Антипов");
//        user2.setLastVisitDate(LocalDate.of(2023, Month.AUGUST, 23));
//        user2.setPhoneNumber("+375175685689");
//
//
//        User user3 = new User();
//        user3.setId(3);
//        user3.setAge(45);
//        user3.setAmountSum(1500);
//        user3.setFirstName("Сергей");
//        user3.setSurName("Смирнов");
//        user3.setLastVisitDate(LocalDate.of(2023, Month.SEPTEMBER, 6));
//        user3.setPhoneNumber("+375235684589");
//
//
//        User user4 = new User();
//        user4.setId(4);
//        user4.setAge(17);
//        user4.setAmountSum(170);
//        user4.setFirstName("Геннадий");
//        user4.setSurName("Скакалов");
//        user4.setLastVisitDate(LocalDate.of(2021, Month.DECEMBER, 11));
//        user4.setPhoneNumber("+375273248534");
//
//
//        User user5 = new User();
//        user5.setId(5);
//        user5.setAge(30);
//        user5.setAmountSum(1000);
//        user5.setFirstName("Сергей");
//        user5.setSurName("Шестаков");
//        user5.setLastVisitDate(LocalDate.of(2023, Month.JUNE, 17));
//        user5.setPhoneNumber("+3751756767659");

//            userService.addUser(user1);
//            userService.addUser(user2);
//            userService.addUser(user3);
//            userService.addUser(user4);
//            userService.addUser(user5);
    }

    private static void deluser() {
        userService.delUser(1);
        userService.delUser(2);
        userService.delUser(3);
        userService.delUser(4);
        userService.delUser(5);
    }

    private static void getUsers() {
        System.out.println(userService.getAllUsers());
    }

    private static void searchUser() {

        System.out.println(userService.searchById(2));
    }

    private static void editUSer() {

//        userService.editUser(user, 18, 22, "aleh", LocalDate.of(1901, 03, 07), "546646757464" "Pupkins");
    }

}
