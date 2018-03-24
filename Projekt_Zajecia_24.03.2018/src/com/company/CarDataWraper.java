package com.company;

public class CarDataWraper {
    int rentPrice;

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public CarDataWraper (){
    }

    @Override
    public String toString() {
        return "CarDataWraper{" +
                "rentPrice=" + rentPrice +
                '}';
    }
}
