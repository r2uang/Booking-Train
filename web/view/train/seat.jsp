<%-- 
    Document   : seat
    Created on : Dec 12, 2021, 10:06:23 AM
    Author     : Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="../../style/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div style="background: url(${pageContext.request.contextPath}/img/TauCatLinhHaDong.jpg)" class="page-holder bg-cover">
            <header class="p-3 bg-dark text-white">
                <div class="container">
                    <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                        <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                            <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap">
                            <use xlink:href="#bootstrap" />
                            </svg>
                        </a>
                        <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                            <li><a class="nav-link px-2 text-white">Trang chủ</a></li>
                        </ul>
                        <a href="auth/login.jsp"></a>
                        <!--                        <div class="text-end">
                                                    <a type="button" class="btn btn-outline-light me-2" href="${requestScope.login_href}">${requestScope.login_href_value}</a> 
                                                    <a type="button" class="btn btn-warning" href="${requestScope.register_href}" ${requestScope.register_href == "" ? "hidden" : ""}>${requestScope.register_href_value}</a>
                                                    <a type="button" class="btn btn-warning" href="${requestScope.logout_href}" ${requestScope.logout_href == "" ? "hidden" : ""}>${requestScope.logout_href_value}</a>
                                                </div>-->
                    </div>
                </div>
            </header>
            <div class="plane">
                <h2 style="text-align: center">Đặt vé</h2><br/>
                <div class="exit exit--front fuselage">
                </div>

                <ol class="cabin fuselage">
                    <li class="row row--1">
                        <ol class="seats" type="A">
                            <li class="seat">
                                <input type="checkbox" id="1A" />
                                <label for="1A">1A</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="1B" />
                                <label for="1B">1B</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="1C" />
                                <label for="1C">1C</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="1D" />
                                <label for="1D">1D</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="1E" />
                                <label for="1E">1E</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="1F" />
                                <label for="1F">1F</label>
                            </li>
                        </ol>
                    </li>
                    <li class="row row--2">
                        <ol class="seats" type="A">
                            <li class="seat">
                                <input type="checkbox" id="2A" />
                                <label for="2A">2A</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="2B" />
                                <label for="2B">2B</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="2C" />
                                <label for="2C">2C</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="2D" />
                                <label for="2D">2D</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="2E" />
                                <label for="2E">2E</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="2F" />
                                <label for="2F">2F</label>
                            </li>
                        </ol>
                    </li>
                    <li class="row row--3">
                        <ol class="seats" type="A">
                            <li class="seat">
                                <input type="checkbox" id="3A" />
                                <label for="3A">3A</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="3B" />
                                <label for="3B">3B</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="3C" />
                                <label for="3C">3C</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="3D" />
                                <label for="3D">3D</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="3E" />
                                <label for="3E">3E</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="3F" />
                                <label for="3F">3F</label>
                            </li>
                        </ol>
                    </li>
                    <li class="row row--4">
                        <ol class="seats" type="A">
                            <li class="seat">
                                <input type="checkbox" id="4A" />
                                <label for="4A">4A</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="4B" />
                                <label for="4B">4B</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="4C" />
                                <label for="4C">4C</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="4D" />
                                <label for="4D">4D</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="4E" />
                                <label for="4E">4E</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="4F" />
                                <label for="4F">4F</label>
                            </li>
                        </ol>
                    </li>
                    <li class="row row--5">
                        <ol class="seats" type="A">
                            <li class="seat">
                                <input type="checkbox" id="5A" />
                                <label for="5A">5A</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="5B" />
                                <label for="5B">5B</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="5C" />
                                <label for="5C">5C</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="5D" />
                                <label for="5D">5D</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="5E" />
                                <label for="5E">5E</label>
                            </li>
                            <li class="seat">
                                <input type="checkbox" id="5F" />
                                <label for="5F">5F</label>
                            </li>
                        </ol>
                    </li>
            </div>
            <div class="exit exit--back fuselage">
            </div>
    </body>
</html>
