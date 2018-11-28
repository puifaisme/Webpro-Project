package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductVegView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/ProductList.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/css.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n");
      out.write("              crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class='font-moonlight'>\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\" style=\"margin-top: 1%    ;margin-bottom: 1%; \">\r\n");
      out.write("                        <li class=\"nav-item active\" style=\"margin-left: -50px;\">\r\n");
      out.write("                            <a class=\"nav-link\"href=\"index.jsp\">Home\r\n");
      out.write("                                <span class=\"sr-only\">(current)</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"ProductAll\">Products</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"ShowCart\">Cart()</a>\r\n");
      out.write("                        </li>       \r\n");
      out.write("                        <li><form action=\"SearchProduct\" method=\"post\" class=\"form-inline my-2 my-lg-0\" style=\"margin-left: -130px;\">                               \r\n");
      out.write("                                <input type=\"text\" required minlength=\"3\" name=\"productName\" class=\"form-control mr-sm-2 pic-input\" type=\"search\" placeholder=\"Search here ...\" aria-label=\"Search\" style=\"padding-left: 70px;padding-right: 70px;margin-top: -2px;\">\r\n");
      out.write("                                <input type=\"hidden\" value=\"1\" name=\"categoryId\">\r\n");
      out.write("                            </form></li>\r\n");
      out.write("                        <li class=\"nav-item\" style=\"margin-left: -20px;\">\r\n");
      out.write("                            <button class=\"form-control mr-sm-2\" style=\"margin-top: -2px;\">Login</button>\r\n");
      out.write("                        </li>                      \r\n");
      out.write("                    </ul>                      \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <img src=\"Backgroung-Picture/Pic-Veg.jpg\" width='100%'>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"dropbtn\"><img src=\"Icon/arrow.png\" width=\"2%\" class=\"margin-icon\">search by . .</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"ProductFruit\">Fruit</a>\r\n");
      out.write("                    <a href=\"ProductDriedFruit\">Dried Fruit</a>\r\n");
      out.write("                    <a href=\"ProductJuice\">Juice</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"flex-container margin-page\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pV");
    _jspx_th_c_forEach_0.setVarStatus("num");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"font-moonlight-bold margin-product\">\r\n");
          out.write("                        <div><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pV.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"auto\" height=\"200\"></div>\r\n");
          out.write("                        <div class=\"name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pV.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                        <div class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pV.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" BATH / 1 KG</div>\r\n");
          out.write("                        <form action=\"AddToCart\">\r\n");
          out.write("                            <span onclick=\"var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty) & amp; & amp; qty & gt; 1) effect.value--; return false;\">\r\n");
          out.write("                                <img src=\"Icon/minus.png\" width=\"auto\" height=\"30px\">\r\n");
          out.write("                            </span>\r\n");
          out.write("                            <input type=\"quantity\" class=\"\" id=\"qty\" step=\"1\" min=\"1\" max=\"20\" name=\"quantity\" value=\"1\" size=\"3\" style=\"text-align: center\">\r\n");
          out.write("                            <span  onclick=\"var effect = document.getElementById('qty');\r\n");
          out.write("                                    var qty = effect.value;\r\n");
          out.write("                                    if (!isNaN(qty))\r\n");
          out.write("                                        effect.value++;\r\n");
          out.write("                                    return false;\">\r\n");
          out.write("                                <img src=\"Icon/plus.png\" width=\"auto\" height=\"30px\">\r\n");
          out.write("                            </span>\r\n");
          out.write("                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pV.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"proId\">\r\n");
          out.write("                            <div><button type=\"submit\" class=\"btn-success margin-loop\" style=\"\">ADD TO CART</button></div>\r\n");
          out.write("                        </form>             \r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
