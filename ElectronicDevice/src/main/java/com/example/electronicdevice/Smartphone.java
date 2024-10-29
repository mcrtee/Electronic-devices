package com.example.electronicdevice;

public class Smartphone extends Device {
    protected double screenSize;
    protected double cameraResolution;


    public Smartphone(DeviceType type, String name, double price, double weight, double screenSize, double cameraResolution) {
        super(type, name, price, weight);
    }

    public Smartphone() {
        super();
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + screenSize +
                ", resolution=" + cameraResolution +
                '}';

    }
}


