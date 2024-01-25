package com.example.correctionproduit.servlet;

import com.example.correctionproduit.entities.Utilisateur;
import com.example.correctionproduit.services.UtilisateurService;
import com.example.correctionproduit.utils.Definition;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "authentification", value = "/authentification")
public class UtilisateurServlet extends HttpServlet {

    private UtilisateurService service;

    @Override
    public void init() throws ServletException {
        service = new UtilisateurService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();

        try {
            switch (action){
                case "/authentification":
                    authForm(req, resp);
                    break;
                case "/register":
                    newUser(req, resp);
                    break;
                case "/login":
                    logUser(req, resp);
            }
        } catch (SQLException ex){
            throw new ServletException(ex);
        }
    }

    private void authForm(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException{
        RequestDispatcher dispatcher = req.getRequestDispatcher(Definition.VIEW_PATH+"auth-form.jsp");
        dispatcher.forward(req, resp);
    }

    private void newUser(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Utilisateur utilisateur = new Utilisateur(email, password);

        if(service.create(utilisateur)) {
            resp.sendRedirect("list");
        }else{
            resp.sendRedirect(Definition.VIEW_PATH+"auth-form.jsp");
        }
    }

    private void logUser(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {



    }

}
