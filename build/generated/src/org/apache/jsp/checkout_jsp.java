package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Thanh Toán</title>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Custom Theme files -->\r\n");
      out.write("        <!--theme-style-->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\r\n");
      out.write("        <!--//theme-style-->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \r\n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <!--fonts-->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!--//fonts-->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            jQuery(document).ready(function ($) {\r\n");
      out.write("                $(\".scroll\").click(function (event) {\r\n");
      out.write("                    event.preventDefault();\r\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!--slider-script-->\r\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $(\"#slider1\").responsiveSlides({\r\n");
      out.write("                    auto: true,\r\n");
      out.write("                    speed: 500,\r\n");
      out.write("                    namespace: \"callbacks\",\r\n");
      out.write("                    pager: true,\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!--//slider-script-->\r\n");
      out.write("        <script>$(document).ready(function (c) {\r\n");
      out.write("                $('.alert-close').on('click', function (c) {\r\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\r\n");
      out.write("                        $('.message').remove();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>$(document).ready(function (c) {\r\n");
      out.write("                $('.alert-close1').on('click', function (c) {\r\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\r\n");
      out.write("                        $('.message1').remove();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            Users users = (Users) session.getAttribute("user");
            if (users == null) {
                response.sendRedirect("/shop/login.jsp");
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"account\">\r\n");
      out.write("                    <h2 class=\"account-in\">checkout</h2>\r\n");
      out.write("                    <form action=\"CheckOutServlet\" method=\"POST\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <span>Địa chỉ *</span>\r\n");
      out.write("                            <input type=\"text\" name=\"address\">\r\n");
      out.write("                        </div> \t\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <span>Thanh toán *</span>\r\n");
      out.write("                            <select name=\"payment\">\r\n");
      out.write("                                <option value=\"Bank transfer\"> Ngân hàng chuyển khoản</option>\r\n");
      out.write("                                <option value=\"Live\"> Trả tiền mặt</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div> \t\t\t\r\n");
      out.write("                        <input type=\"submit\" value=\"Checkout\"> \r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
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
}
