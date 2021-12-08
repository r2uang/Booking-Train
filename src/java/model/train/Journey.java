/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.train;

import java.sql.Date;
import java.sql.Time;
import model.station.Station;

/**
 *
 * @author Quang
 */
public class Journey {

    private int journeys_id;
    private int journeys_from_station;
    private int journeys_to_station;
    private int train_id;
    private String journey_time;
    private Date journey_date;
    private Train train;
    private Station station;

    public Journey() {
    }

    public Journey(int journeys_id, int journeys_from_station, int journeys_to_station, int train_id, String journey_time, Date journey_date, Train train, Station station) {
        this.journeys_id = journeys_id;
        this.journeys_from_station = journeys_from_station;
        this.journeys_to_station = journeys_to_station;
        this.train_id = train_id;
        this.journey_time = journey_time;
        this.journey_date = journey_date;
        this.train = train;
        this.station = station;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public int getJourneys_id() {
        return journeys_id;
    }

    public void setJourneys_id(int journeys_id) {
        this.journeys_id = journeys_id;
    }

    public int getJourneys_from_station() {
        return journeys_from_station;
    }

    public void setJourneys_from_station(int journeys_from_station) {
        this.journeys_from_station = journeys_from_station;
    }

    public int getJourneys_to_station() {
        return journeys_to_station;
    }

    public void setJourneys_to_station(int journeys_to_station) {
        this.journeys_to_station = journeys_to_station;
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public String getJourney_time() {
        return journey_time;
    }

    public void setJourney_time(String journey_time) {
        this.journey_time = journey_time;
    }

    public Date getJourney_date() {
        return journey_date;
    }

    public void setJourney_date(Date journey_date) {
        this.journey_date = journey_date;
    }

}
