<%-- 
    Document   : seat
    Created on : Dec 12, 2021, 10:06:23 AM
    Author     : Quang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script>
    function checkSeat(name) {
        var label = document.getElementsByClassName(name)[0];
        console.log(label.getAttribute("class"));
        if (label.getAttribute("class").includes("checked")) {
            label.setAttribute("class", label.getAttribute("class").replace(" checked", " "));
        } else {
            label.setAttribute("class", label.getAttribute("class") + " checked");
        }
    }
    function getLabelCheck() {
        var labels = document.getElementsByTagName("label");
        var seats = "";
        for (let i = 0; i < labels.length; i++) {
            if (labels[i].className.includes("checked")) {
                seats = labels[i].className.split(" ")[0] + " ";
            }
        }
    }
</script>

<div class="plane">
    <h2 style="text-align: center">Đặt vé</h2><br/>
    <form action="seat" method="POST">
        <div class="exit exit--front fuselage">
        </div>
        <ol class="cabin fuselage">
            <li class="row row--1">
                <c:forEach  var="seat" items="${requestScope.trainSeat.seats}">
                    <c:forEach begin="0" end="${seat.row}" var="i">
                        <ol class="seats" type="A">
                            <c:forEach begin="0" end="${requestScope.trainSeat.seats.get(i).seat}" var="j">
                                <li class="seat" id="seat">
                                    <input type="checkbox" id="1A"/>
                                    <label class="${i}" for="${i}" onclick="checkSeat('${i}')">${j}</label>
                                </li>
                            </c:forEach>
                        </ol>
                    </c:forEach>
                </c:forEach>
            </li>
        </ol>
        <input type="text" hidden class="input-seats" value="" name="seats">
        <input type="submit" value="Book" onclick="getLabelCheck()">
    </form>




