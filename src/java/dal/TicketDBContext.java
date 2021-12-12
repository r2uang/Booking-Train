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

}
