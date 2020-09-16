
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio_6", urlPatterns = {"/ejercicio_6"})
public class ejercicio_6 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio_6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Matriz Caraciol</h1>");
            String numero=request.getParameter("numero");
            out.print("<form action='' method='post'>");
            out.println("Numero:");
            out.println("<input type='text' name='numero' required >");
            out.println("<br><br>");
            out.println("<input type='submit' value='procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
    }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String str=request.getParameter("numero");
        int n=Integer.parseInt(str);
        int n2=n;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out=response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>matriz</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1> Matriz Caracol N-."+n+ "</h1>");
            int x=1;
            int[][] caracol = new int [n + 1][n+1];
            for(int a=1;a<=n/2;a++){
                for (int i=a;i<=n-a;i++){
                    caracol[a][i]=x;
                    x++;
                }
                for(int i=a;i<=n-a;i++){
                    caracol[i][n-a+1]=x;
                    x++;
                }
                for(int i=n-a+1;i>=a+1 ;i--){
                    caracol[n-a+1][i]=x;
                    x++;                     
                }
                for(int i=n-a+1;i>=a+1;i--){
                caracol[i][a]=x;
                x++;
                }

            }
            if(n%2==1){
                caracol[n/2+1][n/2+1]=x;
            }
            out.println("<table border='2' cellspacing='0'>");
            for(int i=1; i<=n2;i++){
                
                out.println("<tr>");
            for(int j=1;j<=n2;j++){
                out.println("<td>"+caracol[i][j]+"</td>");
            }
             out.println("</tr>");
        }

            out.println("</table>");
            out.println("</center>");
     }
    }

 }

