package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navigation.jsp");
    _jspx_dependants.add("/slider.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write('\n');
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <div id=\"wowslider-container1\">\r\n");
      out.write("<div class=\"ws_images\"><ul>\r\n");
      out.write("\t\t<li><img src=\"data1/images/anthro2.jpg\" alt=\"\" title=\"\" id=\"wows1_0\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/anthro3.jpg\" alt=\"\" title=\"\" id=\"wows1_1\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/anthro6.jpg\" alt=\"\" title=\"\" id=\"wows1_2\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/anthro12.jpg\" alt=\"\" title=\"\" id=\"wows1_3\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/anthro14.jpg\" alt=\"\" title=\"\" id=\"wows1_4\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/arch12.jpg\" alt=\"\" title=\"\" id=\"wows1_5\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/arch13.jpg\" alt=\"\" title=\"\" id=\"wows1_6\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/arms1.jpg\" alt=\"\" title=\"\" id=\"wows1_7\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/arms4.jpg\" alt=\"\" title=\"\" id=\"wows1_8\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/arms9.jpg\" alt=\"\" title=\"\" id=\"wows1_9\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/arms11.jpg\" alt=\"\" title=\"\" id=\"wows1_10\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor1.jpg\" alt=\"\" title=\"\" id=\"wows1_11\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor3.jpg\" alt=\"\" title=\"\" id=\"wows1_12\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor4.jpg\" alt=\"\" title=\"\" id=\"wows1_13\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor5.jpg\" alt=\"\" title=\"\" id=\"wows1_14\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor7.jpg\" alt=\"\" title=\"\" id=\"wows1_15\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor8.jpg\" alt=\"\" title=\"\" id=\"wows1_16\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor9.jpg\" alt=\"\" title=\"\" id=\"wows1_17\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor10.jpg\" alt=\"\" title=\"\" id=\"wows1_18\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/decor11.jpg\" alt=\"\" title=\"\" id=\"wows1_19\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/epig1.jpg\" alt=\"\" title=\"\" id=\"wows1_20\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/epig2.jpg\" alt=\"\" title=\"\" id=\"wows1_21\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/epig3.jpg\" alt=\"\" title=\"\" id=\"wows1_22\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/epig4.jpg\" alt=\"\" title=\"\" id=\"wows1_23\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/epig5.jpg\" alt=\"\" title=\"\" id=\"wows1_24\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/epig6.jpg\" alt=\"\" title=\"\" id=\"wows1_25\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/epig8.jpg\" alt=\"\" title=\"\" id=\"wows1_26\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/manu1.jpg\" alt=\"\" title=\"\" id=\"wows1_27\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/manu2.jpg\" alt=\"\" title=\"\" id=\"wows1_28\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/manu4.jpg\" alt=\"\" title=\"\" id=\"wows1_29\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting1.jpg\" alt=\"\" title=\"\" id=\"wows1_30\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting4.jpg\" alt=\"\" title=\"\" id=\"wows1_31\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting5.jpg\" alt=\"\" title=\"\" id=\"wows1_32\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting6.jpg\" alt=\"\" title=\"\" id=\"wows1_33\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting7.jpg\" alt=\"\" title=\"\" id=\"wows1_34\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting8.jpg\" alt=\"\" title=\"\" id=\"wows1_35\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting9.jpg\" alt=\"\" title=\"\" id=\"wows1_36\"/></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/painting10.jpg\" alt=\"\" title=\"\" id=\"wows1_37\"/></li>\r\n");
      out.write("\t\t<li><a href=\"http://wowslider.net\"><img src=\"data1/images/western.jpg\" alt=\"jquery slideshow\" title=\"\" id=\"wows1_38\"/></a></li>\r\n");
      out.write("\t\t<li><img src=\"data1/images/western3.jpg\" alt=\"\" title=\"\" id=\"wows1_39\"/></li>\r\n");
      out.write("\t</ul></div>\r\n");
      out.write("\t<div class=\"ws_bullets\"><div>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/anthro2.jpg\" alt=\"\"/>1</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/anthro3.jpg\" alt=\"\"/>2</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/anthro6.jpg\" alt=\"\"/>3</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/anthro12.jpg\" alt=\"\"/>4</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/anthro14.jpg\" alt=\"\"/>5</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/arch12.jpg\" alt=\"\"/>6</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/arch13.jpg\" alt=\"\"/>7</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/arms1.jpg\" alt=\"\"/>8</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/arms4.jpg\" alt=\"\"/>9</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/arms9.jpg\" alt=\"\"/>10</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/arms11.jpg\" alt=\"\"/>11</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor1.jpg\" alt=\"\"/>12</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor3.jpg\" alt=\"\"/>13</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor4.jpg\" alt=\"\"/>14</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor5.jpg\" alt=\"\"/>15</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor7.jpg\" alt=\"\"/>16</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor8.jpg\" alt=\"\"/>17</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor9.jpg\" alt=\"\"/>18</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor10.jpg\" alt=\"\"/>19</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/decor11.jpg\" alt=\"\"/>20</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/epig1.jpg\" alt=\"\"/>21</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/epig2.jpg\" alt=\"\"/>22</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/epig3.jpg\" alt=\"\"/>23</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/epig4.jpg\" alt=\"\"/>24</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"epig5\"><span><img src=\"data1/tooltips/epig5.jpg\" alt=\"epig5\"/>25</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"epig6\"><span><img src=\"data1/tooltips/epig6.jpg\" alt=\"epig6\"/>26</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"epig8\"><span><img src=\"data1/tooltips/epig8.jpg\" alt=\"epig8\"/>27</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/manu1.jpg\" alt=\"\"/>28</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/manu2.jpg\" alt=\"\"/>29</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/manu4.jpg\" alt=\"\"/>30</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting1.jpg\" alt=\"\"/>31</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting4.jpg\" alt=\"\"/>32</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting5.jpg\" alt=\"\"/>33</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting6.jpg\" alt=\"\"/>34</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting7.jpg\" alt=\"\"/>35</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting8.jpg\" alt=\"\"/>36</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting9.jpg\" alt=\"\"/>37</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/painting10.jpg\" alt=\"\"/>38</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/western.jpg\" alt=\"\"/>39</span></a>\r\n");
      out.write("\t\t<a href=\"#\" title=\"\"><span><img src=\"data1/tooltips/western3.jpg\" alt=\"\"/>40</span></a>\r\n");
      out.write("\t</div></div><div class=\"ws_script\" style=\"position:absolute;left:-99%\"><a href=\"http://wowslider.com/vi\">slideshow jquery</a> by WOWSlider.com v8.2</div>\r\n");
      out.write("<div class=\"ws_shadow\"></div>\r\n");
      out.write("</div>\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/wowslider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
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
