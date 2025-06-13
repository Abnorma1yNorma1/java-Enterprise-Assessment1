package by.it_academy.jd2.Mk_jd2_111_25.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/mail")
public class PutMailServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final HttpSession session = req.getSession();

        String mail = req.getParameter("mail");
        if (validate(mail)){
            session.setAttribute("mail", mail);
        }

    }

    private boolean validate(String mail){
        //TODO валидация почты
        return true;
    }
}
