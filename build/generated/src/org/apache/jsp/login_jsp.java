package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navigation.jsp");
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/new1.css\">\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("var timeout       = 100;\r\n");
      out.write("var closetimer    = 0;\r\n");
      out.write("var ddmenuitem    = 0;\r\n");
      out.write("\r\n");
      out.write("// open hidden layer\r\n");
      out.write("function mopen(id)\r\n");
      out.write("{\r\n");
      out.write("\t// cancel close timer\r\n");
      out.write("\tmcancelclosetime();\r\n");
      out.write("\r\n");
      out.write("\t// close old layer\r\n");
      out.write("\tif(ddmenuitem) ddmenuitem.style.visibility = 'hidden';\r\n");
      out.write("\r\n");
      out.write("\t// get new layer and show it\r\n");
      out.write("\tddmenuitem = document.getElementById(id);\r\n");
      out.write("\tddmenuitem.style.visibility = 'visible';\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("// close showed layer\r\n");
      out.write("function mclose()\r\n");
      out.write("{\r\n");
      out.write("\tif(ddmenuitem) ddmenuitem.style.visibility = 'hidden';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// go close timer\r\n");
      out.write("function mclosetime()\r\n");
      out.write("{\r\n");
      out.write("\tclosetimer = window.setTimeout(mclose, timeout);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// cancel close timer\r\n");
      out.write("function mcancelclosetime()\r\n");
      out.write("{\r\n");
      out.write("\tif(closetimer)\r\n");
      out.write("\t{\r\n");
      out.write("\t\twindow.clearTimeout(closetimer);\r\n");
      out.write("\t\tclosetimer = null;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// close layer when click-out\r\n");
      out.write("document.onclick = mclose; \r\n");
      out.write("// \r\n");
      out.write("</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <ul id=\"sddm\">\r\n");
      out.write("            <table border=\"0\" align=\"center\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"myhome.jsp\" >HOME</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m1')\" onmouseout=\"mclosetime()\">COLLECTIONS</a>\r\n");
      out.write("                            <div id=\"m1\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"archaeology.jsp\">Archaeology</a>\r\n");
      out.write("                                <a href=\"anthropology.jsp\">Anthropology</a>\r\n");
      out.write("                                <a href=\"arms.jsp\">Arms & Armors</a>\r\n");
      out.write("                                <a href=\"decorative.jsp\">Decorative Art</a>\r\n");
      out.write("                                <a href=\"manuscripts.jsp\">Manuscripts</a>\r\n");
      out.write("                                <a href=\"epigraphy.jsp\">Epigraphy</a>\r\n");
      out.write("                                <a href=\"paintings.jsp\">Paintings</a>\r\n");
      out.write("                                <a href=\"western.jsp\">Western Art</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m2')\" onmouseout=\"mclosetime()\">EXPLORE</a>\r\n");
      out.write("                            <div id=\"m2\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"ground.jsp\">Ground Floor</a>\r\n");
      out.write("                                <a href=\"first.jsp\">First Floor</a>\r\n");
      out.write("                                <a href=\"second.jsp\">Second Floor</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m4')\" onmouseout=\"mclosetime()\">PUBLICATIONS</a>\r\n");
      out.write("                            <div id=\"m4\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"gallery.jsp\">Gallery</a>\r\n");
      out.write("                                <a href=\"#\">Books</a>\r\n");
      out.write("                                <a href=\"#\">Bulletins</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m5')\" onmouseout=\"mclosetime()\">EXHIBITIONS</a>\r\n");
      out.write("                            <div id=\"m5\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">Past</a>\r\n");
      out.write("                                <a href=\"#\">Current</a>\r\n");
      out.write("                                <a href=\"#\">Upcoming</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m6')\" onmouseout=\"mclosetime()\">ACTS & RULES</a>\r\n");
      out.write("                            <div id=\"m6\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"image\\RTI_Act.pdf\" download>RIGHT TO INFORMATION</a>\r\n");
      out.write("                                <a href=\"cpio.jsp\">CENTRAL PUBLIC INFORMATION OFFICERS(CPIOs)</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m7')\" onmouseout=\"mclosetime()\">ABOUT THE MUSEUM</a>\r\n");
      out.write("                            <div id=\"m7\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"history.jsp\">History</a>\r\n");
      out.write("                                <a href=\"vision.jsp\">Vision</a>\r\n");
      out.write("                                <a href=\"library.jsp\">Library</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m8')\" onmouseout=\"mclosetime()\">DOWNLOADS</a>\r\n");
      out.write("                            <div id=\"m8\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"login.jsp\">LOGIN</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Yahoo</title>\r\n");
      out.write("    </head>\r\n");
      out.write("        \r\n");
      out.write("    <body >\r\n");
      out.write("        <br>\r\n");
      out.write("        <form name=\"frm\" action=\"check.jsp\" method=\"post\">\r\n");
      out.write("            <table border=\"0\" bgcolor=\"orange\"  align=\"center\"  cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        User Name\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"text\" name=\"uid\" placeholder=\"Name of Employee\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        Password\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"password\" name=\"pwd\" placeholder=\"  \">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                        <input type=\"submit\" value=\"login\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                    \r\n");
      out.write("            </table>\r\n");
      out.write("            </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
