package com.example.exercices1_produitjee.servlet;

import com.example.exercices1_produitjee.model.Produit;
import com.example.exercices1_produitjee.service.ProduitService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "product", value = "/product")
public class ProductDetailServlet extends HttpServlet {

    private ProduitService ps;
    private Produit p;

    @Override
    public void init() throws ServletException {
        ps = new ProduitService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        p = ps.findById(id);
        req.setAttribute("product", p);
        req.getRequestDispatcher("product-details.jsp").forward(req, resp);
    }
}
