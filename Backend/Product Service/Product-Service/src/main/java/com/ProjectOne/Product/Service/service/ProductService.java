package com.ProjectOne.Product.Service.service;

import com.ProjectOne.Product.Service.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product insertProductIntoDatabase(Product product);
    Product getProductById(int id);
    Product updateProduct(int id, Product product);
}