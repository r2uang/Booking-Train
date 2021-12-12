/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.train;

import controller.home.HomeController;
import dal.TicketDBContext;
import dal.TrainDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Price;
import model.train.Train;

/**
 *
 * @author Quang
 */
public class TrainSeatController extends HomeController {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TrainSeatController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TrainSeatController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        Boolean isBooking = (Boolean) request.getSession().getAttribute("isBooking");
        int journeysId = Integer.parseInt(request.getParameter("id"));
        int trainId = Integer.parseInt(request.getParameter("id"));

        TrainDBContext trainDBContext = new TrainDBContext();
        Train trainSeat = trainDBContext.getTrain(trainId);

        int[][] seats = trainDBContext.getSeatBooked(journeysId);
        TicketDBContext ticketDBContext = new TicketDBContext();
        Price price = ticketDBContext.getPrice();

        request.setAttribute("trainSeat", trainSeat);
        request.setAttribute("seats", seats);
        request.setAttribute("price", price);
        LoadHeader(request, response);
        request.setAttribute("pageInclude", "/view/train/seat.jsp");
        request.getRequestDispatcher("../view/home.jsp").forward(request, response);
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
