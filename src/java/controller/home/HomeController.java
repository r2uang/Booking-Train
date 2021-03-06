/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.home;

import dal.JourneyDBContext;
import dal.StationDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.account.Account;
import model.station.Station;
import model.train.Journey;

/**
 *
 * @author Quang
 */
public class HomeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void LoadHeader(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String home_href = "/BookingTrain/home";
        String login_href = "/BookingTrain/account/login";
        String login_href_value = "Đăng Nhập";
        String register_href = "/BookingTrain/account/register";
        String register_href_value = "Đăng Ký";
        String logout_href = "/BookingTrain/account/logout";
        String logout_href_value = "Đăng Xuất";
        if (request.getSession().getAttribute("account") == null) {
            logout_href = "";
            logout_href_value = "";
        } else {
            login_href_value = "Xin chào, ";
            register_href = "";
            register_href_value = "";
            Account account = (Account) request.getSession().getAttribute("account");
            login_href_value += account.getDisplayname();
        }
        request.setAttribute("home_href", home_href);
        request.setAttribute("login_href", login_href);
        request.setAttribute("login_href_value", login_href_value);
        request.setAttribute("register_href", register_href);
        request.setAttribute("register_href_value", register_href_value);
        request.setAttribute("logout_href", logout_href);
        request.setAttribute("logout_href_value", logout_href_value);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        LoadHeader(request, response);
        JourneyDBContext jdbc = new JourneyDBContext();
        ArrayList<Journey> journeys = jdbc.list();
        request.setAttribute("journeys", journeys);
        request.setAttribute("pageInclude", "/view/journeys/list.jsp");
        request.getRequestDispatcher("/view/home.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
