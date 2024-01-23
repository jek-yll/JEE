package com.example.exercices1_produitjee.servlet;

import com.example.exercices1_produitjee.model.Produit;
import com.example.exercices1_produitjee.service.ProduitService;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "product", value = "/product")
public class ProductServlet extends HttpServlet {

    public List<Produit> productList ;
    public ProduitService ps;

    public void init() throws ServletException {
       ps = new ProduitService();
       productList = ps.findAll();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // productList = ps.findAll();
        req.setAttribute("products", productList);
        req.getRequestDispatcher("product-list.jsp").forward(req, resp);
    }

//    @Override
//    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String brand = req.getParameter("brand");
//        String reference = req.getParameter("reference");
//        req.setAttribute("products", productList);
//        req.getRequestDispatcher("product-list.jsp").forward(req, resp);
//
//    }
}
