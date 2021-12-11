<%-- 
   Document   : list
   Created on : Dec 11, 2021, 8:53:09 PM
   Author     : Quang
--%>

<%@page import="dal.StationDBContext"%>
<%@page import="dal.StationDBContext"%>
<%@page import="model.station.Station"%>
<%@page import="model.station.Station"%>
<%@page import="model.train.Journey"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% ArrayList<Journey> journeys = (ArrayList<Journey>) request.getAttribute("journeys"); %>
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">Từ</th>
            <th scope="col">Tới</th>
            <th scope="col">Ngày Khởi Hành</th>
            <th scope="col">Giờ Khởi Hành</th>
            <th scope="col"></th>
        </tr>
    </thead>
    <tbody>
        <% for (Journey j : journeys) { %>
        <%
            Station stationfrom = new StationDBContext().get(j.getJourneys_from_station());
            Station stationto = new StationDBContext().get(j.getJourneys_to_station());
        %>
        <tr>
            <td><%=stationfrom.getStation_name()%></td>
            <td><%=stationto.getStation_name()%></td>
            <td><%=j.getJourney_date()%></td>
            <td><%=j.getJourney_time()%></td>
            <td><button type="button" class="btn btn-dark">Đặt vé</button></td>
        </tr>
        <%}%>
    </tbody>
</table>
