package com.example.T2009M1_ASM.controller;

import com.example.T2009M1_ASM.entity.Product;
import com.example.T2009M1_ASM.model.MySqlProduct;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListProductServlet extends HttpServlet {
    private final MySqlProduct productModel;
    public ListProductServlet() {
        productModel = new MySqlProduct();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productModel.findAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/Admin/views/product/index.jsp").forward(request, response);
    }
}
