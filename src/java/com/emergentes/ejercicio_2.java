
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio_1", urlPatterns = {"/ejercicio_1"})
public class ejercicio_2 extends HttpServlet {
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>edad</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Calcular su edad a partir de fu fecha de nacimiento</h2>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Fecha");
            out.println("<input type='number' name='dia' required>");
            out.println("<input type='number' name='mes' required>");
            out.println("<input type='number' name='año' required>");
            out.println("<br>");
            out.println("<input type='submit' value='Enviar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dia = request.getParameter("dia");
        String mes = request.getParameter("mes");
        String año = request.getParameter("año");
        int numEntero = Integer.parseInt(año);
        
        response.setContentType("tex/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Los datos recibitos son</h1>");
            if(año != null){
            out.println("Sus Edad es: <br>");
                 int edad=2020-numEntero;         
            out.print(edad);
            }
            else
            {                
            out.println("No hay datos para mostrar! ");
            }           
            out.println("</body>");
            out.println("</html>");
            }finally{
            out.close();
        }
 
   }
}
