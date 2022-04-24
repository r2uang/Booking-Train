package org.apache.jsp.view.journeys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dal.StationDBContext;
import dal.StationDBContext;
import model.station.Station;
import model.station.Station;
import model.train.Journey;
import java.util.ArrayList;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 ArrayList<Journey> journeys = (ArrayList<Journey>) request.getAttribute("journeys"); 
      out.write("\n");
      out.write("<table class=\"table\">\n");
      out.write("    <thead class=\"thead-dark\">\n");
      out.write("        <tr>\n");
      out.write("            <th scope=\"col\">Từ</th>\n");
      out.write("            <th scope=\"col\">Tới</th>\n");
      out.write("            <th scope=\"col\">Ngày Khởi Hành</th>\n");
      out.write("            <th scope=\"col\">Giờ Khởi Hành</th>\n");
      out.write("            <th scope=\"col\"></th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for (Journey j : journeys) { 
      out.write("\n");
      out.write("        ");

            Station stationfrom = new StationDBContext().get(j.getJourneys_from_station());
            Station stationto = new StationDBContext().get(j.getJourneys_to_station());
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(stationfrom.getStation_name());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(stationto.getStation_name());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(j.getJourney_date());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(j.getJourney_time());
      out.write("</td>\n");
      out.write("            <td><button type=\"button\" class=\"btn btn-dark\">Đặt vé</button></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
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
