package Dietetian;

import java.time.LocalDate;

public class TrackProgress {
    private String memberID;
    private double height; //cm
    private double weight; //kg
    private double bmi;
    LocalDate date;

    public TrackProgress(String memberID, double height, double weight, double bmi, LocalDate date) {
        this.memberID = memberID;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.date = date;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
