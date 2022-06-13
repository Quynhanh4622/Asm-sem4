package com.example.T2009M1_ASM.controller;

import com.example.T2009M1_ASM.model.MySqlProduct;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteProductServlet extends HttpServlet {
    private final MySqlProduct productModel;
    public DeleteProductServlet() {
        productModel = new MySqlProduct();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
