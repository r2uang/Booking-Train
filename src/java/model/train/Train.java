/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.train;

import java.util.ArrayList;

/**
 *
 * @author Quang
 */
public class Train {

    private int train_id;
    private String train_name;
    private ArrayList<Seat> seats = new ArrayList<>();
    
    public Train() {
    }

    public Train(int train_id, String train_name) {
        this.train_id = train_id;
        this.train_name = train_name;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

}
