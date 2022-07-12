package org.apache.jsp;

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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("        <title>Save The Woman</title>\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/img/icon.png\" rel=\"icon\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,700,700i&display=swap\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("\n");
      out.write("                $('#login-form-link').click(function (e) {\n");
      out.write("                    $(\"#login-form\").delay(100).fadeIn(100);\n");
      out.write("                    $(\"#register-form\").fadeOut(100);\n");
      out.write("                    $('#register-form-link').removeClass('active');\n");
      out.write("                    $(this).addClass('active');\n");
      out.write("                    e.preventDefault();\n");
      out.write("                });\n");
      out.write("                $('#register-form-link').click(function (e) {\n");
      out.write("                    $(\"#register-form\").delay(100).fadeIn(100);\n");
      out.write("                    $(\"#login-form\").fadeOut(100);\n");
      out.write("                    $('#login-form-link').removeClass('active');\n");
      out.write("                    $(this).addClass('active');\n");
      out.write("                    e.preventDefault();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <header id=\"header\" class=\"fixed-top d-flex align-items-center header-transparent\">\n");
      out.write("            <div class=\"container d-flex justify-content-between align-items-center\">\n");
      out.write("\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <!--<h1 class=\"text-light\"><a href=\"index.html\"><span>Save The Woman</span></a></h1>-->\n");
      out.write("                    <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                    <a href=\"#\"><img src=\"assets/img/lo.png\" alt=\"\" class=\"img-fluid\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a class=\"active \" href=\"#\">Início</a></li>\n");
      out.write("                        <!--<li><a href=\"services.html\"></a></li>-->\n");
      out.write("                        <!--<li><a href=\"team.html\">Team</a></li>\n");
      out.write("                        <li><a href=\"blog.html\">Blog</a></li>-->\n");
      out.write("                        <li class=\"dropdown\"><a href=\"#\"><span>Contatos importantes</span> <i class=\"bi bi-chevron-down\"></i></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Atendimento a Mulher - 180</a></li>\n");
      out.write("                                <li><a href=\"#\">Polícia Militar - 190</a></li>\n");
      out.write("                                <li><a href=\"#\">SAMU - 192</a></li>\n");
      out.write("                                <li><a href=\"#\">Corpo de Bombeiros - 193</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"sobreLogin.jsp\">Sobre nós</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("                </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                        <div class=\"panel panel-login\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row trans\">\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <a href=\"#\" class=\"active\" id=\"login-form-link\">Entrar</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <a href=\"#\" id=\"register-form-link\">Cadastre-se</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-12\">\n");
      out.write("                                        <form id=\"login-form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogarUsuario\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" name=\"telefone\" tabindex=\"1\" class=\"form-control\" placeholder=\"Telefone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                <input type=\"hidden\" name=\"acao\" value=\"logar\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"password\" name=\"senha\" tabindex=\"2\" class=\"form-control\" placeholder=\"Senha\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.senha}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"form-group text-center\">\n");
      out.write("                                                <input type=\"checkbox\" tabindex=\"3\" class=\"\" name=\"remember\" id=\"remember\">\n");
      out.write("                                                <label for=\"remember\">Lembre-me</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                                        <input type=\"submit\" name=\"Entrar\" id=\"login-submit\" tabindex=\"4\" class=\"form-control btn-login\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-lg-12\">\n");
      out.write("                                                        <div class=\"text-center\">\n");
      out.write("                                                            <a href=\"#\" tabindex=\"5\" class=\"forgot-password\">Esqueceu a senha? </a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                        <form id=\"register-form\" action=\"InserirUsuario\" name = \"frmDadosUsuario\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" name=\"nome\" tabindex=\"1\" class=\"form-control\" placeholder=\"Nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" name=\"telefone\" tabindex=\"1\" class=\"form-control\" placeholder=\"Número de telefone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"password\" name=\"senha\" tabindex=\"2\" class=\"form-control\" placeholder=\"Senha\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.senha}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                                        <input type=\"submit\" name=\"Cadastrar\" id=\"register-submit\" tabindex=\"4\" class=\"form-control btn-register\" value=\"Cadastrar\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>            \n");
      out.write("                        <div  class=\"col-md-7 col-md-offset-4\">\n");
      out.write("                            <h4 class=\"fst-italic\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
