package com.ProjectOne.Product.Service.controller;

import com.ProjectOne.Product.Service.entity.Product;
import com.ProjectOne.Product.Service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllproducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/insert")
    public Product insertProductInDb(@RequestBody Product product){
        return productService.insertProductIntoDatabase(product);
    }


    @GetMapping("/find/{id}")
    public Product getProductByid(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PutMapping("/update/{id}")
    public  Product updateProductById(@PathVariable int id,@RequestBody Product product){
        return  productService.updateProduct(id,product);
    }
}