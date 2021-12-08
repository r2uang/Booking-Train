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
import model.station.Station;

/**
 *
 * @author Quang
 */
public class StationDBContext extends DBContext {

    public ArrayList<Station> list() {
        ArrayList<Station> stations = new ArrayList<>();
        try {
            String sql = "SELECT [station_id]\n"
                    + "      ,[station_name]\n"
                    + "      ,[station_phone]\n"
                    + "      ,[station_emai]\n"
                    + "  FROM [dbo].[Station]\n"
                    + "  WHERE station_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Station station = new Station();
                station.setStation_id(rs.getInt("station_id"));
                station.setStation_name(rs.getString("station_name"));
                station.setStation_phone(rs.getString("station_phone"));
                station.setStation_email(rs.getString("station_emai"));
                stations.add(station);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StationDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stations;
    }

    public Station get(int id) {
        Station station = new Station();
        try {
            String sql = "SELECT [station_id]\n"
                    + "      ,[station_name]\n"
                    + "      ,[station_phone]\n"
                    + "      ,[station_email]\n"
                    + "  FROM [Station]\n"
                    + "  WHERE station_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                station.setStation_id(rs.getInt("station_id"));
                station.setStation_name(rs.getString("station_name"));
                station.setStation_phone(rs.getString("station_phone"));
                station.setStation_email(rs.getString("station_email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StationDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return station;
    }

}
