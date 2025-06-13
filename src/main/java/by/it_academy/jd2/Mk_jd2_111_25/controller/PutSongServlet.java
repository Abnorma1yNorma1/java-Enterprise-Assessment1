package by.it_academy.jd2.Mk_jd2_111_25.controller;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;
import by.it_academy.jd2.Mk_jd2_111_25.service.PlaylistService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class PutSongServlet extends HttpServlet {

    private final PlaylistService service = new PlaylistService();


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final HttpSession session = req.getSession();
//        String songName = (String) session.getAttribute("songName");
//        service.add(new Song(songName));
//        session.setAttribute("playlist", );
    }
}
