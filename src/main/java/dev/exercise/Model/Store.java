package dev.exercise.Model;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public Store(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public Computer searchComputerByBrand(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public boolean deleteComputerByBrand(String brand) {
        Computer computerToDelete = searchComputerByBrand(brand);
        if (computerToDelete != null) {
            computers.remove(computerToDelete);
            return true;
        }
        return false;
    }

    public List<Computer> listComputers() {
        return computers;
    }
}
