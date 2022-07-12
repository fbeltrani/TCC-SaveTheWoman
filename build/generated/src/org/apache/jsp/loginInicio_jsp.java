package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginInicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,700,700i&display=swap\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\" class=\"fixed-top d-flex align-items-center header-transparent\">\n");
      out.write("            <div class=\"container d-flex justify-content-between align-items-center\">\n");
      out.write("\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <!--<h1 class=\"text-light\"><a href=\"index.html\"><span>Save The Woman</span></a></h1>-->\n");
      out.write("                    <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                    <a href=\"home.jsp\"><img src=\"assets/img/lo.png\" alt=\"\" class=\"img-fluid\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a class=\"active \" href=\"#\">Início</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Denuncias</a></li>\n");
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
      out.write("                        <li><a href=\"login.jsp\">Contatos de emergência</a></li>\n");
      out.write("                        <li><a href=\"portfolio.html\">Sobre nós</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("                </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("                    <section id=\"hero\" class=\"d-flex justify-cntent-center align-items-center\">\n");
      out.write("            <div id=\"heroCarousel\" class=\"container carousel carousel-fade\" data-bs-ride=\"carousel\" data-bs-interval=\"5000\">\n");
      out.write("\n");
      out.write("                <!-- Slide 1 -->\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <div class=\"carousel-container\">\n");
      out.write("                        <h2 class=\"animate__animated animate__fadeInDown\">Efetue denuncias garantindo sua segurança<span></span></h2>\n");
      out.write("                        <p class=\"animate__animated animate__fadeInUp\">Efetue denuncias anônimas em situações de emergência!</p>\n");
      out.write("                        <a href=\"login.jsp\" class=\"btn-get-started animate__animated animate__fadeInUp\">Saiba mais</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Slide 2 -->\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <div class=\"carousel-container\">\n");
      out.write("                        <h2 class=\"animate__animated animate__fadeInDown\">Cadastre os contatos de pessoas confiáveis</h2>\n");
      out.write("                        <p class=\"animate__animated animate__fadeInUp\">Vá para a área \"Anjos\" e cadastre os números para ficarem\n");
      out.write("                            disponíveis de forma rápida e fácil</p>\n");
      out.write("                        <a href=\"login.jsp\" class=\"btn-get-started animate__animated animate__fadeInUp\">Saiba mais</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Slide 3 -->\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <div class=\"carousel-container\">\n");
      out.write("                        <h2 class=\"animate__animated animate__fadeInDown\">Acione o botão SOS para chamar ajuda de uma autoridade!</h2>\n");
      out.write("                        <p class=\"animate__animated animate__fadeInUp\">Ao clicar no campo SOS, será emitido um chamado para a\n");
      out.write("                            delegacia mais próxima, sendo disponibilizado a sua localização no momento dessa ação</p>\n");
      out.write("                        <a href=\"login.jsp\" class=\"btn-get-started animate__animated animate__fadeInUp\">Saiba mais</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon bx bx-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon bx bx-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section><!-- End Hero -->\n");
      out.write("\n");
      out.write("        <!-- Vendor JS Files -->\n");
      out.write("        <script src=\"assets/vendor/purecounter/purecounter.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/aos/aos.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/waypoints/noframework.waypoints.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Main JS File -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
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
