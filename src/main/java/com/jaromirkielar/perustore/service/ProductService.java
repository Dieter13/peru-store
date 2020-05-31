package com.jaromirkielar.perustore.service;

import com.jaromirkielar.perustore.dao.ProductRepository;
import com.jaromirkielar.perustore.exceptions.ProductNotFoundException;
import com.jaromirkielar.perustore.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElseThrow(()-> new ProductNotFoundException("Product has not been found with id" + productId));
    }

    @Override
    public Product addProduct(Product newProduct) {
        Product product = new Product();
        product.setOrderDetails(newProduct.getOrderDetails());
        product.setProductName(newProduct.getProductName());
        product.setProductDescription(newProduct.getProductDescription());
        product.setProductCategory(newProduct.getProductCategory());
        product.setColor(newProduct.getColor());
        product.setPrice(newProduct.getPrice());
        product.setSize(newProduct.getSize());
        product.setWeight(newProduct.getWeight());
        product.setInStockAmount(newProduct.getInStockAmount());
        product.setPhotoLink(newProduct.getPhotoLink());

        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
