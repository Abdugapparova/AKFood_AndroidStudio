package com.example.akfood1.models;

public class ReservationM {
    private int res_id;
    private int numPeople;
    private int time;
    private String date;
    private String type;

    public ReservationM() {
    }

    public ReservationM(int res_id, int numPeople, int time, String date, String type) {
        this.res_id = res_id;
        this.numPeople = numPeople;
        this.time = time;
        this.date = date;
        this.type = type;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nReservation{" +
                "res_id=" + res_id +
                ", numPeople=" + numPeople +
                ", time=" + time +
                ", date=" + date +
                ", type=" + type +
                '}';
    }
}
