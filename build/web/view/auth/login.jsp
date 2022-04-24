<%-- 
    Document   : login
    Created on : Dec 8, 2021, 3:27:43 PM
    Author     : Quang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div id="login">
    <h3 class="text-center text-white pt-5">Login form</h3>
    <div class="container">
        <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6">
                <div id="login-box" class="col-md-12">
                    <form id="login-form" class="form" action="${pageContext.request.contextPath}/account/login" method="POST">
                        <h3 class="text-center text-info">Đăng nhập</h3>
                        <div class="form-group">
                            <label for="username" class="text-info"></label><br>
                            <input type="text" name="username" id="username" class="form-control" placeholder="Tên Đăng Nhập">
                        </div>
                        <div class="form-group">
                            <label for="password" class="text-info"></label><br>
                            <input type="password" name="password" id="password" class="form-control" placeholder="Mật Khẩu">
                        </div><br/>
                        <div style="text-align: center">
                            <input  type="submit" name="submit" class="btn btn-info btn-md" value="Đăng nhập">
                        </div><br/>
                        <c:if test="${requestScope.isFailed != null}">
                            <div style="text-align: center; color: red"> ${requestScope.isFailed ? "Tên đăng nhập hoặc mật khẩu không đúng": ""} </div><br/>
                        </c:if>
                        <div class="form-group" style="text-align: center;color: white">
                            Bạn chưa có tài khoản <a href="#" class="text-info">Đăng ký</a>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>


