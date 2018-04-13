
package eFarm;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String _UserName=request.getParameter("txtUsername");
            String _Password=request.getParameter("txtPassword");
            try {
                if(_UserName!=null){
                    if(_Password!=null){
                        if(_UserName.equals("KIM") && _Password.equals("123")){
                           // response.sendRedirect("Home.jsp");
                            response.sendRedirect("Home.jsp");
                        }else{
                             out.println("Login Failled| Please Retry Again");
                        }
                    }
                }
            } catch (Exception e) {
                out.println("Errer"+ e.getMessage());
            }
            
        }
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
