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
import model.train.Journey;
import model.train.Train;

/**
 *
 * @author Quang
 */
public class JourneyDBContext extends DBContext {

    public ArrayList<Journey> list() {
        ArrayList<Journey> journeys = new ArrayList<>();
        try {
            String sql = "SELECT * FROM [dbo].[Journeys] j INNER JOIN Train t ON j.train_id = t.train_id\n"
                    + "LEFT JOIN Station s1 ON s1.station_id = j.journey_from_station\n"
                    + "LEFT JOIN Station s2 ON s2.station_id = j.journey_to_station";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Journey journey = new Journey();
                journey.setJourneys_id(rs.getInt("journey_id"));
                journey.setJourneys_from_station(rs.getInt("journey_from_station"));
                journey.setJourneys_to_station(rs.getInt("journey_to_station"));
                journey.setTrain_id(rs.getInt("train_id"));
                journey.setJourney_date(rs.getDate("journey_date"));
                journey.setJourney_time(rs.getString("journey_time"));

                Train train = new Train();
                train.setTrain_id(rs.getInt("train_id"));
                train.setTrain_name(rs.getString("train_name"));

                Station station = new Station();
                station.setStation_id(rs.getInt("station_id"));
                station.setStation_name(rs.getString("station_name"));
                station.setStation_phone(rs.getString("station_phone"));
                station.setStation_email(rs.getString("station_email"));

                journey.setTrain(train);
                journey.setStation(station);

                journeys.add(journey);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JourneyDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return journeys;
    }
   
}
