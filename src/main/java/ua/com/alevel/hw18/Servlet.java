package ua.com.alevel.hw18;

import ua.com.alevel.model.Request;
import ua.com.alevel.repository.RequestRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    private final RequestRepository REPOSITORY = RequestRepository.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Request request = new Request(
                req.getRemoteAddr(),
                req.getHeader("user-agent"),
                new Date()
        );
        REPOSITORY.save(request);
        req.setAttribute("req-repo", REPOSITORY.findAll());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }


}
