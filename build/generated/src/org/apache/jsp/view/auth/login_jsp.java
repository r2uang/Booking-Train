package org.apache.jsp.view.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Đăng Nhập</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"../../style/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div style=\"background: url(../../img/TauCatLinhHaDong.jpg)\" class=\"page-holder bg-cover\">\n");
      out.write("            <header class=\"p-3 bg-dark text-white\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start\">\n");
      out.write("                        <a href=\"/\" class=\"d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none\">\n");
      out.write("                            <svg class=\"bi me-2\" width=\"40\" height=\"32\" role=\"img\" aria-label=\"Bootstrap\">\n");
      out.write("                            <use xlink:href=\"#bootstrap\" />\n");
      out.write("                            </svg>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0\">\n");
      out.write("                            <li><a href=\"#\" class=\"nav-link px-2 text-white\">Home</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"text-end\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-light me-2\">Đăng nhập </button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-warning\">Đăng ký</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"wrapper fadeInDown\">\n");
      out.write("                <div id=\"formContent\">\n");
      out.write("                    <div class=\"fadeIn first\">\n");
      out.write("                        <img style=\"width: 20%; \" src=\"../../img/usericon.png\" id=\"icon\" alt=\"User Icon\" />\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Login Form -->\n");
      out.write("                    <form>\n");
      out.write("                        <input type=\"text\" id=\"login\" class=\"fadeIn second\" name=\"username\" placeholder=\"Tên Đăng Nhập\">\n");
      out.write("                        <input type=\"text\" id=\"password\" class=\"fadeIn third\" name=\"password\" placeholder=\"Mật Khẩu\">\n");
      out.write("                        <input type=\"submit\" class=\"fadeIn fourth\" value=\"Đăng nhập\">\n");
      out.write("                    </form>\n");
      out.write("                    <div id=\"formFooter\">\n");
      out.write("                        Bạn chưa có tài khoản <a class=\"underlineHover\" href=\"#\">Đăng Kí</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
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
