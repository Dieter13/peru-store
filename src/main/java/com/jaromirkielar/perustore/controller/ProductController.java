package com.jaromirkielar.perustore.controller;

import com.jaromirkielar.perustore.model.Product;
import com.jaromirkielar.perustore.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductController {

    private IProductService iProductService;


    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;

    }


    @PostMapping("/products")

    public Product addProduct( @RequestBody Product product) {

        return iProductService.addProduct(product);

    }

    @GetMapping("/products")

    public List<Product> getAllProducts(@RequestBody Product product) {

        return iProductService.getAllProducts();
    }

    @GetMapping("/products/{id}")

    public Product getProduct(@PathVariable Long id){
        return iProductService.getProductById(id);
    }

    @DeleteMapping("/products/{id}")

    public void deleteProduct(@PathVariable Long id ){
        iProductService.deleteProduct(id);
    }

}
