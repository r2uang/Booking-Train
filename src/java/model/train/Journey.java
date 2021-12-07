/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.train;

import java.sql.Time;

/**
 *
 * @author Quang
 */
public class Journey {
    private int journeys_number;
    private Time fromtime;
    private Time totime;

    public Journey() {
    }

    public Journey(int journeys_number, Time fromtime, Time totime) {
        this.journeys_number = journeys_number;
        this.fromtime = fromtime;
        this.totime = totime;
    }

    public int getJourneys_number() {
        return journeys_number;
    }

    public void setJourneys_number(int journeys_number) {
        this.journeys_number = journeys_number;
    }

    public Time getFromtime() {
        return fromtime;
    }

    public void setFromtime(Time fromtime) {
        this.fromtime = fromtime;
    }

    public Time getTotime() {
        return totime;
    }

    public void setTotime(Time totime) {
        this.totime = totime;
    }
    
}
