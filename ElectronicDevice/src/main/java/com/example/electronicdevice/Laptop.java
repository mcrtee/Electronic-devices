package com.example.electronicdevice;


public class Laptop extends Device {
    protected int ramSize;
    protected String processorType;

    public Laptop(DeviceType type, String name, double price, double weight, int ramSize, String processorType)  {
        super(type, name, price, weight);
    }

    public Laptop() {

    }

    public int getRamSize(){
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + ramSize +
                ", resolution=" + processorType +
                '}';
    }
}
