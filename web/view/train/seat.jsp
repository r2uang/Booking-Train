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
    <div class="exit exit--front fuselage">
    </div>
    <c:forEach  var="seat" items="${requestScope.train.seats}">
        <ol class="cabin fuselage">
            <ol class="seats" type="A">
                <c:forEach begin="1" end="${seat.seat}" var="i">
                    <li class="seat" id="seat">
                        <input type="checkbox" id="${i}" />
                        <label class="${i}" for="${i}" onclick="checkSeat('${i}')">${i}</label>
                    </li>
                </c:forEach>
            </ol>
        </ol>
    </c:forEach>
    <div class="exit exit--back fuselage">
    </div>
    <table>
        <tr>
            <td>Ghế: </td>
            <td>1,2,3</td>
        </tr>
        <tr>
            <td>Tổng: </td>
            <td>50000</td>
        </tr>
    </table>
    <form action="${pageContext.request.contentPath}/book/booking" method="POST" class="buttonBook">
        <input type="text" hidden class="input-seats" value="" name="seats">
        <input type="submit" value="Book" style="text-align: center;" class="btn btn-primary" onclick="getLabelCheck()">
    </form>
</div>




