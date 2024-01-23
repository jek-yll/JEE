package com.example.exercices1_produitjee.servlet;

import com.example.exercices1_produitjee.model.Produit;
import com.example.exercices1_produitjee.service.ProduitService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "add", value = "/add_product")
public class ProductAddServlet extends HttpServlet {

    private ProduitService ps;

    private Produit p;

    @Override
    public void init() throws ServletException {
        ps = new ProduitService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ref = req.getParameter("ref");
        String brand = req.getParameter("brand");
        String date = req.getParameter("date");
        String price = req.getParameter("price");
        String stock = req.getParameter("stock");
    }
}
