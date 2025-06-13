package by.it_academy.jd2.Mk_jd2_111_25.controller;

import by.it_academy.jd2.Mk_jd2_111_25.service.PlaylistService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/mail")
public class AddMailServlet extends HttpServlet {

    private final PlaylistService service = new PlaylistService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final HttpSession session = req.getSession();

        String mail = req.getParameter("mail");
        if (valid(mail)){
            session.setAttribute("mail", mail);
            service.addMail(mail);
        }

    }

    private boolean valid(String mail){
        //TODO валидация почты
        return true;
    }
}
