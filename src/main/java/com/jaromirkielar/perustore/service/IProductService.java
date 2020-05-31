package com.jaromirkielar.perustore.service;

import com.jaromirkielar.perustore.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductService {

    List<Product> getAllProducts();
    Product getProductById(Long productId);
    Product addProduct(Product newProduct);
    void deleteProduct(Long productId);



}

