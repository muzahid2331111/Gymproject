package Dietetian;

import java.time.LocalDate;

public class TrackProgress {
    private String memberID ;
    private int height ; //cm
    private int weight; //kg
    LocalDate date ;

    public TrackProgress(String memberID, int height, int weight, LocalDate date) {
        this.memberID = memberID;
        this.height = height;
        this.weight = weight;
        this.date = date;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
