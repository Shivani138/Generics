import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
 
 
public class ServletLifecycleExample extends GenericServlet {
     
    @Override
    public void init() {
        // initialize the servlet, and print something in the console.
        System.out.println("Servlet Initialized!");
    }
 
    public void service1(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
         
        // the service method will 
        response.setContentType("text/html");
         
        PrintWriter out = response.getWriter();
        out.println("Servlet called from jsp page!");
    }
     
    @Override
    public void destroy() {
        // close connections etc.
    }

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}