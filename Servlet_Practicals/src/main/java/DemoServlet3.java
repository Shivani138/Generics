import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  

  
  
public class DemoServlet3 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter out=res.getWriter();  
  
ServletContext context=getServletContext();  
Enumeration<String> e=context.getInitParameterNames();  
      
String str="";  
while(e.hasMoreElements()){  
    str=e.nextElement();  
    out.print("<br> "+context.getInitParameter(str));  
}  
}}  
