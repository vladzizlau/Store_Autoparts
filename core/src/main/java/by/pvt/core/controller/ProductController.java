package by.pvt.core.controller;

import by.pvt.api.dto.carDTO.BodypartResponse;
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

    @GetMapping("/category={cat}")
    public List <?> getprodbyCategory(@PathVariable("cat") String category)
    {
        return productService.getCategoryProds(category);
    }

    @GetMapping("/prodsforcar={carModel}")
    public List <List <?>> getProdForCar(@PathVariable("carModel") Long model_id){
        return productService.prodsForCar(model_id);
    }

    @GetMapping("/findbycode={codeprod}")
    public List<List<?>> findProdByCode(@PathVariable("codeprod") Long codeProd){
        return productService.prodsByCode(codeProd);
    }


    @GetMapping("/page={numberPage}&size={s}") // метод с пагинацией всех товаров
    public List<List<?>> getl(@PathVariable("numberPage") int n,@PathVariable("s") int size) {
        return  productService.allprodPages(n, size);
    }


}
