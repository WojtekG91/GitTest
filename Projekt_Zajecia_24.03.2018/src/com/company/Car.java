package com.company;

public class Car {
    private String name, model, color, vin;
    private int rentPrice, power, engineCapacity, numOfPlaces, tankCapacity;
    private double fuelConsumption;

    public Car(String name, String model, String color, String vin, int power, int engineCapacity, int numOfPlaces, int tankCapacity, double fuelConsumption) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.numOfPlaces = numOfPlaces;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public int getPower() {
        return power;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getNumOfPlaces() {
        return numOfPlaces;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", model='" + model + '\'' +
                        ", color='" + color + '\'' +
                        ", vin='" + vin + '\'' +
                        ", rentPrice=" + rentPrice +
                        ", power=" + power +
                        ", engineCapacity=" + engineCapacity +
                        ", numOfPlaces=" + numOfPlaces +
                        ", tankCapacity=" + tankCapacity +
                        ", fuelConsumption=" + fuelConsumption;
    }
}
