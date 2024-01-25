package com.example.hopital.servlet;

import com.example.hopital.entities.User;
import com.example.hopital.services.AuthService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class UserServlet extends HttpServlet {

    private AuthService authService;

    @Override
    public void init() throws ServletException {
        authService = new AuthService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username != null && password != null){
            User user2 = new User(username, password);
            User user3 = authService.getUserByUsernamePassword(user2);
            if(user3 != null){
                HttpSession session = req.getSession();
                session.setAttribute("isLogged", true);
                session.setAttribute("name",user3.getName());
                resp.sendRedirect("list");
            }else{
                HttpSession session = req.getSession();
                session.setAttribute("loginError", "Identifiants invalides.");
                resp.sendRedirect("login.jsp");
            }

        }else{
            resp.sendRedirect("login.jsp");
        }
    }
}
