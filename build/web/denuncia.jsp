<%-- 
    Document   : denuncia
    Created on : 09/06/2022, 16:41:13
    Author     : ferbe
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Denuncias</title>
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
                    <!--<h1 class="text-light"><a href="index.html"><span>Save The Woman</span></a></h1>-->
                    <!-- Uncomment below if you prefer to use an image logo -->
                    <a href="home.jsp"><img src="assets/img/lo.png" alt="" class="img-fluid"></a>
                </div>

                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="active " href="home.jsp">Início</a></li>
                        <li><a href="#">Denuncias</a></li>
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
                        <li><a href="contact.jsp">Contatos de emergência</a></li>
                        <li><a href="sobre_nos.jsp">Sobre nós</a></li>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header>
        <main>
            <section class="breadcrumbs">
                <div class="container">
                    <div class="d-flex justify-content-between align-items-center justify-content-between">
                        <h2>Área de Denuncias</h2>
                        <ol>
                            <li><a href="home.jsp">Início</a></li>
                            <li>Denuncias</li>
                        </ol>
                    </div>
                </div>
            </section> 
            <br>
            <form method="post" action="InserirDenuncia" name="frmDadosDenuncia" class="form-horizontal">            
                <div class="panel-body">
                    <div class="form-group">
                        <div class="col-md-6 control-label ast">
                            <p class="help-block">* Campos Obrigatórios</p>
                        </div>
                    </div>
                </div>
                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-3 control-label" for="prependedtext">Nome da Vítima</label>
                    <div class="col-md-2">
                        <div class="input-group">
                            <input class="form-control" type="text" name="nomeVitima" value="${Denuncia.nomeVitima}" >
                        </div>
                    </div>

                    <label class="col-md-2 control-label" for="prependedtext">Nome do Agressor</label>
                    <div class="col-md-2">
                        <div class="input-group">
                            <input class="form-control" type="text" name="nomeAgressor" value="${Denuncia.nomeAgressor}"/>
                        </div>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="col-md-3 control-label" for="Nome">* Descrição</label>  
                    <div class="col-md-6">
                        <input class="form-control input-md" type="text" name="descricaoDenuncia" placeholder="Adicione detalhes como o endereço, rua, cep etc" value="${Denuncia.descricaoDenuncia}"/>
                    </div>
                </div>
                <br>
                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-3 control-label" for="Nome">* Relate o que aconteceu</label>  
                    <div class="col-md-6">
                        <input class="form-control input-md" type="text" name="relatoDenuncia" placeholder="Conte com detalhes a situação que presenciou" value="${Denuncia.relatoDenuncia}"/>
                    </div>
                </div>
                <br>
                <!-- Prepended text-->
                <div class="form-group">
                    <label class="col-md-3 control-label" for="prependedtext">Data que ocorreu</label>
                    <div class="col-md-2">
                        <div class="input-group">
                            <input class="form-control" type="date" name="dataDenuncia" placeholder="DD/MM/AAAA" value="${Denuncia.dataDenuncia}" >
                        </div>
                    </div>

                    <label class="col-md-2 control-label" for="prependedtext">Horário que ocorreu</label>
                    <div class="col-md-2">
                        <div class="input-group">
                            <input class="form-control" type="time" name="horaDenuncia"value="${Denuncia.horaDenuncia}"/>
                        </div>
                    </div>
                </div> 
                <br>
                <br>
                <div class="form-group">
                    <label class="col-md-3 control-label" for="selectbasic">Tipo da Denuncia *</label>
                    <div class="col-md-2">
                        <select class="form-control" name="idTipoDe">
                            <c:forEach var="TipoDenuncia" items="${listaTipoDenuncia}">
                                <option value="${TipoDenuncia.idTipoDe}">${TipoDenuncia.nomeTipoDe}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <label class="col-md-2 control-label" for="encaminhamento">Se identifica como vítima? *</label>
                    <div class="col-md-2">
                        <div class="input-group">
                            <span class="input-group-addon">     
                                <label class="radio-inline" for="radios-0">
                                    <input type="radio" name="enc" id="enc" value="N" onclick="desabilita('enc_instituicao')">
                                    Não
                                </label> 
                                <label class="radio-inline" for="radios-1">
                                    <input type="radio" name="enc" id="enc" value="S" onclick="habilita('enc_instituicao')">
                                    Sim
                                </label>
                            </span>
                        </div>
                    </div>
                    <input class="boton1" type="hidden" name="idDenuncia" value="${Denuncia.idDenuncia}"/>
                </div>
                <div class="form-group"> 
                    <br>
                    <br>
                    <div class="form-group">
                        <label class="col-md-3 control-label" for="Cadastrar"></label>
                        <div class="col-md-8">
                            <button id="Confirmar" name="Confirmar" class="btn btn-success" type="Submit">Confirmar</button>
                            <button id="Cancelar" name="Cancelar" class="btn btn-danger" type="Reset">Cancelar</button>
                        </div>
                    </div><div class="fst-italic col-md-7 col-md-offset-5">
                        <h4 class="fst-italic">${mensagem}</h4>
                    </div>
                    <br>
                    <div>
                        <label class="col-md-5"></label>
                        <div class="col-md-4">
                            <button class="btn-lg btn-lg active" ><a href="home.jsp">Voltar para a tela inicial</a></button>
                        </div>
                        <br>
                    </div>                    
                </div>
            </form>
            <div class="form-group">

            </div>

        </main>
        <footer id="footer" data-aos="fade-up" data-aos-easing="ease-in-out" data-aos-duration="500">


            <div class="container">
                <div class="copyright">
                    <strong><span>Save The Woman</span></strong>
                </div>
                <div class="credits">
                    Alterado por <strong><span>Fernanda Beltrani e Joyce Emanuelle</span></strong> 
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