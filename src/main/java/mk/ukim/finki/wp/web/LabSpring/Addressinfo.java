package mk.ukim.finki.wp.web.LabSpring;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/Addressinfo.do")
public class Addressinfo extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String golemina = request.getSession().getAttribute("pizzaSize").toString();
        String ime = request.getParameter("ime");
        String adresa = request.getParameter("adresa");

        response.getWriter().println(request.getHeader("User-Agent"));
        response.getWriter().println();
        response.getWriter().println("Golemina: " + golemina);
        response.getWriter().println("Ime: " + ime);
        response.getWriter().println("Adresa: " + adresa);


    }
}
