
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Scanner;

/**
 *
 * @author windows
 */
@WebServlet(name = "EdadPersona", urlPatterns = {"/EdadPersona"})
public class EdadPersona extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("texto/html");
        PrintWriter out = response.getWriter();
         try{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Edad</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>datos</h1>");
            out.println("<form action='' method='post'>");
            out.println("Nombre");
            out.println("<br><input type='text'name='nombre'>");
            out.println("<br>Ingresa tu año de nacimiento");
            out.println("<br><input type='number'name='Año'>");
            out.println("<br><input type='submit'>");
            
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
             }finally{
            out.close();   
         }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int Año=Integer.parseInt(request.getParameter("Año"));
        
        response.setContentType("texto/html");
        PrintWriter out = response.getWriter();
        
        try{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Edad</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos</h1>");
           
            out.println("<p>Tu Nombre es:"+nombre+" </p>");
            out.println("<p>Tu edad es:"+(2020-Año)+" </p>");
            out.println("</body>");
            out.println("</html>");    
            
        }finally{
            out.close();   
        }
    }
}



