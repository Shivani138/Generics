import java.io.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  

  
public class DemoServlet2 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  
  
//creating ServletContext object  
ServletContext context=getServletContext();  
  
//Getting the value of the initialization parameter and printing it  
String driverName=context.getInitParameter("dname");  
pw.println("driver name is="+driverName);  
  
pw.close();  
  
}}  