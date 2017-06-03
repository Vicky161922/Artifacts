package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write(" ");

     
 
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <p><strong><u><script>\r\n");
      out.write("\r\n");
      out.write("/*Current date script credit: \r\n");
      out.write("JavaScript Kit (www.javascriptkit.com)\r\n");
      out.write("Over 200+ free scripts here!\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("var mydate=new Date()\r\n");
      out.write("var year=mydate.getYear()\r\n");
      out.write("if (year < 1000)\r\n");
      out.write("year+=1900\r\n");
      out.write("var day=mydate.getDay()\r\n");
      out.write("var month=mydate.getMonth()\r\n");
      out.write("var daym=mydate.getDate()\r\n");
      out.write("if (daym<10)\r\n");
      out.write("daym=\"0\"+daym\r\n");
      out.write("var dayarray=new Array(\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\")\r\n");
      out.write("var montharray=new Array(\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\")\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </script></u></strong></p>\r\n");
      out.write("    \r\n");
      out.write("    <center><table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <img src=\"image/2.jpg\" width=\"60\" height=\"60\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                    <h1><font color=\"white\"><b>&nbsp;NATIONAL MUSEUM OF ANCIENT HISTORY</b></font></h1>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td colspan=\"2\" align=\"right\">\r\n");
      out.write("                    document.write(\"\"+dayarray[day]+\", \"+montharray[month]+\" \"+daym+\", \"+year+\"\")\r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </center>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"orange\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <marquee behavior=\"alternate\">\r\n");
      out.write("        <font size=\"3\" color=\"white\">Artifacts Management System</font>\r\n");
      out.write("    </marquee>\r\n");
      out.write("</body>\r\n");
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
