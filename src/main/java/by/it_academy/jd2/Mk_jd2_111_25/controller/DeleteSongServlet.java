package by.it_academy.jd2.Mk_jd2_111_25.controller;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;
import by.it_academy.jd2.Mk_jd2_111_25.service.PlaylistService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.Writer;

@WebServlet("/delete")
public class DeleteSongServlet extends HttpServlet {

    private final PlaylistService service = new PlaylistService();

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Writer out = resp.getWriter();
        String songName = req.getParameter("songName");
        String mail = (String) session.getAttribute("mail");
        if (service.deleteSong(mail, songName)){
            out.write("song " + songName + " deleted");
        } else {
            out.write("song " + songName + " wasn't deleted");
        }

    }
}
