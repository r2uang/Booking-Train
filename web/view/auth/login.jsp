<%-- 
    Document   : login
    Created on : Dec 8, 2021, 3:27:43 PM
    Author     : Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Đăng Nhập</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="../../style/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div style="background: url(../../img/TauCatLinhHaDong.jpg)" class="page-holder bg-cover">
            <header class="p-3 bg-dark text-white">
                <div class="container">
                    <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                        <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                            <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap">
                            <use xlink:href="#bootstrap" />
                            </svg>
                        </a>
                        <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                            <li><a href="#" class="nav-link px-2 text-white">Home</a></li>
                        </ul>
                        <div class="text-end">
                            <button type="button" class="btn btn-outline-light me-2">Đăng nhập </button>
                            <button type="button" class="btn btn-warning">Đăng ký</button>
                        </div>
                    </div>
                </div>
            </header>
            <div class="wrapper fadeInDown">
                <div id="formContent">
                    <div class="fadeIn first">
                        <img style="width: 20%; " src="../../img/usericon.png" id="icon" alt="User Icon" />
                    </div>
                    <!-- Login Form -->
                    <form>
                        <input type="text" id="login" class="fadeIn second" name="username" placeholder="Tên Đăng Nhập">
                        <input type="text" id="password" class="fadeIn third" name="password" placeholder="Mật Khẩu">
                        <input type="submit" class="fadeIn fourth" value="Đăng nhập">
                    </form>

                    <div id="formFooter">
                        Bạn chưa có tài khoản <a class="underlineHover" href="#">Đăng Kí</a>
                    </div>

                </div>
            </div>

    </body>
</html>
