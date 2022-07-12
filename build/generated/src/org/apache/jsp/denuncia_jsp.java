package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class denuncia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Denuncias</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("        <link href=\"assets/img/icon.png\" rel=\"icon\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
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
      out.write("                        <li><a class=\"active \" href=\"home.jsp\">Início</a></li>\n");
      out.write("                        <li><a href=\"#\">Denuncias</a></li>\n");
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
      out.write("                        <li><a href=\"contact.jsp\">Contatos de emergência</a></li>\n");
      out.write("                        <li><a href=\"sobre_nos.jsp\">Sobre nós</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("                </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <section class=\"breadcrumbs\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"d-flex justify-content-between align-items-center justify-content-between\">\n");
      out.write("                        <h2>Área de Denuncias</h2>\n");
      out.write("                        <ol>\n");
      out.write("                            <li><a href=\"home.jsp\">Início</a></li>\n");
      out.write("                            <li>Denuncias</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section> \n");
      out.write("            <br>\n");
      out.write("            <form method=\"post\" action=\"InserirDenuncia\" name=\"frmDadosDenuncia\" class=\"form-horizontal\">            \n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-md-6 control-label ast\">\n");
      out.write("                            <p class=\"help-block\">* Campos Obrigatórios</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Text input-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\" for=\"prependedtext\">Nome da Vítima</label>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"nomeVitima\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Denuncia.nomeVitima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <label class=\"col-md-2 control-label\" for=\"prependedtext\">Nome do Agressor</label>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"nomeAgressor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Denuncia.nomeAgressor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\" for=\"Nome\">* Descrição</label>  \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input class=\"form-control input-md\" type=\"text\" name=\"descricaoDenuncia\" placeholder=\"Adicione detalhes como o endereço, rua, cep etc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Denuncia.descricaoDenuncia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <!-- Text input-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\" for=\"Nome\">* Relate o que aconteceu</label>  \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input class=\"form-control input-md\" type=\"text\" name=\"relatoDenuncia\" placeholder=\"Conte com detalhes a situação que presenciou\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Denuncia.relatoDenuncia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <!-- Prepended text-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\" for=\"prependedtext\">Data que ocorreu</label>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"form-control\" type=\"date\" name=\"dataDenuncia\" placeholder=\"DD/MM/AAAA\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Denuncia.dataDenuncia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <label class=\"col-md-2 control-label\" for=\"prependedtext\">Horário que ocorreu</label>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"form-control\" type=\"time\" name=\"horaDenuncia\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Denuncia.horaDenuncia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-3 control-label\" for=\"selectbasic\">Tipo da Denuncia *</label>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <select class=\"form-control\" name=\"idTipoDe\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <label class=\"col-md-2 control-label\" for=\"encaminhamento\">Se identifica como vítima? *</label>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <span class=\"input-group-addon\">     \n");
      out.write("                                <label class=\"radio-inline\" for=\"radios-0\">\n");
      out.write("                                    <input type=\"radio\" name=\"enc\" id=\"enc\" value=\"N\" onclick=\"desabilita('enc_instituicao')\">\n");
      out.write("                                    Não\n");
      out.write("                                </label> \n");
      out.write("                                <label class=\"radio-inline\" for=\"radios-1\">\n");
      out.write("                                    <input type=\"radio\" name=\"enc\" id=\"enc\" value=\"S\" onclick=\"habilita('enc_instituicao')\">\n");
      out.write("                                    Sim\n");
      out.write("                                </label>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <input class=\"boton1\" type=\"hidden\" name=\"idDenuncia\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Denuncia.idDenuncia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-md-3 control-label\" for=\"Cadastrar\"></label>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <button id=\"Confirmar\" name=\"Confirmar\" class=\"btn btn-success\" type=\"Submit\">Confirmar</button>\n");
      out.write("                            <button id=\"Cancelar\" name=\"Cancelar\" class=\"btn btn-danger\" type=\"Reset\">Cancelar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div>\n");
      out.write("                        <label class=\"col-md-5\"></label>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <button class=\"btn-lg btn-lg active\" ><a href=\"home.jsp\">Voltar para a tela inicial</a></button>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div>\n");
      out.write("                    <h4 class=\"fst-italic\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                </div>\n");
      out.write("                    </div>                    \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        <footer id=\"footer\" data-aos=\"fade-up\" data-aos-easing=\"ease-in-out\" data-aos-duration=\"500\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"copyright\">\n");
      out.write("                    <strong><span>Save The Woman</span></strong>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"credits\">\n");
      out.write("                    Alterado por <strong><span>Fernanda Beltrani e Joyce Emanuelle</span></strong> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i\n");
      out.write("                class=\"bi bi-arrow-up-short\"></i></a>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("TipoDenuncia");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaTipoDenuncia}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${TipoDenuncia.idTipoDe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${TipoDenuncia.nomeTipoDe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
