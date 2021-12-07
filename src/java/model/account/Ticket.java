/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.account;

/**
 *
 * @author Quang
 */
public class Ticket {
    private int id;
    private int train_id;
    private int row_number;
    private int seat_number;
    private int station_id;
    private int journey_id;
    private int price_id;
    private int payments_id;

    public Ticket() {
    }

    public Ticket(int id, int train_id, int row_number, int seat_number, int station_id, int journey_id, int price_id, int payments_id) {
        this.id = id;
        this.train_id = train_id;
        this.row_number = row_number;
        this.seat_number = seat_number;
        this.station_id = station_id;
        this.journey_id = journey_id;
        this.price_id = price_id;
        this.payments_id = payments_id;
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public int getRow_number() {
        return row_number;
    }

    public void setRow_number(int row_number) {
        this.row_number = row_number;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public int getJourney_id() {
        return journey_id;
    }

    public void setJourney_id(int journey_id) {
        this.journey_id = journey_id;
    }

    public int getPrice_id() {
        return price_id;
    }

    public void setPrice_id(int price_id) {
        this.price_id = price_id;
    }

    public int getPayments_id() {
        return payments_id;
    }

    public void setPayments_id(int payments_id) {
        this.payments_id = payments_id;
    }
    
}
