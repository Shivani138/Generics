import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Extend HttpServlet, the base servlet implementation.
public class HelloServlet extends HttpServlet { 

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// Override the base implementation of doGet(), as desired.
  public void doGet (HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException { 
    // Set the MIME type for the response content.
    resp.setContentType("text/html"); 

    // Get an output stream to use in sending the output to the client.
    ServletOutputStream out = resp.getOutputStream(); 
    // Put together the HTML code for the output.
    out.println("<html>"); 
    out.println("<head><title>Hello World</title></head>");
    out.println("<body>");
    out.println("<h1>Hi There!</h1>");
    out.println("</body></html>");
  }
}