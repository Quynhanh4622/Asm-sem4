package com.example.T2009M1_ASM.controller;

import com.example.T2009M1_ASM.entity.Category;
import com.example.T2009M1_ASM.entity.Status;
import com.example.T2009M1_ASM.model.MySqlCategory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateCategoryServlet extends HttpServlet {
    private final MySqlCategory categoryModel;
    public UpdateCategoryServlet() {
        categoryModel = new MySqlCategory();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cateId = Integer.parseInt(req.getParameter("cateId"));
        String name = req.getParameter("name");
        String status = req.getParameter("status");
        Status statusValue = Status.ACTIVE;
        if(status  == null) {
            statusValue = Status.DEACTIVE;
        }
        Category category = new Category();
        category.setName(name);
        category.setStatus(statusValue);
        categoryModel.Update(cateId,category);
        resp.sendRedirect("/Admin/category");
    }
}
