package by.pvt.core.controller;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.StatusOrder;
import by.pvt.core.service.carService.CarService;
import by.pvt.core.service.shopService.OrderService;
import by.pvt.core.service.shopService.ShopcartService;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shop")
@RequiredArgsConstructor

public class CartController {

    private ShopcartService shopService;
    private OrderService orderService;

    @Autowired
    public CartController(ShopcartService shopcart, OrderService os) {
        this.shopService = shopcart;
        this.orderService = os;
    }

    @PostMapping("/add")
    public Long add(@Validated @RequestBody ShopcartRequest request) {
        return shopService.add(request);
    }

    @PostMapping("/get")
    public List<ShopcartResponse> getall() {
        return shopService.getAll();
    }

    @PostMapping("/getbyid={id}")
    public ShopcartResponse getById(@PathVariable("id") Long id) {
        return shopService.searchById(id);
    }

    @PostMapping("/d={id}")
    public String del(@PathVariable("id") Long id)
    {
        shopService.delete(id);
        return "[Delete cart]: " + id;
    }

    @PostMapping("/getuserorders={id}")
    public List <OrderResponse> userOrder(@PathVariable("id") Long id){
        return orderService.getOrderByUserId(id);
    }
    @PostMapping("/getbySatusAndid={id}&status={stat}")
    public List <OrderResponse> userOrderbyStatus(@PathVariable("id") Long id, @PathVariable("stat") String status){
        return orderService.getUserOrderByStatus(id, StatusOrder.valueOf(status));
    }

    @PostMapping("/editorder")
    public String editOrder (@Validated @RequestBody OrderRequest request){
        Long id = orderService.edit(request);
        return "Order change: " + id;
    }

    @PostMapping("/delorder={id}")
    public String delOrder (@PathVariable("id") Long id){
        orderService.delete(id);
        return "Order deleete: " +id;
    }

    @GetMapping("/allorders")
    public List<OrderResponse> getallOrders(){
        return orderService.getAll();
    }

}
