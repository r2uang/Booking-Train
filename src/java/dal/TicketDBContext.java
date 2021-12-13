/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Price;

/**
 *
 * @author Quang
 */
public class TicketDBContext extends DBContext {

    public Price getPrice() {
        try {
            String sql = "SELECT [price_id]\n"
                    + "      ,[price]\n"
                    + "  FROM [QuickBooking].[dbo].[Price]";
            Price price = new Price();
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                price.setPrice_id(rs.getInt("price_id"));
                price.setPrice(rs.getFloat("price"));
            }
            return price;
        } catch (SQLException ex) {
            Logger.getLogger(TicketDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean insertTicket(int journeys_id, int train_id, String[] seats, int station_id, String[] prices, String username) {
        try {
            String sql_payment = "INSERT INTO [dbo].[Payment]\n"
                    + "           ([username])\n"
                    + "     VALUES\n"
                    + "           (?)";
            String sql_ticket = "INSERT INTO [dbo].[Ticket]\n"
                    + "           ([train_id]\n"
                    + "           ,[row_number]\n"
                    + "           ,[seat_number]\n"
                    + "           ,[station_id]\n"
                    + "           ,[journey_id]\n"
                    + "           ,[price_id]\n"
                    + "           ,[payment_id])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            connection.setAutoCommit(true);
            PreparedStatement stm_payment = connection.prepareStatement(sql_payment);
            stm_payment.setString(1, username);
            stm_payment.executeUpdate();

            String sql_get_identity = "Select @@IDENTITY as payment_id";
            PreparedStatement stm_get_identity = connection.prepareStatement(sql_get_identity);
            ResultSet rs_get_identity = stm_get_identity.executeQuery();
            int payment_id = 0;
            if (rs_get_identity.next()) {
                payment_id = rs_get_identity.getInt("payment_id");
            }

            for (int i = 0; i < seats.length; i++) {
                PreparedStatement stm_ticket = connection.prepareStatement(sql_ticket);
                stm_ticket.setInt(1, journeys_id);
                stm_ticket.setInt(2, train_id);
                stm_ticket.setInt(3, Integer.parseInt(seats[i]));
                stm_ticket.setInt(4, station_id);
                stm_ticket.setInt(5, Integer.parseInt(prices[i]));
                stm_ticket.setInt(1, payment_id);
                stm_ticket.executeUpdate();
            }
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(TicketDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }
}
