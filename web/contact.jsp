<%-- 
    Document   : contact
    Created on : 09/06/2022, 08:36:58
    Author     : ferbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Save The Woman</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="description">
        <meta content="" name="keywords">
        <link href="assets/img/icon.png" rel="icon">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header id="header" class="fixed-top d-flex align-items-center header-transparent">
            <div class="container d-flex justify-content-between align-items-center">

                <div class="logo">
                    <a href="home.jsp"><img src="assets/img/lo.png" alt="" class="img-fluid"></a>
                </div>

                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="active " href="home.jsp">Início</a></li>
                        <li><a href="ListarTipoDenuncia">Denúncias</a></li>
                        <!--<li><a href="services.html"></a></li>-->
                        <!--<li><a href="team.html">Team</a></li>
                        <li><a href="blog.html">Blog</a></li>-->
                        <li class="dropdown"><a href="#"><span>Contatos importantes</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <li><a>Atendimento a Mulher - 180</a></li>
                                <li><a>Polícia Militar - 190</a></li>
                                <li><a>SAMU - 192</a></li>
                                <li><a>Corpo de Bombeiros - 193</a></li>
                            </ul>
                        </li>
                        <li><a href="contact.jsp">Contatos de emergência</a></li>
                        <li><a href="sobre_nos.jsp">Sobre nós</a></li>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->
            </div>
        </header>
        <main id="main">
            <!-- ======= Contact Section ======= -->
            <section class="breadcrumbs">
                <div class="container">
                    <div class="d-flex justify-content-between align-items-center justify-content-between">
                        <h2>Cadastre seus contatos de emergência</h2>
                        <ol>
                            <li><a href="home.jsp">Início</a></li>
                            <li>Contatos</li>
                        </ol>
                    </div>
                </div>
            </section><!-- End Contact Section -->

            <section>
                <div class="form-group">
                    <form method="post" action="InserirContato" name="frmDadosContato" class="form-horizontal">            
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-md-6 control-label ast">
                                    <p class="help-block">* Campos Obrigatórios</p>
                                </div>
                            </div>
                        </div>
                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-3 control-label">* Nome</label>  
                            <div class="col-md-6">
                                <input class="form-control input-md" type="text" name="nomeContato" value="${Contato.nomeContato}"/>
                            </div>
                        </div>
                        <br>
                        <div class="form-group">
                            <label class="col-md-3 control-label">* Telefone</label>
                            <div class="col-md-2">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                    <input name="numeroContato" class="form-control" placeholder="XX XXXXX-XXXX" type="text" maxlength="13" pattern="\[0-9]{2}\ [0-9]{4,6}-[0-9]{3,4}$"
                                           OnKeyPress="formatar('## #####-####', this)" value="${Contato.numeroContato}">
                                </div>
                            </div>

                        </div>
                        <br>
                        <div class="form-group">
                            <label class="col-md-3 control-label" for="prependedtext">Email</label>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                    <input class="form-control" placeholder="email@email.com" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" value="${Contato.emailContato}">
                                </div>
                            </div>
                        </div>
                        <input type="hidden" name="idContato" value="${Contato.idContato}"/>
                        <br>
                        <div class="form-group">
                            <label class="col-md-3 control-label" for="Cadastrar"></label>
                            <div class="col-md-8">
                                <button id="Confirmar" name="Confirmar" class="btn btn-success" type="Submit">Confirmar</button>
                                <button id="Cancelar" name="Cancelar" class="btn btn-danger" type="Reset">Cancelar</button>
                            </div>
                        </div>
                        
                            <h4 class="fst-italic col-md-7 col-md-offset-5">${mensagem}</h4>
                       
                        <div>
                            <label class="col-md-5"></label>
                            <div class="col-md-4">
                                <button class="btn btn-lg btn-lg active" ><a href="home.jsp">Voltar para a tela inicial</a></button>
                            </div>
                        </div>
                        <br>
                    </form>
                </div>
            </section>
        </main><!-- End #main -->
        <footer id="footer" data-aos="fade-up" data-aos-easing="ease-in-out" data-aos-duration="500">


            <div class="container">
                <div class="copyright">
                    <strong><span>Save The Woman</span></strong>
                </div>
                <div class="credits">
                    Alterado por <strong><span>Fernanda Beltrani</span></strong> 
                </div>
            </div>
        </footer>
        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
                class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/purecounter/purecounter.js"></script>
        <script src="assets/vendor/aos/aos.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="assets/vendor/waypoints/noframework.waypoints.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>
    </body>
</html>
