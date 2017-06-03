<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/new1.css">
        <script type="text/javascript">
<!--
var timeout       = 100;
var closetimer    = 0;
var ddmenuitem    = 0;

// open hidden layer
function mopen(id)
{
	// cancel close timer
	mcancelclosetime();

	// close old layer
	if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';

	// get new layer and show it
	ddmenuitem = document.getElementById(id);
	ddmenuitem.style.visibility = 'visible';

}
// close showed layer
function mclose()
{
	if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';
}

// go close timer
function mclosetime()
{
	closetimer = window.setTimeout(mclose, timeout);
}

// cancel close timer
function mcancelclosetime()
{
	if(closetimer)
	{
		window.clearTimeout(closetimer);
		closetimer = null;
	}
}

// close layer when click-out
document.onclick = mclose; 
// 
</script>
    </head>
    <body>
        <ul id="sddm">
            <table border="0" align="center">
                <tr>
                    <td>
                    <li><a href="myhome.jsp" >HOME</a>
                    </li>
                    </td>
                    <td>
                    <li><a href="#" onmouseover="mopen('m1')" onmouseout="mclosetime()">COLLECTIONS</a>
                            <div id="m1" onmouseover="mcancelclosetime() " onmouseout="mclosetime() ">
                                <a href="archaeology.jsp">Archaeology</a>
                                <a href="anthropology.jsp">Anthropology</a>
                                <a href="arms.jsp">Arms & Armors</a>
                                <a href="decorative.jsp">Decorative Art</a>
                                <a href="manuscripts.jsp">Manuscripts</a>
                                <a href="epigraphy.jsp">Epigraphy</a>
                                <a href="paintings.jsp">Paintings</a>
                                <a href="western.jsp">Western Art</a>
                            </div>
                    </li>
                    </td>
                    <td>
                    <li><a href="#" onmouseover="mopen('m2')" onmouseout="mclosetime()">EXPLORE</a>
                            <div id="m2" onmouseover="mcancelclosetime() " onmouseout="mclosetime() ">
                                <a href="ground.jsp">Ground Floor</a>
                                <a href="first.jsp">First Floor</a>
                                <a href="second.jsp">Second Floor</a>
                            </div>
                    </li>
                    </td>
                    <td>
                    <li><a href="#" onmouseover="mopen('m4')" onmouseout="mclosetime()">PUBLICATIONS</a>
                            <div id="m4" onmouseover="mcancelclosetime() " onmouseout="mclosetime() ">
                                <a href="gallery.jsp">Gallery</a>
                                <a href="#">Books</a>
                                <a href="#">Bulletins</a>
                            </div>
                    </li>
                    </td>
                    <td>
                    <li><a href="#" onmouseover="mopen('m5')" onmouseout="mclosetime()">EXHIBITIONS</a>
                            <div id="m5" onmouseover="mcancelclosetime() " onmouseout="mclosetime() ">
                                <a href="#">Past</a>
                                <a href="#">Current</a>
                                <a href="#">Upcoming</a>
                            </div>
                    </li>
                    </td>
                    <td>
                    <li><a href="#" onmouseover="mopen('m6')" onmouseout="mclosetime()">ACTS & RULES</a>
                            <div id="m6" onmouseover="mcancelclosetime() " onmouseout="mclosetime() ">
                                <a href="image\RTI_Act.pdf" download>RIGHT TO INFORMATION</a>
                                <a href="cpio.jsp">CENTRAL PUBLIC INFORMATION OFFICERS(CPIOs)</a>
                            </div>
                    </li>
                    </td>
                    <td>
                    <li><a href="#" onmouseover="mopen('m7')" onmouseout="mclosetime()">ABOUT THE MUSEUM</a>
                            <div id="m7" onmouseover="mcancelclosetime() " onmouseout="mclosetime() ">
                                <a href="history.jsp">History</a>
                                <a href="vision.jsp">Vision</a>
                                <a href="library.jsp">Library</a>
                            </div>
                    </li>
                    </td>
                    <td>
                    <li><a href="#" onmouseover="mopen('m8')" onmouseout="mclosetime()">DOWNLOADS</a>
                            <div id="m8" onmouseover="mcancelclosetime() " onmouseout="mclosetime() ">
                                <a href="login.jsp">LOGIN</a>
                            </div>
                    </li>
                    </td>
                </tr>
            </table>
        </ul>
    </body>
</html>
