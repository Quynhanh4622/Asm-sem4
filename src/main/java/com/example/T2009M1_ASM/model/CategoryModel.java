package com.example.T2009M1_ASM.model;

import com.example.T2009M1_ASM.entity.Category;

import java.util.List;

public interface CategoryModel {
    boolean Save(Category category);
    List<Category> getAll();
    Category findById(int id);
    boolean Update(int id, Category updateCategory);
    boolean Delete(int id);
}
