package com.ProjectOne.Product.Service.service.impl;

import com.ProjectOne.Product.Service.entity.Product;
import com.ProjectOne.Product.Service.repository.ProductRepo;
import com.ProjectOne.Product.Service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product insertProductIntoDatabase(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productFromDB = productRepo.findById(id).orElse(null);
        if (productFromDB != null) {
            productFromDB.setName(product.getName());
            productFromDB.setPrice(product.getPrice());
            productFromDB.setQuantity(product.getQuantity());
            return productRepo.save(productFromDB);
        }
        return null;
    }

    @Override
    public Product deleteProduct(int id, Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        Product product = productRepo.findById(id).orElse(null);
        if (product != null) {
            productRepo.deleteById(id);
        }
        return product;
    }
}
