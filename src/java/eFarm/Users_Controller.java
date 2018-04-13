/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFarm;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "Users_Controller", urlPatterns = {"/Users_Controller"})
public class Users_Controller extends HttpServlet {

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
            
           String _FullNames=request.getParameter("FullNames");
            String _EmpNo=request.getParameter("EmpNo");
            String _Telephone=request.getParameter("Telephone");
            String _Email=request.getParameter("Email");
            String _Password=request.getParameter("Password");
            String _ConfirmPassword=request.getParameter("ConfirmPassword");
            
            String _ExpryDate=request.getParameter("ExpryDate");
            String _DOB=request.getParameter("DOB");
             Date epirydate = (Date) in.parse(_ExpryDate);
              Date dob = (Date) in.parse(_DOB);
            
           
           
            try {
                if(_Password!=null){
                    if(_Password!=null){
                        if(_ConfirmPassword.equals(_Password)){
                         //
                         Users _Users=new Users();
                            _Users.UserName=_Email;     
                            _Users.FullNames=_FullNames;   
                            _Users.EmpNo=_EmpNo;   
                            _Users.Password=_Password;    
                            _Users.ConfirmPassword=_ConfirmPassword;    
//                            _Users.Question ;    
//                            _Users.Answer ;  
//                            _Users.Email =_Email;  
//                            _Users.Telephone=_Telephone ;    
//                            _Users.ExpiryDate=epirydate;    
//                            _Users.IsActive;     
//                            _Users.SuperUser;   
//                            _Users.CCCode;     
//                            _Users.Image ;  
//                            _Users.Terminus=InetAddress.getLocalHost().getHostName();    
//                            _Users.UserID;
                        }else{
                             out.println("Error Password Not Equal To ConfirmPassword| Please Retry Again");
                        }
                    }
                }
            } catch (Exception e) {
                out.println("Errer"+ e.getMessage());
            }
        } catch (ParseException ex) {
            Logger.getLogger(Users_Controller.class.getName()).log(Level.SEVERE, null, ex);
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
