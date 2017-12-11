package mk.ukim.finki.wp.web.LabSpring;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/PizzaOrder.do")
public class PizzaOrder extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String golemina = request.getParameter("size");
        request.getSession().setAttribute("pizzaSize", golemina);
        response.sendRedirect("/DeliveryInfo.html");
    }
}
