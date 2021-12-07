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
public class Station {
    private int station_id;
    private String station_name;
    private String station_email;
    private String station_phone;

    public Station() {
    }

    public Station(int station_id, String station_name, String station_email, String station_phone) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.station_email = station_email;
        this.station_phone = station_phone;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_email() {
        return station_email;
    }

    public void setStation_email(String station_email) {
        this.station_email = station_email;
    }

    public String getStation_phone() {
        return station_phone;
    }

    public void setStation_phone(String station_phone) {
        this.station_phone = station_phone;
    }
     
    
    
}
