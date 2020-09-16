
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio_4", urlPatterns = {"/ejercicio_4"})
public class ejercicio_4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio3</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br>");
            out.println("<center>");
            out.println("<h1>EJERCICIO 3</h1>");
            out.print("<form action='' method='post'>");
            out.println("<table cellspacing=5 colspan=2 rowspa=2 alingn=center>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<input type='radio' name='r1' value='sum' checked='false' required>Suma<br>");
            out.println("<input type='radio' name='r1' value='resta checked='false' required>Resta<br>");
            out.println("<input type='radio' name='r1' value='mul' checked='false'required>Multiplicacion<br>");
            out.println("<input type='radio' name='r1' value='div' checked='false' required>Division<br>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Ingresar primer numero:</td>");
            out.println("<td><input type='text' name='t1'</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Ingresar segundo numero</td>");
            out.println("<td><input type='text' name='t2'</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='submit' name='enviar'></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
           }finally{
            out.close();
            
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String str = request.getParameter("r1");
        String str1 = request.getParameter("t1");
        String str2= request.getParameter("t2");
        String final_output="";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        num1=Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        if(str.equals("sum")){
            num3 =num1+num2;
            final_output= "Suma";
        }
        if(str.equals("resta")){
            num3=num1-num2;
            final_output="Resta";
        }
        if(str.equals("mul")){
            num3 = num1*num2;
            final_output="Multiplicacion";
        }
        if(str.equals("div")){
            num3 = num1/ num2;
            final_output ="Division";
        }
        try{
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<p>");
            printWriter.print("La operacion matematica seleccionada es : ");
            printWriter.println(final_output);
            printWriter.print("<p>");
            printWriter.println("El resultado es :"+num3);
            printWriter.print("<p>");
            }catch(Exception e){
            
        }

        
    }

}
