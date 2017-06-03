package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class archaeology_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body background=\"image/3.jpg\">\r\n");
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
      out.write("                                <a href=\"#\">RIGHT TO INFORMATION</a>\r\n");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/new.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <td>\n");
      out.write("        <h1>Archaeology</h1>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                   <div style=\"width:900px; float:left; text-align:justify;font-size: 20px;\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#Harappan1\" style=\"font-size:14px;\">Harappan Collection</a></li>\n");
      out.write("                <li><a href=\"#Maurya\" style=\"font-size:14px;\">Maurya, Shunga and Satavahana Collection</a></li>\n");
      out.write("                <li><a href=\"#Kushana\" style=\"font-size:14px;\">Kushana Collection</a></li>\n");
      out.write("                <li><a href=\"#Gupta-Art\" style=\"font-size:14px;\">Gupta Art Collection</a></li>\n");
      out.write("                <li><a href=\"#Early-Medieval\" style=\"font-size:14px;\">Early Medieval Sculpture Collection</a></li>\n");
      out.write("                <li><a href=\"#Late-Medieval\" style=\"font-size:14px;\">Late Medieval Sculpture Collection</a></li>\n");
      out.write("                <li><a href=\"#Bronze\" style=\"font-size:14px;\">Bronze Collection</a></li>\n");
      out.write("                <li><a href=\"#Buddhist\" style=\"font-size:14px;\">Buddhist Art Collection</a></li>\n");
      out.write("            </ul> \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <td colspan=\"2\" align=\"right\">\n");
      out.write("            <img src=\"image/archaeology.png\" alt=\"\" border=\"2\" />\n");
      out.write("            </td>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("            \n");
      out.write("            <h2><a name=\"Harappan1\"></a>Harappan  Collection</h2><img src=\"image/arch13.jpg\" alt=\"\" border=\"2\" /><br><br>\n");
      out.write("            <p>The first gallery on the ground floor of  National Museum is called the Harappan gallery. The collections in this gallery  grew out of the discoveries of the pioneering excavations made during early  20th century, and later after the Indian independence in 1947. The Harappan  civilization is believed to be one of the oldest world civilizations together  with Egypt and Mesopotamia. Objects in this gallery remain the richest and most  important of their kind in the world. </p>\n");
      out.write("            <p>The Harappan civilization developed along  the mighty river, Indus and for that reason it is also known as the Indus  Valley Civilization. Most of the exhibits in this gallery come from important  centers of the Harappan Civilization and ancient towns like Harappa, Mohenjodaro,  Nal (now in present-day Pakistan), Dholavira, Kalibangan, Lothal and Rakhigarhi  (in India). </p>\n");
      out.write("            <p>The Harappan civilization is identified as  a Bronze-age civilization because many objects have been found that are made up  of copper based alloys.&nbsp; For example, the  gallery displays the famous &lsquo;dancing girl,&rsquo; a bronze figurine that provides an  insight into the advances made in art and metallurgy, as well as the hairstyle  and ornaments prevalent during the period. The gallery depicts the comparative  chronology of four major Bronze Age civilizations in 3rd millennium B.C.E.  which existed simultaneously across the world. It also shows the major Harappan  sites and representation of the layout of a street from Dholavira which, gives  the visitor a picture of the urban civilization that flourished during the  time.</p>\n");
      out.write("            <p>The Harappan civilization produced many  seals, a representation of which is displayed in the gallery. A remarkable seal  depicts a man in &lsquo;yogic&rsquo; posture, surrounded by animals, leading to the  speculation that this could be &lsquo;Pashupati&rsquo;, an early form of Shiva. Many of the  seals have inscriptions, the characters and symbols in a language that has not  yet been deciphered. These seals give useful information about the civilization  of Indus Valley and can be seen in different geometrical shapes.</p>\n");
      out.write("            <p> There are also a few famous examples of the  Harappan terracotta figurines. These offer the most intimate insight into the  people of Harappan age, since many of the representations seem to have been  taken from daily life. Another remarkable collection is the variety of toys,  animal-like objects and household implements.</p>\n");
      out.write("            <p>Weights made of Chert in different shapes  and of different denominations are exhibited in one of the wall cases. Some  well- shaped bronze tools and elaborate jewellery of semi-precious stones are  also displayed in other showcases. Polished stone pillars are on show to  present an idea of how these stones, made up of parts, were used in  architecture &ndash; a unique feature of Harappan masonry.</p>\n");
      out.write("            <p>The gallery has on display a range of  pottery, representing individual regional styles in terms of both forms and  vessel types. These include offering stands, goblets, beakers, tumblers,  perforated jars and vases. The remarkable pottery from Nal (3000 B.C.E.) is  displayed in a separate showcase. Nal pottery is particularly known for its  polychrome ware, which is of high technical and artistic quality. The pottery  is made on potters&rsquo; wheel, well fired and is adorned with geometrical patterns  made intricately with fine lines, parallels and concentric circles.</p>\n");
      out.write("            <p>A skeleton excavated from Rakhigarhi (in  present day Haryana) is on display in the gallery. Objects placed with this  skeleton in the burial indicate that the Harappans believed in afterlife. The  pottery items placed in the grave unearthed from cemetery H in Harappa reveal  the funerary customs prevalent during the period. Post-cremation burials are  inferred from urns having wide-open mouths; two such specimens are on display.&nbsp; </p>\n");
      out.write("            <p>The wealth and variety of the exhibits  offer both a comprehensive idea and evidence of continuity of the Indian  cultural legacy.</p>\n");
      out.write("            \n");
      out.write("            <h2><a name=\"Maurya\"></a>Maurya,  Shunga and Satavahana Collection</h2><img src=\"image/arch8.jpg\" alt=\"\" border=\"2\" /><br>\n");
      out.write("            <p>The Mauryan Empire thrived from 322 B.C.E.  to 185 B.C.E. and its first king was Chandragupta Maurya who ruled from  Patliputra (present-day Patna). The expanse of the Mauryan empire was very  large- from Himalayas in the North, to present-day Assam in the East, to  Baluchistan in the West, stretching to the South eastern parts of Iran and much  of what is now Afghanistan, including the modern Herat and Kandhar provinces. </p>\n");
      out.write("            <p>During the Mauryan period, and particularly  during the reign of the Great Emperor Asoka (270 to 232 B.C.E.) and with his  embrace of Buddhism, which became the predominant religion during the time, Buddhist  influence in the sculptures became visible. Asoka erected many Pillars topped  by famous sculptures of animals, mostly lions, of which six survive around  India, carrying his edicts. Mauryan art is represented both in court art as  well as popular art. While the tall stone pillars and their decorative capitals  represent court art, examples of popular art may be seen in sculptures like the  Deedarganj Yakshi which now in the Patna Museum in Bihar. Mauryan sculptures  were executed in red spotted sandstone (quarried from Mathura) and the close  grained buff coloured sandstone (quarried from Chunar). Mauryan sculptures are  significant for their large scale, robust and fully formed figures and the  unique glaze like polish that provides a sophisticated finish to the  sculptures.</p>\n");
      out.write("            <p>The Mauryan period was followed by the  Shunga period (2nd-1st century B.C.E.), during which a simpler style was  adopted. The sculptures of Shunga period were used primarily to decorate Stupas  ( mound shaped architectural edifices that usually housed the relics of Buddha  or were erected in the memory of Buddha and great Buddhist teachers) at Bodh  Gaya (in Bihar), Bharhut and Sanchi (in Madhya Pradesh). These depict life  scenes of Buddha or the Jatakas- tales based on stories of Buddha&rsquo;s previous  births. Folk deities like Yaksha, Yakshi and Salabhanjika are also common  figures found in Shunga art.</p>\n");
      out.write("            <p>In the Deccan, the patronage of Satavahana  kings supported by lay disciples produced a large number of rock-cut caves.  Important structures like Stupas were built at Amaravati and Ghantasala, both  of which are represented here through some remarkable specimens. The narrative  quality of the stories and the creativity apparent in the fantastically  sculpted capitals and cornices make these masterpieces of Buddhist art. The  Satavahanas added four gateways to the railing of the Great Stupa at Sanchi, in  present day Madhya Pradesh, which was enlarged during the Shunga period. Two  sculptures exhibited in the gallery belong to the gateway of Sanchi, which convey  the grandeur of the Sanchi Stupa and its importance in Satvahana society.</p>\n");
      out.write("            \n");
      out.write("            <h2><a name=\"Kushana\"></a>Kushana  Collection</h2><img src=\"image/arch5.jpg\" alt=\"\" border=\"2\" /><br><br>\n");
      out.write("            <p>The Kushana gallery represents three  overlapping styles of Indian art - Mathura, Gandhara and Ikshvaku. These styles  flourished together from 1st to 3rd century C.E. This was a period of immense  profusion of visual art, particularly under the influence of Buddhism. Buddha  was represented in human form for the first time. Earlier to this he was  depicted through symbols such as the Bodhi Tree and the Lotus.&nbsp; Images of most of the Hindu and Jaina deities  were also depicted in human form for the first time during this period. </p>\n");
      out.write("            <p>The main centers of artistic activity under  the Kushanas were the regions of Gandhara and Mathura, each of which developed  its own distinct style. While Mathura art was indigenous, the art of Gandhara  evolved under the Greco-Roman influence, as evident from the iconography, form  and costumes of sculptures.&nbsp; Mathura  artists used locally available spotted red sandstone, while the Gandharan artists  selected the local greyish schist. The artists of Mathura supplied images to  all the prevalent faiths, in and around Mathura and also to distant places  whereas artists from Gandhara concentrated mostly on Buddhist subjects. </p>\n");
      out.write("            <p>At the far end of this gallery, a few  Kushana sculptures in red mottled sandstone stand representative of this  school. Among the Gandharan sculptures are the youthful Buddha and Maitreya  (future Buddha) images, and a few sculptures depicting scenes from the Buddha&rsquo;s  life besides a large number of stucco images and portraits.</p>\n");
      out.write("            <p>In the Mathura sculptures, the female  figures are voluptuous and sensuous, as seen in the famous &lsquo;Bacchanalian Scene&rsquo;  from Maholi where the courtesan Vasantsena seems to have been portrayed drunk  and losing control on her senses. The four faced (chaturmukha) Shivalinga and  the pot-bellied image of Kubera from Ahichchhatra are noteworthy examples of  Mathura art. Besides these, a large fragment of tympanum presents the Buddha in  human form as well as his worship through symbols side by side.</p>\n");
      out.write("            <p>Among the Jaina images, Ayagapata (stone  tablet for offering homage), a fragmentary tympanum from Kankali Tila (a famous  Jaina site in Mathura in present-day Uttar Pradesh), provide an overview of the  Jaina art of Mathura.</p>\n");
      out.write("            <p>The Ikshvaku artists of the 3rd century  carried forward the legacy of the Satavahana art and created some of the most  beautiful sculptures with the same greenish limestone to adorn Shaiva shrines  and Buddhist Stupas and Chaityagrihas as the ones at Nagarjunakonda  (present-day Andhra Pradesh).&nbsp; A large  number of casing slabs for covering the dome of the Stupa were carved. Since no  Stupa has been found intact in South India, these serve as models to visualize  the original stupa that once existed. The most important work on display is a  casing slab depicting&nbsp; scenes from the  life of the Buddha &ndash; birth, casting of horoscope, child Siddhartha being  welcomed by the guardians of four quarters, Saint Asita&rsquo;s visit to King  Suddhodhana and the visit of child Siddhartha to the tutelary deity.</p>\n");
      out.write("            \n");
      out.write("            <h2><a name=\"Gupta-Art\"></a>Gupta  Art Collection</h2><img src=\"image/arch7.jpg\" alt=\"\" border=\"2\" /><br><br>\n");
      out.write("            <p>The Gupta gallery takes us to the golden  era of Indian art (4th - 6th century C.E.) in which, under the enlightened  patronage of the Gupta rulers, Indian art attained classic perfection in human,  faunal as well as floral forms and set the standard of artistic creation for  the coming centuries. Highly animate, youthful and expressive, the divine  beings are often represented with a circular halo and decorated with circular  floral bands. The major centres of artistic activities during this period were  Mathura and Sarnath. </p>\n");
      out.write("            <p>Several new iconographic images emerged in  the Gupta period, owing to the evolution and development of religious thought  and iconography. For example, a Nataraja from Nachana appears to be the  earliest image of dancing Shiva. Ekamukha Shivalinga from Khoh is another  masterpiece of this gallery. Yet another rare image is of the Chaturmukhi Surya  which is a Shivalinga with four figures representing Brahma, Vishnu, Shiva and  Surya. The image of Vishnu, displayed in the gallery, is known for its&nbsp; grace, beauty and artistic perfection. Also  on display in this gallery are several panels from Deogarh in Uttar Pradesh,  which depict stories from the Ramayana and Mahabharata. The Buddha images from  Sarnath are remarkable for the diaphanous drapery, a major characteristic  feature of the Sarnath School. </p>\n");
      out.write("            <p>A large number of terracotta figures have  been found in places such as Mathura, Ahichchhatra, Bhitargaon and Kaushambi.  Like the stone sculptures, the terracotta figures are also notable for their  suppleness of movement, benign expression and perfect proportion. Nearly  life-size images of Ganga and Yamuna displayed in the Early Medieval Gallery  are unparalleled in the realm of Indian terracotta art. Similarly, the  terracotta plaques depicting stories from the Mahabharata present the most  eloquent examples of this art in the gallery.</p>\n");
      out.write("            <p>The legacy of Gupta art was adopted and  further developed by the Maitraka rulers of Vallabhi in Gujarat (6th to 8th  century C.E.) whose sculptures are delicately modelled in soft bluish green  stone. A few of them are on display in this gallery.</p>\n");
      out.write("            \n");
      out.write("            <h2><a name=\"Early-Medieval\"></a>Early  Medieval Sculpture Collection</h2><img src=\"image/arch2.jpg\" alt=\"\" border=\"2\" /><br><br>\n");
      out.write("            <p>The disintegration of the Gupta Empire  towards the end of the 6th century C.E. resulted in the growth of regional  offshoots of art such as the emergence of local powers like the Palas in the  East, Maitrakas in the West, Vardhanas and Pratiharas in the North and  Pallavas, Chalukyas and Cholas in the South. The art of this period is  characterized by elongation of the human form, a distinct sharpness in facial  features, an increase in ornamentation and formal postures.</p>\n");
      out.write("            <p>This gallery presents selected examples of  various art-styles which flourished simultaneously in different regions during  this period. A number of Pratihara sculptures are on view but the lintel from  Chittorgarh, (in present-day Rajasthan) depicting the images of the Navagrahas  (nine planets), shows the stylized depiction adopted during this period in wood  carving. Vishwarupa Vishnu (Vishnu shown in his all-encompassing form) of the  Maitrakas, though mutilated and completely weathered gives an impression of the  monumentality of these sculptures. An image of the river Goddess Ganga,  standing on a crocodile is a magnificent representation of Rashtrakuta art from  the Ellora Caves.</p>\n");
      out.write("            <p>Some magnificent and exquisite temples were  built under the patronage of Western Chalukyan emperors at Badami, Aihole and  Pattadakal (all in present day Karnataka). The plaques from Aihole depicting a  pair of flying celestials are displayed in the foyer and the inner rotunda in  the ground floor of the museum.</p>\n");
      out.write("            <p>The Pallavas and the Cholas were great  patrons of art and temple architecture. A number of Pallava and early Chola  sculptures are on view here; Soma-skanda, the depiction of the Holy Family of  Shiva, Parvati and their son Kartikeya and images of Vishnu are particularly  noteworthy in their craftsmanship and expression.</p>\n");
      out.write("            \n");
      out.write("            <h2><a name=\"Late-Medieval\"></a>Late  Medieval Sculpture Collection</h2><img src=\"image/arch6.jpg\" alt=\"\" border=\"2\" /><br><br>\n");
      out.write("            <p>Regional powers like the Palas and the  Senas in the East, the Cholas, Hoysalas, Vijayanagar rulers and Nayakas in the  South and the Gahadavalas, Paramaras and Chandelas in the North continued to  encourage the temple art and architecture in India. </p>\n");
      out.write("            <p>A number of temples were built in and  around the region of present day Bhubaneswar in Odisha. The famous Sun Temple  of Konark was built during the 13th century C.E. by king Narasimhadeva. The  sculptures of Konark are marked by intense movement, perfect sculptural rhythm  and clearly defined features. A beautiful image of Surya is displayed in this  gallery and the four portraits in stone of the king Narasimhadeva engaged in  activities such as archery, worship and discussion with his courtiers are the  prized exhibits in this gallery. These are particularly special since the art  of portraiture was not very common in those days.</p>\n");
      out.write("            <p>The Chandellas commissioned the  construction of the outstanding temples at Khajuraho. A beautiful image of  Yogasana Vishnu from the Khajuraho region (present-day Madhya Pradesh) on  display is testimony to the superb skills of the artists.</p>\n");
      out.write("            <p>The artists who worked under the patronage  of the Paramars, Gahadavalas and Chahamanas also produced some delightful  sculptures known for their wood-like carvings. An image of Durga on display  here is a masterpiece of Paramara art. The bust of Vajra Tara is an excellent  example of Gahadavala art. </p>\n");
      out.write("            <p>In eastern India, the Pala and Sena artists  adorned a number of stone slabs with minute, delicate and jewel-like carving of  figures of gods and goddesses. A few of these sculptures done on dark basalt  stone, mostly Buddhist stele, are on show.</p>\n");
      out.write("            <p>In Western India, under the influence of  Jain patrons, beautiful temples were erected. The best examples of their  architecture are seen in the temples at Mount Abu and Ranakpur in Rajasthan.  The exquisite marble image of Saraswati from Pallu, Bikaner belonging to the  Chahamanas is on display in the foyer.</p>\n");
      out.write("            <p>The temples with sculptural wealth of the  South were built largely due to the patronage of the Hoysala kings at Helebid,  Belur and Somnathpur in Karnataka. This gallery has some of the rarest and most  admirable sculptures, belonging to the Hoysalas, including portrait of a  huntress, an image of Kaliya Krishna and others which are as intricately  detailed as if they had been worked in gold instead of stone. The highly  decorative 12th century Hoysala sculpture of Lakshami Narayan is of superb  sculptural quality.</p>\n");
      out.write("            <p>The Cholas were great builders of temples  in the South. Among the large number of Chola sculptures of 10th and 11th  centuries C.E. on display in this gallery, one image of Shiva in Lingodhbhava  form and another Jain deity of Parshvanatha are known for their unique concepts  and form. Though the tradition continued during the Vijayanagar period, it  emerged as an individual style and lacked the vivacity of the earlier styles.</p>\n");
      out.write("            \n");
      out.write("            <h2>\n");
      out.write("            <a name=\"Bronze\"></a>Bronze  Collection</h2><img src=\"image/arch4.jpg\" alt=\"\" border=\"2\" /><br><br>\n");
      out.write("            <p>A selection from the collection of bronzes  of the museum is on show in the Bronzes gallery. The art of bronze casting  reveals the high level of technical excellence of artisans in the field of  metallurgy in ancient India. From the Harappan civilization, the lost-wax  process (Madhucchista Vidhana) has been used in casting bronze artworks. A  number of images belonging to Shunga, Kushana and Ikshvaku periods have been  discovered. However, it was the Gupta period which witnessed the casting of  metal images on a large scale and the art form spread to other regions. </p>\n");
      out.write("            <p>Four Buddha images from Phophnar, Madhya  Pradesh known for their excellence are on display here.&nbsp; The Pala bronzes from 8th to 10th century,  mainly Buddhist in theme are from Nalanda in Bihar. The bronzes from the Himalayan  region, especially those belonging to Kashmir and Himachal Pradesh, represent  Northern India. While Svachchhanda Bhairavi introduces the skill of the metal  smith of Chamba and Vishnu Vaikuntha testifies to the high level of  craftsmanship of Kashmiri artists. Selected Nepalese and Tibetan bronzes are  also on view. The image of Vasudeva-Kamalja (half Vishnu and half Lakshmi)  displayed here is a superb example of Nepalese bronze art and iconography. </p>\n");
      out.write("            <p>Bronzes from South India demonstrate the  high level of development of the art form, and there are objects dating from  the 6th to 18th century in the collection. A large number of images of Hindu  gods and goddess were produced at this time. Shiva Nataraja is a unique  creation, combining artistic vision and technical knowledge to perfection.&nbsp; Many forms of Shiva such as Uma- Maheshwara,  Alingana-murti, Chandrashekhara, Tripurantaka, Nandikeshvara were depicted and  these forms have been displayed to enable a comparative study.&nbsp;&nbsp; Pallava and Chola artisans also created  diverse forms of Vishnu, the most popular being Kaliya Krishna, Balagopala and  Nrityagopala.</p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <h2><a name=\"Buddhist\"></a>Buddhist  Art Collection</h2><img src=\"image/arch9.jpg\" alt=\"\" border=\"2\" /><br><br>\n");
      out.write("            <p>Moving beyond chronological or style based  displays, the Buddhist Art Gallery was set up in 1990 as the first thematic  gallery of the museum. All the three major schools of Buddhism &ndash; Hinayana,  Mahayana and Vajrayana - are represented here. The gallery presents a large  number of images of Buddhist deities.</p>\n");
      out.write("            <p>The development of Indian Buddhist art is  reflected in the sculptures ranging from 2nd century B.C.E. to 12th century C.E.  The Hinayana phase is covered by three sculptures presenting the worship of  symbols and Jataka narrations, namely the adoration of the Turban, Buddha-pada  and Chhadanta Jataka. The Mahayana phase produced some of the most beautiful  Buddha and Bodhisattva images.</p>\n");
      out.write("            <p>The bronze image of Buddha from Phophnar  kept at the altar and Buddha head from Sarnath are magnificent examples of  Buddhist art. Similarly, a slab depicting scenes from Buddha&rsquo;s life is also of  special interest in this gallery. The Vajrayana phase is marked with a number  of tantrik divinities like Marichi, Chunda, Tara, Manjushri, Simhanada and  Lokeshvara. Important Buddhist sites like Sarnath, Nalanda, Bharhut and&nbsp; Nagarjunakonda are also represented&nbsp; in the gallery.</p>\n");
      out.write("            <p>Buddhism did not remain confined to India.  While the beautiful silk paintings and stucco heads in the gallery remind us of  the spread of Buddhism in Central Asia, the popularity of the Buddhist faith in  South-East Asia is evident from the bronze images of Maitreya and  Avalokiteshvara created in that region. The larger than life image of the  Buddha head from Java is an impressive sculpture in this gallery. Tibet and  Nepal are represented here by Thangkas (scroll- paintings) based on Buddhist  themes. A modern Buddha image in wood with gold wash from Myanmar is an added  attraction.</p>\n");
      out.write("            <p>Objects from the monasteries of Arunachal  Pradesh, Ladakh, Tibet and Tawang are exhibited on a reconstructed altar of a  Buddhist Shrine.&nbsp;&nbsp; Some typical objects  are charm boxes, prayer wheels, brass bell, bone trumpet ambrosia (ritual  container) and the wheel of law. Since the works of art are mainly produced for  offering at the altar by devotees, they reflect the superb workmanship of the  devoted craftsman. </p>\n");
      out.write("            <p>The focal point of this gallery is the  display of the relics believed to be of Lord Buddha. In 1898, an excavation was  carried out on a mound at Piprahwa, in Uttar Pradesh, which yielded caskets  with fragments of bone, along with ornaments, figures and precious stones. The  inscription on a casket speaks of the relics of Lord Buddha. The Archaeological  Survey of India conducted further excavations at the site from 1971 to 1977,  resulting in the discovery of two more caskets in soapstone, containing more  sacred bone relics. The site has been identified with ancient Kapilavastu, the  home town of Buddha Sakyamuni. These objects are of great reverence to Buddhist  pilgrims, and the Museum gets hundreds of visitors of Buddhist faith from all  over the world who come to this room to pay homage and venerate the relics.</p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("        </div>\n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <script>\n");
      out.write("            function printpage()\n");
      out.write("            {\n");
      out.write("                window.print();\n");
      out.write("            }\n");
      out.write("                </script><center> <input type=\"button\" value=\"PRINT\" onclick=\"printpage()\"/></center>\n");
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
