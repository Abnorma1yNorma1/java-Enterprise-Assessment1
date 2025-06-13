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
import java.util.List;

@WebServlet("/get")
public class GetSongsServlet extends HttpServlet {

    private final PlaylistService service = new PlaylistService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final HttpSession session = req.getSession();
        Writer out = resp.getWriter();
        String mail = (String) session.getAttribute("mail");
        List<Song> list = service.getPlaylist(mail);
        if (list == null || list.isEmpty()){
            return;
        } else {
            for (Song s: list){
                out.write(s.getName() + "\n");
            }

        }
    }
}
