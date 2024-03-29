package com.example.exercices1_produitjee.servlet;

import com.example.exercices1_produitjee.model.Produit;
import com.example.exercices1_produitjee.service.ProduitService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "products", value = "/products")
public class ProductServlet extends HelloServlet{

    private ProduitService ps;
    private List<Produit> produitList;

    @Override
    public void init() {
        ps = new ProduitService();
        produitList = ps.findAll();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", produitList);
        req.getRequestDispatcher("product-list.jsp").forward(req,resp);
    }
}
