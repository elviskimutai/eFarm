package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NavPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>jQuery UI Accordion - Fill space</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <style>\n");
      out.write("  #accordion-resizer {\n");
      out.write("    padding: 10px;\n");
      out.write("    width: 350px;\n");
      out.write("    height: 220px;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("  <script>\n");
      out.write("  $( function() {\n");
      out.write("    $( \"#accordion\" ).accordion({\n");
      out.write("      heightStyle: \"fill\"\n");
      out.write("    });\n");
      out.write(" \n");
      out.write("    $( \"#accordion-resizer\" ).resizable({\n");
      out.write("     //minHeight: 140,\n");
      out.write("      minWidth: 200,\n");
      out.write("      resize: function() {\n");
      out.write("        $( \"#accordion\" ).accordion( \"refresh\" );\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  } );\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("<h3 class=\"docs\">Resize the outer container:</h3>\n");
      out.write(" \n");
      out.write("<div id=\"accordion-resizer\" class=\"ui-widget-content\">\n");
      out.write("  <div id=\"accordion\">\n");
      out.write("    <h3>Home</h3>\n");
      out.write("    <div>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"\" class=\"list-group-item active\">Employees Management</a></li>\n");
      out.write("         <li><a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("          <li><a href=\"\" class=\"list-group-item \">Members List</a></li>\n");
      out.write("          <li> <a href=\"\" class=\"list-group-item \">Member</a></li>\n");
      out.write("          <li>  <a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("            </ul>\n");
      out.write("    </div>\n");
      out.write("    <h3>Users</h3>\n");
      out.write("    <div>\n");
      out.write("        <ul>\n");
      out.write("       <li> <a href=\"\" class=\"list-group-item active\">Employees Management</a></li>\n");
      out.write("       <li>  <a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("      <li>    <a href=\"\" class=\"list-group-item \">Members List</a></li>\n");
      out.write("    <li>       <a href=\"\" class=\"list-group-item \">Member</a></li>\n");
      out.write("    <li>        <a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </div>\n");
      out.write("    <h3>Section 3</h3>\n");
      out.write("    <div>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"\" class=\"list-group-item active\">Employees Management</a></li>\n");
      out.write("         <li><a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("          <li><a href=\"\" class=\"list-group-item \">Members List</a></li>\n");
      out.write("          <li> <a href=\"\" class=\"list-group-item \">Member</a></li>\n");
      out.write("          <li>  <a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("            </ul>\n");
      out.write("      <ul>\n");
      out.write("        <li>List item one</li>\n");
      out.write("        <li>List item two</li>\n");
      out.write("        <li>List item three</li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <h3>Section 4</h3>\n");
      out.write("    <div>\n");
      out.write("      <ul>\n");
      out.write("            <li><a href=\"\" class=\"list-group-item active\">Employees Management</a></li>\n");
      out.write("         <li><a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("          <li><a href=\"\" class=\"list-group-item \">Members List</a></li>\n");
      out.write("          <li> <a href=\"\" class=\"list-group-item \">Member</a></li>\n");
      out.write("          <li>  <a href=\"\" class=\"list-group-item \">New Member</a></li>\n");
      out.write("            </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</body>\n");
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
