package src;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/datetime")
public class DateTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response content type
        response.setContentType("text/html");

        // Get the current date and time
        Date currentDate = new Date();

        // Print the current date and time to the response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Current Date and Time</h1>");
        out.println("<p>" + currentDate.toString() + "</p>");
        out.println("</body></html>");
    }
}
