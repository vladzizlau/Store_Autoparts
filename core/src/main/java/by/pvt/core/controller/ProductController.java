package by.pvt.core.controller;

import by.pvt.core.service.shopService.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prod")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<List<?>> getall() {
    return productService.getAllprod();
    }

//    @GetMapping("/page")
//    public List<List<?>> getl() {
//        return  productService.getAllprod();
//    }
}
