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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.train.Seat;
import model.train.Train;

/**
 *
 * @author Quang
 */
public class TrainDBContext extends DBContext {

    public int[][] getSeatBooked(int journeysId, int trainId) {
        try {
            String sql = "SELECT "
                    + "[row_number]\n"
                    + ",[seat_number]\n"
                    + "  FROM [dbo].[Ticket] WHERE journey_id = ? AND train_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, journeysId);
            stm.setInt(2, trainId);
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

    public Train getTrain(int trainid) {
        try {
            String sql_train = "SELECT [train_id]\n"
                    + ",[train_name]\n"
                    + "FROM [Train] t  WHERE train_id = ?";
            
            String sql_train_seat = "SELECT TOP (1000) [train_id]\n"
                    + ",[row_number]\n"
                    + ",[seat_count]\n"
                    + "FROM [QuickBooking].[dbo].[Seat]"
                    + "WHERE train_id = ?";
            
            PreparedStatement stm = connection.prepareStatement(sql_train);
            stm.setInt(1,trainid);
            ResultSet rs_train = stm.executeQuery();
            Train train = new Train();
            if (rs_train.next()) {
                train.setTrain_id(rs_train.getInt("train_id"));
                train.setTrain_name(rs_train.getString("train_name"));
                //get seat for each train
                ArrayList<Seat> seats = new ArrayList<>();
                PreparedStatement stm_train_seat = connection.prepareStatement(sql_train_seat);
                stm_train_seat.setInt(1, train.getTrain_id());
                ResultSet rs_train_seat = stm_train_seat.executeQuery();
                while (rs_train_seat.next()) {
                    Seat seat = new Seat();
                    seat.setRow(rs_train_seat.getInt("row_number"));
                    seat.setSeat(rs_train_seat.getInt("seat_count"));
                    seats.add(seat);
                }
                train.setSeats(seats);
            }
            return train;
        } catch (SQLException ex) {
            Logger.getLogger(TrainDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
