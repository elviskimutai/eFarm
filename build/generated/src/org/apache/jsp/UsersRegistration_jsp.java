package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UsersRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/UserSignUp.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>User|Registration Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<div class=\"container\">\n");
      out.write("  <form>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <h4>Account</h4>\n");
      out.write("       <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"text\" placeholder=\"Staff No\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"text\" placeholder=\"Full Name\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"email\" placeholder=\"Email Adress\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-envelope\"></i></div>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"number\" placeholder=\"Telephone\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-envelope\"></i></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"password\" placeholder=\"Password\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-key\"></i></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"password\" placeholder=\"Confirm Password\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-key\"></i></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"text\" placeholder=\"Securit Quiz\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"text\" placeholder=\"Answer\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-half\">\n");
      out.write("        <h4>Date of Birth</h4>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <div class=\"col-third\">\n");
      out.write("            <input type=\"text\" placeholder=\"DD\"/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-third\">\n");
      out.write("            <input type=\"text\" placeholder=\"MM\"/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-third\">\n");
      out.write("            <input type=\"text\" placeholder=\"YYYY\"/>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-half\">\n");
      out.write("        <h4>Gender</h4>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <input type=\"radio\" name=\"gender\" value=\"male\" id=\"gender-male\"/>\n");
      out.write("          <label for=\"gender-male\">Male</label>\n");
      out.write("          <input type=\"radio\" name=\"gender\" value=\"female\" id=\"gender-female\"/>\n");
      out.write("          <label for=\"gender-female\">Female</label>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"row\">         \n");
      out.write("        <h4>Is Admin</h4>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <input type=\"checkbox\" id=\"IsAdmin\"/>\n");
      out.write("          <label for=\"is Admin\">Is Admin</label>\n");
      out.write("         \n");
      out.write("        </div>  \n");
      out.write("      </div>\n");
      out.write("       <div class=\"row\">         \n");
      out.write("        <h4>Is Active</h4>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <input type=\"checkbox\" id=\"IsActive\"/>\n");
      out.write("          <label for=\"is Active\">Is Active</label>\n");
      out.write("         \n");
      out.write("        </div>  \n");
      out.write("      </div>\n");
      out.write("<!--    <div class=\"row\">\n");
      out.write("      <h4>Payment Details</h4>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <input type=\"radio\" name=\"payment-method\" value=\"card\" id=\"payment-method-card\" checked=\"true\"/>\n");
      out.write("        <label for=\"payment-method-card\"><span><i class=\"fa fa-cc-visa\"></i>Credit Card</span></label>\n");
      out.write("        <input type=\"radio\" name=\"payment-method\" value=\"paypal\" id=\"payment-method-paypal\"/>\n");
      out.write("        <label for=\"payment-method-paypal\"> <span><i class=\"fa fa-cc-paypal\"></i>Paypal</span></label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group input-group-icon\">\n");
      out.write("        <input type=\"text\" placeholder=\"Card Number\"/>\n");
      out.write("        <div class=\"input-icon\"><i class=\"fa fa-credit-card\"></i></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-half\">\n");
      out.write("        <div class=\"input-group input-group-icon\">\n");
      out.write("          <input type=\"text\" placeholder=\"Card CVC\"/>\n");
      out.write("          <div class=\"input-icon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-half\">\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <select>\n");
      out.write("            <option>01 Jan</option>\n");
      out.write("            <option>02 Jan</option>\n");
      out.write("          </select>\n");
      out.write("          <select>\n");
      out.write("            <option>2015</option>\n");
      out.write("            <option>2016</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>-->\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <h4>Terms and Conditions</h4>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <input type=\"checkbox\" id=\"terms\"/>\n");
      out.write("        <label for=\"terms\">I accept the terms and conditions for signing up to this service, and hereby confirm I have read the privacy policy.</label>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
