package com.example.T2009M1_ASM.model;

import com.example.T2009M1_ASM.entity.Product;

import java.util.List;

public interface ProductModel {
    boolean save(Product product);
    boolean update(int id, Product product);
    boolean delete(int id);
    Product findById(int id);
    List<Product> findAll();
}
