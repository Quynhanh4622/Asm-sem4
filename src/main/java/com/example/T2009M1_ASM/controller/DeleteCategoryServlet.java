package com.example.T2009M1_ASM.controller;

import com.example.T2009M1_ASM.model.MySqlCategory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCategoryServlet extends HttpServlet {
    private final MySqlCategory categoryModel;
    public DeleteCategoryServlet() {
        categoryModel = new MySqlCategory();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cateId = Integer.parseInt(req.getParameter("cateId"));
        categoryModel.Delete(cateId);
        resp.sendRedirect("/Admin/category");
    }
}
