/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.station;

/**
 *
 * @author Quang
 */
public class StationJourney {
    private int station_journey_id;
    private String station_journey_from;
    private String Station_journey_to;

    public StationJourney() {
    }

    public StationJourney(int station_journey_id, String station_journey_from, String Station_journey_to) {
        this.station_journey_id = station_journey_id;
        this.station_journey_from = station_journey_from;
        this.Station_journey_to = Station_journey_to;
    }

    public int getStation_journey_id() {
        return station_journey_id;
    }

    public void setStation_journey_id(int station_journey_id) {
        this.station_journey_id = station_journey_id;
    }

    public String getStation_journey_from() {
        return station_journey_from;
    }

    public void setStation_journey_from(String station_journey_from) {
        this.station_journey_from = station_journey_from;
    }

    public String getStation_journey_to() {
        return Station_journey_to;
    }

    public void setStation_journey_to(String Station_journey_to) {
        this.Station_journey_to = Station_journey_to;
    }
    
}
