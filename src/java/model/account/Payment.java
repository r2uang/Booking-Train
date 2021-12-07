/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.account;

import java.sql.Date;
import java.util.ArrayList;
import model.station.Station;
import model.train.Journey;
import model.train.Train;

/**
 *
 * @author Quang
 */
public class Payment {
    private int payment_id;
    private Date payment_date;
    private float price;
    private Train train;
    private Journey journey;
    private Station station;
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public Payment() {
    }

    public Payment(int payment_id, Date payment_date, float price, Train train, Journey journey, Station station) {
        this.payment_id = payment_id;
        this.payment_date = payment_date;
        this.price = price;
        this.train = train;
        this.journey = journey;
        this.station = station;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Journey getJourney() {
        return journey;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    
}
