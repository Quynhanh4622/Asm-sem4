package com.example.T2009M1_ASM.controller;

import com.example.T2009M1_ASM.entity.Category;
import com.example.T2009M1_ASM.model.MySqlCategory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCategoryServlet extends HttpServlet {
    private final MySqlCategory categoryModel;
    public ListCategoryServlet() {
        categoryModel = new MySqlCategory();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categories = categoryModel.getAll();
        request.setAttribute("categories", categories);
        request.getRequestDispatcher("/Admin/views/category/index.jsp").forward(request, response);
    }
}
