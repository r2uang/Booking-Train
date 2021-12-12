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

/**
 *
 * @author Quang
 */
public class TrainDBContext extends DBContext {

    public int[][] getSeatBooked(int journeysId) {
        try {
            String sql = "SELECT "
                    + "      [row_number]\n"
                    + "      ,[seat_number]\n"
                    + "  FROM [dbo].[Ticket] WHERE journey_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, journeysId);
            ResultSet rs = stm.executeQuery();
            int[][] seats = new int[100][100];
            int i = 0;
            while (rs.next()) {
                seats[rs.getInt("row_number")][rs.getInt("seat_number")] = 1;
            }
            return seats;
        } catch (SQLException ex) {
            Logger.getLogger(TrainDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
