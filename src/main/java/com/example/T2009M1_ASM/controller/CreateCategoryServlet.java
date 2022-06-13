package com.example.T2009M1_ASM.controller;

import com.example.T2009M1_ASM.entity.Category;
import com.example.T2009M1_ASM.entity.Status;
import com.example.T2009M1_ASM.model.MySqlCategory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateCategoryServlet extends HttpServlet {
    private final MySqlCategory categoryModel;
    public CreateCategoryServlet() {
        categoryModel = new MySqlCategory();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String status = req.getParameter("status");
        Status statusValue = Status.ACTIVE;
        if(status  == null) {
            statusValue = Status.DEACTIVE;
        }
        Category category = new Category();
        category.setName(name);
        category.setStatus(statusValue);
        boolean result = categoryModel.Save(category);
        resp.sendRedirect("/Admin/category");
    }
}
