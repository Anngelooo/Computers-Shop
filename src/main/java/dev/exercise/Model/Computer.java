package dev.exercise.Model;

public class Computer {
    private String brand;
    private int memory;
    private String processor;
    private String operatingSystem;
    private double price;

    public Computer(String brand, int memory, String processor, String operatingSystem, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer [Brand=" + brand + ", Memory=" + memory + "GB, Processor=" + processor +
               ", Operating System=" + operatingSystem + ", Price=$" + price + "]";
    }

}
