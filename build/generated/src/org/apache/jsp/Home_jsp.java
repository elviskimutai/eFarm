package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>eDairy|HomePage</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\" style=\"background: url('images/Logo1.jpg')no-repeat;background-size: cover; height: 300px;\"></div>\n");
      out.write("        <div class='container-fluid'>\n");
      out.write("            <div class=\"row\">\n");
      out.write("             \n");
      out.write("                       \n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <div class=\"list-group\">\n");
      out.write("                                <a href=\"\" class=\"list-group-item active\">Employees Management</a>\n");
      out.write("                                 <a href=\"\" class=\"list-group-item \">New Member</a>\n");
      out.write("                                  <a href=\"\" class=\"list-group-item \">Members List</a>\n");
      out.write("                                   <a href=\"\" class=\"list-group-item \">Member</a>\n");
      out.write("                                    <a href=\"\" class=\"list-group-item \">New Member</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"list-group\">\n");
      out.write("                                <a href=\"\" class=\"list-group-item active\">Employees Management</a>\n");
      out.write("                                 <a href=\"\" class=\"list-group-item \">New Member</a>\n");
      out.write("                                  <a href=\"\" class=\"list-group-item \">Members List</a>\n");
      out.write("                                   <a href=\"\" class=\"list-group-item \">Member</a>\n");
      out.write("                                    <a href=\"\" class=\"list-group-item \">New Member</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\" style=\"background-color: #3498DB;color:#ffffff;\">\n");
      out.write("                            <h4>Add New Staff</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form class=\"form-group\" action=\"Users_Controller\" method=\"POST\">\n");
      out.write("                                <label>Full Names:</label>\n");
      out.write("                                <input type=\"Text\" class=\"form-control\" name=\"FullNames\">\n");
      out.write("                                 <label>Staff Number:</label>\n");
      out.write("                                <input type=\"Text\" class=\"form-control\" name=\"EmpNo\">\n");
      out.write("                                 <label>Telephone:</label>\n");
      out.write("                                <input type=\"Text\" class=\"form-control\" name=\"Telephone\"><p></p>\n");
      out.write("                                 <label>Email:</label>\n");
      out.write("                                <input type=\"Email\" class=\"form-control\" name=\"Email\"><br>\n");
      out.write("                                 <label>Password:</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"Password\"><br>\n");
      out.write("                                 <label>Confirm Password:</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"ConfirmPassword\"><br>\n");
      out.write("                                  <label>Gender:</label>\n");
      out.write("                                <select class=\"form-control\">\n");
      out.write("                                    <option value=\"Male\">Male</option>\n");
      out.write("                                    <option value=\"Female\">Female</option>\n");
      out.write("                                </select><br>\n");
      out.write("                                 <label>Expiry Date:</label>\n");
      out.write("                                <input type=\"date\" class=\"form-control\" name=\"ExpryDate\"><br>\n");
      out.write("                                 <label>Date of Birth:</label>\n");
      out.write("                                <input type=\"date\" class=\"form-control\" name=\"DOB\"><br>\n");
      out.write("                                 <label>Is Active:</label>\n");
      out.write("                                <input type=\"checkbox\" name=\"IsActive\" value=\"Is Active\" class=\"checkbox-big\"> <br>\n");
      out.write("                                 <label>Is Admin:</label>\n");
      out.write("                                  <input type=\"checkbox\" name=\"IsAdmin\" value=\"Is Admin\" class=\"checkbox-big\"> <br>\n");
      out.write("                                <input type=\"submit\" name=\"\" value=\"Add New Staff\" class=\"btn btn-primary\">\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        <div class=\"col-md-1\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
