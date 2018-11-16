package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UrbanCartView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Your Shopping Cart</h1>\n");
      out.write("\n");
      out.write("\t<table border=\"1\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>Quantity</th>\n");
      out.write("\t\t\t\t<th>Description</th>\n");
      out.write("\t\t\t\t<th>Price</th>\n");
      out.write("\t\t\t\t<th>Amount</th>\n");
      out.write("\t\t\t\t<th></th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t\t<c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.items}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"li\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<form action=\"<c:url value=\"/cart\"/>\" method=\"GET\">\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"quantity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"prodId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.product.prodId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t<br> <input type=\"submit\" value=\"Update\"></td>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.product.currency}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.currency}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<form action=\"<c:url value=\"/cart\"/>\" method=\"POST\" />\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"Remove Item\" /> <input\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"prodId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.product.prodId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <input\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"quantity\" value=\"0\" /></td>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</c:forEach>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"3\"><b>To change the quantity</b>, enter the new\n");
      out.write("\t\t\t\t\tquantity and click on the Update button.</td>\n");
      out.write("\t\t\t\t<td colspan=\"2\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("\t<form action=\"<c:url value=\"/index.jsp\"/>\" method=\"GET\">\n");
      out.write("\t\t<input type=\"submit\" value=\"Continue Shopping\" />\n");
      out.write("\t</form>\n");
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
