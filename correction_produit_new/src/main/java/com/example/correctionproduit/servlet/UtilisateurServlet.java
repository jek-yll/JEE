package com.example.correctionproduit.servlet;

import com.example.correctionproduit.services.UtilisateurService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "authentification", value = "/authentification")
public class UtilisateurServlet extends HttpServlet {

    private UtilisateurService service;

    @Override
    public void init() throws ServletException {
        service = new UtilisateurService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
