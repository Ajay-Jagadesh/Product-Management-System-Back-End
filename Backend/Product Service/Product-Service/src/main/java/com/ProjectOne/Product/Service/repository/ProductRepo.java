package com.ProjectOne.Product.Service.repository;

import com.ProjectOne.Product.Service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}