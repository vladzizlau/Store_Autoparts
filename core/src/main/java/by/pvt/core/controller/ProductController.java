package by.pvt.core.controller;

import by.pvt.core.service.shopService.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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

    @GetMapping("/categoty={cat}")
    public List <?> getprodbyCategory(@PathVariable("cat") String category)
    {
        return productService.getCategoryProds(category);
    }


    @GetMapping("/page={numberPage}&size={s}")
    public List<List<?>> getl(@PathVariable("numberPage") int n,@PathVariable("s") int size) {
        return  productService.allprodPages(n, size);
    }
}
