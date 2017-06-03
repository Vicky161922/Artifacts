package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navigation.jsp");
    _jspx_dependants.add("/slider.html");
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

      out.write('\n');
      out.write("\r\n");
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
      out.write("    <body background=\"image/3.jpg\">\r\n");
      out.write("        <ul id=\"sddm\">\r\n");
      out.write("            <table border=\"0\" align=\"center\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"navigation.jsp\" >HOME</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m1')\" onmouseout=\"mclosetime()\">COLLECTIONS</a>\r\n");
      out.write("                            <div id=\"m1\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">Archaeology</a>\r\n");
      out.write("                                <a href=\"#\">Anthropology</a>\r\n");
      out.write("                                <a href=\"#\">Arms & Armors</a>\r\n");
      out.write("                                <a href=\"#\">Antiquities</a>\r\n");
      out.write("                                <a href=\"#\">Decorative Art</a>\r\n");
      out.write("                                <a href=\"#\">Manuscripts</a>\r\n");
      out.write("                                <a href=\"#\">Epigraphy</a>\r\n");
      out.write("                                <a href=\"#\">Paintings</a>\r\n");
      out.write("                                <a href=\"#\">Western Art</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m2')\" onmouseout=\"mclosetime()\">EXPLORE</a>\r\n");
      out.write("                            <div id=\"m2\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">Ground Floor</a>\r\n");
      out.write("                                <a href=\"#\">First Floor</a>\r\n");
      out.write("                                <a href=\"#\">Second Floor</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m3')\" onmouseout=\"mclosetime()\">VISITING</a>\r\n");
      out.write("                            <div id=\"m3\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">Visitor's Information</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m4')\" onmouseout=\"mclosetime()\">PUBLICATIONS</a>\r\n");
      out.write("                            <div id=\"m4\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">Gallery</a>\r\n");
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
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m6')\" onmouseout=\"mclosetime()\">ACTS</a>\r\n");
      out.write("                            <div id=\"m6\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">Acts & Rules</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m7')\" onmouseout=\"mclosetime()\">ABOUT THE MUSEUM</a>\r\n");
      out.write("                            <div id=\"m7\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">History</a>\r\n");
      out.write("                                <a href=\"#\">Vision</a>\r\n");
      out.write("                                <a href=\"#\">Photography</a>\r\n");
      out.write("                                <a href=\"#\">Library</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <li><a href=\"#\" onmouseover=\"mopen('m8')\" onmouseout=\"mclosetime()\">USER</a>\r\n");
      out.write("                            <div id=\"m8\" onmouseover=\"mcancelclosetime() \" onmouseout=\"mclosetime() \">\r\n");
      out.write("                                <a href=\"#\">Visitor</a>\r\n");
      out.write("                                <a href=\"#\">Staff</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <br><br><br><br><br>\r\n");
      out.write("        <div id=\"wowslider-container1\">\r\n");
      out.write("            <div class=\"ws_images\"><ul>\r\n");
      out.write("\t\t<li><img src=\"data1/images/img_20150206_115518053.jpg\" alt=\"old home\" title=\"old home\" id=\"wows1_0\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/img_20150207_154307407.jpg\" alt=\"hawa mahal\" title=\"hawa mahal\" id=\"wows1_1\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/img_20150214_232553.jpg\" alt=\"hawa mahal front\" title=\"hawa mahal front\" id=\"wows1_2\"/></li>\r\n");
      out.write("\t\t<li><a href=\"http://wowslider.com\" target=\"_parent\"><img src=\"data1/images/img_20151006_094202962.jpg\" alt=\"bootstrap slider\" title=\"honeycomb\" id=\"wows1_3\"/></a></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/img_20160518_205023925.jpg\" alt=\"meteor\" title=\"meteor\" id=\"wows1_4\"/></li>\r\n");
      out.write("\t</ul></div>\r\n");
      out.write("\t<div class=\"ws_bullets\"><div>\r\n");
      out.write("\t\t<a href=\"#\" title=\"old home\"><span><img src=\"data1/tooltips/img_20150206_115518053.jpg\" alt=\"old home\"/>1</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"hawa mahal\"><span><img src=\"data1/tooltips/img_20150207_154307407.jpg\" alt=\"hawa mahal\"/>2</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"hawa mahal front\"><span><img src=\"data1/tooltips/img_20150214_232553.jpg\" alt=\"hawa mahal front\"/>3</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"honeycomb\"><span><img src=\"data1/tooltips/img_20151006_094202962.jpg\" alt=\"honeycomb\"/>4</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"meteor\"><span><img src=\"data1/tooltips/img_20160518_205023925.jpg\" alt=\"meteor\"/>5</span></a>\r\n");
      out.write("\t</div></div><div class=\"ws_script\" style=\"position:absolute;left:-99%\"><a href=\"http://wowslider.com/vi\">angular slider</a> by WOWSlider.com v8.2</div>\r\n");
      out.write("        <div class=\"ws_shadow\"></div>\r\n");
      out.write("        </div>\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/wowslider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write('\n');

    String userid=request.getParameter("uid");
    String passwd=request.getParameter("pwd");
    //out.print("User Name: "+userid);
    //out.print("Password: "+passwd);
    if(userid.equals(passwd))
    {  // response.sendRedirect("welcome.jsp");
        
      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("welcome.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");

    }   
    else
        response.sendRedirect("sorry.jsp");

      out.write('\n');
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
