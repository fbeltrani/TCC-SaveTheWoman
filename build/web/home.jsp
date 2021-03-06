<!-- 
    Document   : home
    Created on : 08/06/2022, 22:44:41
    Author     : ferbe
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.savethewoman.model.TipoDenuncia"%>
<%@page import="java.util.List"%>
<%@page import="br.com.savethewoman.dao.TipoDenunciaDAOImpl"%>
<%@page import="br.com.savethewoman.dao.GenericDAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <link rel="shortcut icon" href="icon.png" >

        <link href="assets/css/style.css" rel="stylesheet">
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top d-flex align-items-center header-transparent">
            <div class="container d-flex justify-content-between align-items-center">

                <div class="logo">
                    <!--<h1 class="text-light"><a href="index.html"><span>Save The Woman</span></a></h1>-->
                    <!-- Uncomment below if you prefer to use an image logo -->
                    <a href="home.jsp"><img src="assets/img/lo.png" alt="" class="img-fluid"></a>
                </div>

                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="active " href="home.jsp">In??cio</a></li>
                        <li><a href="ListarTipoDenuncia">Denuncias</a></li>
                        <!--<li><a href="services.html"></a></li>-->
                        <!--<li><a href="team.html">Team</a></li>
                        <li><a href="blog.html">Blog</a></li>-->
                        <li class="dropdown"><a href="#"><span>Contatos importantes</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <li><a href="#">Atendimento a Mulher - 180</a></li>
                                <li><a href="#">Pol??cia Militar - 190</a></li>
                                <li><a href="#">SAMU - 192</a></li>
                                <li><a href="#">Corpo de Bombeiros - 193</a></li>
                            </ul>
                        </li>
                        <li><a href="contact.jsp">Contatos de emerg??ncia</a></li>
                        <li><a href="sobre_nos.jsp">Sobre n??s</a></li>
                        <li><a href="${pageContext.request.contextPath}/LogarUsuario?acao=logout">Sair</a></li>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header><!-- End Header -->

        <!-- ======= Hero Section ======= -->
        <section id="hero" class="d-flex justify-cntent-center align-items-center">
            <div id="heroCarousel" class="container carousel carousel-fade" data-bs-ride="carousel" data-bs-interval="5000">
                
                <!-- Slide 1 -->
                <div class="carousel-item active">
                    <div class="carousel-container">
                        <h2 class="animate__animated animate__fadeInDown">Seja bem vinda(o) ${usuario.nome}</h2>
                        <br>
                        <br>
                        <h2 class="animate__animated animate__fadeInDown">Efetue denuncias em situa????es de viol??ncia<span></span></h2>
                        <h5 class="animate__animated animate__fadeInUp">Realize denuncias an??nimas em situa????es de emerg??ncia sem precisar se identificar</h5>
                        <br>
                        <a href="ListarTipoDenuncia" class="btn-get-started animate__animated animate__fadeInUp">Saiba mais</a>
                    </div>
                </div>

                <!-- Slide 2 -->
                <div class="carousel-item">
                    <div class="carousel-container">
                        <h2 class="animate__animated animate__fadeInDown">Cadastre os contatos de pessoas confi??veis</h2>
                        <h5 class="animate__animated animate__fadeInUp">V?? para a ??rea "Contatos de Emerg??ncia" e cadastre os n??meros para ficarem
                            dispon??veis de forma r??pida e f??cil</h5>
                        <br>
                        <a href="contact.jsp" class="btn-get-started animate__animated animate__fadeInUp">Saiba mais</a>
                    </div>
                </div>

                <!-- Slide 3 -->
                <div class="carousel-item">
                    <div class="carousel-container">
                        <h2 class="animate__animated animate__fadeInDown">Bot??o SOS</h2>
                        <h5 class="animate__animated animate__fadeInUp">Ao clicar no campo SOS, ser?? emitido um chamado para a
                            delegacia mais pr??xima,</h5>
                        <h5 class="animate__animated animate__fadeInUp">ou ent??o para um contato j?? salvo, sendo disponibilizado a sua localiza????o em tempo real</h5>
                        <br>
                        <a href="#" class="btn-get-started animate__animated animate__fadeInUp">Saiba mais</a>
                    </div>
                </div>

                <a class="carousel-control-prev" href="#heroCarousel" role="button" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon bx bx-chevron-left" aria-hidden="true"></span>
                </a>

                <a class="carousel-control-next" href="#heroCarousel" role="button" data-bs-slide="next">
                    <span class="carousel-control-next-icon bx bx-chevron-right" aria-hidden="true"></span>
                </a>

            </div>
        </section><!-- End Hero -->

        <main id="main">
            <section class="services ">
                <div class="container alinhar">
                    <div class="section-title">
                        <h2>Funcionalidades dispon??veis</h2>
                    </div>
                    <div class="row align-items-center">
                        <div class="col-md-6 col-lg-3 d-flex align-items-stretch" data-aos="fade-up">
                            <div class="icon-box icon-box-pink">
                                <h4 class="title"><a href="ListarTipoDenuncia">??rea de Den??ncias</a></h4>
                                <p class="description">Efetue den??ncias garantindo sua privacidade e seguran??a</p>
                            </div>
                        </div>

                        <div class="col-md-6 col-lg-3 d-flex align-items-stretch" data-aos="fade-up" data-aos-delay="100">
                            <div class="icon-box icon-box-cyan">
                                <h4 class="title"><a href="contact.jsp">Contatos de Emerg??ncia</a></h4>
                                <p class="description">Atrav??s desses contatos, voc?? poder?? acionar um alerta em casos de emerg??ncia</p>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3 d-flex align-items-stretch" data-aos="fade-up" data-aos-delay="200">
                            <div class="icon-box icon-box-blue">
                                <h4 class="title"><a href="">Bot??o SOS</a></h4>
                                <p class="description">Funcionabilidade a ser implementada, onde ser?? poss??vel emitir um chamado para uma delegacia pr??xima, ou ent??o, enviar a localiza????o para um contato cadastrado</p>
                            </div>
                        </div>
                        

                        <div class="col-md-6 col-lg-3 d-flex align-items-stretch" data-aos="fade-up" data-aos-delay="200">
                            <div class="icon-box icon-box-green">
                                <h4 class="title"><a href="sobre_nos.jsp">Sobre N??s</a></h4>
                                <p class="description">Nessa aba, voc?? ficar?? sabendo o motivo do sistema ter sido desenvolvido</p>
                            </div>
                        </div>

                    </div>

                </div>
            </section>
            <!-- ======= Features Section ======= -->
            <section class="features">
                <div class="container">

                    <div class="section-title">
                        <h2>Saiba mais sobre o assunto</h2>
                        <h5 class="fst-italic">... Em 2021, o Brasil registrou um estupro a cada 10 minutos e um feminic??dio a cada 7 horas...</h5>
                    </div>
                    <div class="row" data-aos="fade-up">
                        <div class="col-md-5">
                            <img src="assets/img/fem.jpg" class="img-fluid" alt="">
                        </div>
                        <div class="col-md-7 pt-4">
                            <h2>Feminic??dio</h2>
                            <br>
                            <h5 class="fst-italic">
                                O feminic??dio se refere ao crime de assassinato contra mulheres que s??o cometidos em raz??o ao g??nero da v??tima.
                            </h5> <br>
                            <h6 class="fst-italic">
                                <p>O Brasil est?? na 5?? posi????o entre os pa??ses com maiores ??ndices de feminic??dio. Diante toda essa situa????o, foi criada a Lei do Feminic??dio, que ?? considerada em duas situa????es:</p>
                                <p>Viol??ncia Dom??stica ou familiar, onde o autor do crime j?? manteve algum tipo de la??o afetivo com a v??tima e tamb??m, em situa????es de menosprezo ou discrimina????o, resultado da discrimina????o de g??nero, sendo manifestado pela objetifica????o da mulher, onde o autor pode ser conhecido ou n??o da v??tima.</p> 
                            </h6>
                        </div>
                    </div>

                    <div class="row" data-aos="fade-up">
                        <div class="col-md-5 order-1 order-md-2">
                            <img src="assets/img/protesto.jpg" class="img-fluid" alt="">
                        </div>
                        <div class="col-md-7 pt-5 order-2 order-md-1">
                            <h2>Estupro</h2>
                            <br>
                            <h5 class="fst-italic">
                                Foram registrados 56.098 boletins de ocorr??ncia de estupros, incluindo vulner??veis, apenas do g??nero feminino. A taxa m??dia de estupros e estupros de vulner??veis foi de 51,8 para cada 100 mil habitantes do sexo feminino.
                            </h5> <br>
                            <h6>
                                Em 12 estados a taxa ficou acima da m??dia nacional em 2021, apresentando um resultado preocupante. 
                            </h6>
                        </div>
                    </div>
                </div>
            </section><!-- End Features Section -->

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer" data-aos="fade-up" data-aos-easing="ease-in-out" data-aos-duration="500">
            <div class="container">
                <div class="copyright">
                    <strong><span>Save The Woman</span></strong> 
                </div>
                <div class="credits">
                    Alterado por <strong><span>Fernanda Beltrani e Joyce Emanuelle</span></strong>
                </div>
            </div>
        </footer><!-- End Footer -->

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
