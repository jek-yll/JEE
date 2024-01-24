package com.example.exercices1_produitjee.servlet;

import com.example.exercices1_produitjee.model.Produit;
import com.example.exercices1_produitjee.service.ProduitService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        String reference = req.getParameter("reference");
        String marque = req.getParameter("marque");
        String dateStr = req.getParameter("dateAchat");
        LocalDate dateAchat = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        double prix = Double.valueOf(req.getParameter("prix"));
        int stock = Integer.parseInt(req.getParameter("stock"));

        Produit p = new Produit(marque, reference, dateAchat, prix, stock);

        ps.create(p);

    }
}
