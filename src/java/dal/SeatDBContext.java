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
import model.train.Seat;
import model.train.Train;

/**
 *
 * @author Quang
 */
public class SeatDBContext extends DBContext {
//  public Seat getSeat() {
//        try {
//            String sql = "SELECT [train_id]\n"
//                    + "      ,[row_number]\n"
//                    + "      ,[seat_count]\n"
//                    + "  FROM [dbo].[Seat]";
//            PreparedStatement stm = connection.prepareStatement(sql);
//            ResultSet rs = stm.executeQuery();
//            Seat seat = new Seat();
//            while(rs.next()){
//                seat.setRow(0);
//                seat.setRow(rs.getInt("row_number"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(TrainDBContext.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
