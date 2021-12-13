/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.booking;

import controller.home.HomeController;
import dal.TicketDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.account.Account;
import model.station.Station;
import model.train.Journey;
import model.train.Train;

/**
 *
 * @author Quang
 */
public class BookingController extends HomeController {

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
        response.setContentType("text/html;charset=UTF-8");

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
        Account account = (Account) request.getSession().getAttribute("account");
        Boolean isBooking = (Boolean) request.getSession().getAttribute("isBooking");

        if (account == null || isBooking == null) {
            response.sendRedirect(request.getContextPath() + "/home");
            return;
        }

        Journey journey = (Journey) request.getSession().getAttribute("journey");
        Train train = (Train) request.getSession().getAttribute("train");
        Station station = (Station) request.getSession().getAttribute("station");
        
        String [] seats = request.getParameterValues("seat");
        String [] prices = request.getParameterValues("price");
        
        TicketDBContext ticketDBContext = new TicketDBContext();
        boolean success = ticketDBContext.insertTicket(journey.getJourneys_id(),train.getTrain_id(),seats,station.getStation_id(),prices,account.getUsername());
        
        request.setAttribute("journey", journey);
        request.setAttribute("train", train);
        request.setAttribute("station", station);
        request.setAttribute("seats", seats);
        request.setAttribute("success", success);
        LoadHeader(request, response);
        request.setAttribute("pageInclude","/view/ticket/success.jsp");
        request.getRequestDispatcher("../view/home.jsp");
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
