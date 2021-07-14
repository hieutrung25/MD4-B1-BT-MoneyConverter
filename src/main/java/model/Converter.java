package model;

public class Converter {
    private double rate;
    private double value;

    public Converter() {
    }

    public Converter(double rate, double value) {
        this.rate = rate;
        this.value = value;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double convertToVND() {
        return rate * value;
    }

    @Override
    public String toString() {
        return "Money{" +
                "rate=" + rate +
                ", money=" + value +
                '}';
    }
}
