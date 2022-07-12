<%-- 
    Document   : login
    Created on : 11/06/2022, 17:46:30
    Author     : ferbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Save The Woman</title>
        <meta content="" name="description">
        <meta content="" name="keywords">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link href="assets/img/icon.png" rel="icon">
        <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,700,700i&display=swap"
            rel="stylesheet">
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <script>
            $(function () {

                $('#login-form-link').click(function (e) {
                    $("#login-form").delay(100).fadeIn(100);
                    $("#register-form").fadeOut(100);
                    $('#register-form-link').removeClass('active');
                    $(this).addClass('active');
                    e.preventDefault();
                });
                $('#register-form-link').click(function (e) {
                    $("#register-form").delay(100).fadeIn(100);
                    $("#login-form").fadeOut(100);
                    $('#login-form-link').removeClass('active');
                    $(this).addClass('active');
                    e.preventDefault();
                });

            });
        </script>
        <header id="header" class="fixed-top d-flex align-items-center header-transparent">
            <div class="container d-flex justify-content-between align-items-center">

                <div class="logo">
                    <!--<h1 class="text-light"><a href="index.html"><span>Save The Woman</span></a></h1>-->
                    <!-- Uncomment below if you prefer to use an image logo -->
                    <a href="#"><img src="assets/img/lo.png" alt="" class="img-fluid"></a>
                </div>

                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="active " href="#">Início</a></li>
                        <!--<li><a href="services.html"></a></li>-->
                        <!--<li><a href="team.html">Team</a></li>
                        <li><a href="blog.html">Blog</a></li>-->
                        <li class="dropdown"><a href="#"><span>Contatos importantes</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <li><a href="#">Atendimento a Mulher - 180</a></li>
                                <li><a href="#">Polícia Militar - 190</a></li>
                                <li><a href="#">SAMU - 192</a></li>
                                <li><a href="#">Corpo de Bombeiros - 193</a></li>
                            </ul>
                        </li>
                        <li><a href="sobreLogin.jsp">Sobre nós</a></li>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header>
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">
                        <div class="panel panel-login">
                            <div class="panel-heading">
                                <div class="row trans">
                                    <div class="col-xs-6">
                                        <a href="#" class="active" id="login-form-link">Entrar</a>
                                    </div>
                                    <div class="col-xs-6">
                                        <a href="#" id="register-form-link">Cadastre-se</a>
                                    </div>
                                </div>
                                <hr>
                            </div>
                            <br>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <form id="login-form" action="${pageContext.request.contextPath}/LogarUsuario" method="post" role="form" style="display: block;">
                                            <div class="form-group">
                                                <input type="text" name="telefone" tabindex="1" class="form-control" placeholder="Telefone" value="${Usuario.telefone}">
                                                <input type="hidden" name="acao" value="logar">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" name="senha" tabindex="2" class="form-control" placeholder="Senha" value="${Usuario.senha}">
                                            </div>
                                            <br>
                                            <div class="form-group text-center">
                                                <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
                                                <label for="remember">Lembre-me</label>
                                            </div>
                                            <div class="form-group">
                                                <div class="row">
                                                    <div class="col-sm-6 col-sm-offset-3">
                                                        <input type="submit" name="Entrar" id="login-submit" tabindex="4" class="form-control btn-login">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="row">
                                                    <div class="col-lg-12">
                                                        <div class="text-center">
                                                            <a href="#" tabindex="5" class="forgot-password">Esqueceu a senha? </a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                        <form id="register-form" action="InserirUsuario" name = "frmDadosUsuario" method="post" role="form" style="display: none;">
                                            <div class="form-group">
                                                <input type="text" name="nome" tabindex="1" class="form-control" placeholder="Nome" value="${Usuario.nome}">
                                            </div>
                                            <div class="form-group">
                                                <input type="text" name="telefone" tabindex="1" class="form-control" placeholder="Número de telefone" value="${Usuario.telefone}">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" name="senha" tabindex="2" class="form-control" placeholder="Senha" value="${Usuario.senha}">
                                            </div>
                                            <br>
                                            <div class="form-group">
                                                <div class="row">
                                                    <div class="col-sm-6 col-sm-offset-3">
                                                        <input type="submit" name="Cadastrar" id="register-submit" tabindex="4" class="form-control btn-register" value="Cadastrar">
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>            
                        <div  class="col-md-7 col-md-offset-4">
                            <h4 class="fst-italic">${mensagem}</h4>
                        </div>
                </div>
            </div>
        </section>
    </body>
</html>
