package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class='font-moonlight'>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light fix col-12 col-md-12\">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto col-8\" style=\"margin-top: 1%    ;margin-bottom: 1%;\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"index.jsp\">Home\n");
      out.write("                                <span class=\"sr-only\">(current)</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"ProductAll\">Products</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"ShowCart\">Cart()</a>\n");
      out.write("                        </li>                                     \n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0 col-4\" style=\"margin-right: 10%\">\n");
      out.write("                                <input minlength=\"3\" class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search here\" aria-label=\"Search\">\n");
      out.write("                                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                            </form> \n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"topicText\">Urban</div>\n");
      out.write("            <div class=\"text\">Fruit & Vegetable</div>\n");
      out.write("            <div>\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <button class=\"topicbtn\">Order Now</button>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <img class=\"pic-margin fit-image\" src=\"css/picture/topic.jpg\" width='100%'>\n");
      out.write("            <div class=\"container margin-last\">\n");
      out.write("                <div class=\"picRow\">\n");
      out.write("                    <img class=\"pic\" src=\"css/picture/vegetable.jpg\">\n");
      out.write("                    <a href=\"ProductVeg\">\n");
      out.write("                        <button class=\"btn1\">Vegetable</button>\n");
      out.write("                    </a>\n");
      out.write("                    <img class=\"pic\" src=\"css/picture/fruit.jpg\">\n");
      out.write("                    <a href=\"ProductFruit\">\n");
      out.write("                        <button class=\"btn2\">Fruit</button>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"picRow\">\n");
      out.write("                    <img class=\"pic\" src=\"css/picture/juice.jpg\">\n");
      out.write("                    <a href=\"ProductJuice\">\n");
      out.write("                        <button class=\"btn4\">Juice</button>\n");
      out.write("                    </a>\n");
      out.write("                    <img class=\"pic\" src=\"css/picture/driedfruit.jpg\">\n");
      out.write("                    <a href=\"ProductDriedFruit\">\n");
      out.write("                        <button class=\"btn3\">Dried Fruit</button>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
