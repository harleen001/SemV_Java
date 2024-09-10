import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get the writer object to write the response
        PrintWriter out = response.getWriter();

        // Get current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        // Write HTML response
        out.println("<html>");
        out.println("<head><title>Date and Time</title></head>");
        out.println("<body>");
        out.println("<h2>Current Date and Time</h2>");
        out.println("<p>" + formatter.format(date) + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
