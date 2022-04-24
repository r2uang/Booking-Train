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
        updateSeatBooked(getLabelCheck());
        updatePriceIdBooked(getLabelCheck());
        updatePriceBooked(getLabelCheck());
    }
    function getLabelCheck() {
        var labels = document.getElementsByTagName("label");
        var seats = "";
        for (let i = 0; i < labels.length; i++) {
            if (labels[i].className.includes("checked")) {
                seats = labels[i].className.split(" ")[0] + " " + seats; 
            }
        }
        document.getElementsByClassName("input-seats")[0].setAttribute("value", seats);
        return seats;
    }
   
    function updateSeatBooked(text) {
        var seatBooked = document.getElementsByClassName("seat-booked")[0];
        seatBooked.innerHTML = text;
    }
    
    function updatePriceIdBooked(text) {
        var priceBooked = document.getElementsByClassName("price-booked")[0];
        var price = "";
        var labels = document.getElementsByTagName("label");
        for (let i = 0; i < labels.length; i++) {
            if (labels[i].className.includes("checked")) {
                price = labels[i].getAttribute("value").split(" ")[0] + " " + price;
            }
        }
        document.getElementsByClassName("input-price")[0].setAttribute("value", price);
    }
    
    function updatePriceBooked(text) {
        var priceBooked = document.getElementsByClassName("price-booked")[0];
        var price = 0;
        var labels = document.getElementsByTagName("label");
        for (let i = 0; i < labels.length; i++) {
            if (labels[i].className.includes("checked")) {
                price += parseInt(labels[i].getAttribute("value"));
            }
        }
        priceBooked.innerHTML = price;
    }
</script>

<div class="plane">
    <h2 style="text-align: center">Đặt vé</h2><br/>
    <div class="exit exit--front fuselage">
    </div>
    <%char row = 'A';%>
    <c:forEach  var="rowSeat" items="${requestScope.train.seats}">
        <ol class="cabin fuselage">
            <ol class="seats" type="A">
                <c:forEach begin="1" end="${rowSeat.seat}" var="i">
                    <li class="seat">
                        <input type="checkbox" id="${i}<%=row%>" />
                        <label class="${i}<%=row%>" for="${i}<%=row%>" value="${requestScope.price.price_id}"  onclick="checkSeat('${i}<%=row%>')"><%=row%>${i}</label>
                    </li>
                </c:forEach>
            </ol>
        </ol>
        <%row++;%>
    </c:forEach>
    <div class="exit exit--back fuselage">
    </div>
    <table>
        <tr>
            <td>Ghế <p class="seat-booked"></p></td>
        </tr>
        <tr>
            <td>Tổng <p class="price-booked"></p></td>
        </tr>
    </table>
    <form action="${pageContext.request.contextPath}/book/booking" method="POST">
        <input type="hidden" class="input-seats" value="" name="seats">
        <input type="hidden" class="input-price" value="" name="price">
        <div class="buttonBook">
            <input type="submit" value="Book" class="btn btn-primary" onclick="getLabelCheck()">
        </div>

    </form>
</div>




