
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author silvia
 */
@WebServlet(name = "ejercicio_3", urlPatterns = {"/ejercicio_3"})
public class ejercicio_3 extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    try {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Ejercicio2</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>ejercicio 2</h1>");
        out.print("<form action='' method='post'>");
        out.println("monto:");
        out.println("<input type='double' name='text1' required>");
        out.println("<br><br>");
        out.println("<td>Ingrese el tipo de cambio:</td>");
        out.println("<br><br>");
        out.println("<input type='radio' name='text2' value='bol' checked='false'required>Bolivianos<br>");
        out.println("<input type='radio' name='text2' value='dolar' checked='false' required>Dolares<br>");
        out.println("<br><br>");
        out.println("<td><input type='submit' value='enviar' name='cambiar'></td>");
        out.println("</form>");
        out.println("<br>");
        out.println("</body>");
        out.println("</html>");
        
        }finally{
        out.close();
    
    }
       
   }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
    try {
        double monto=0, tip=6.86, tip2=0.15, resultado=0; 
        String str=request.getParameter("text2");
        monto=Double.parseDouble(request.getParameter("text1"));
        //tip=Double.parseDouble(request.getParameter("text2"));
        //tip2=Double.parseDouble(request.getParameter("text2"));
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>CAMBIO DEL MONTO</title>" );
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>EL MONTO ES :</h1>");
        
        if(str.equals("boliviano")){
            resultado = monto*tip;
        }
        if(str.equals("dolar")){
            resultado = monto*tip2;
        }
        out.println(resultado);
        
        } finally{
        out.close();
        
    }
      
    }

}
