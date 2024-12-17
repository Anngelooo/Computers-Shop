package dev.exercise.View;

import java.util.List;
import java.util.Scanner;

import dev.exercise.Model.Computer;

public class View {

    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("\n--- Store Menu ---");
        System.out.println("1. Add Computer");
        System.out.println("2. Delete Computer by Brand");
        System.out.println("3. Search Computer by Brand");
        System.out.println("4. List All Computers");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public Computer requestComputerData() {
        scanner.nextLine(); // Clear buffer
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Memory (GB): ");
        int memory = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Processor: ");
        String processor = scanner.nextLine();
        System.out.print("Operating System: ");
        String operatingSystem = scanner.nextLine();
        System.out.print("Price ($): ");
        double price = scanner.nextDouble();
        return new Computer(brand, memory, processor, operatingSystem, price);
    }

    public String requestBrand() {
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter the brand: ");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayComputers(List<Computer> computers) {
        if (computers.isEmpty()) {
            System.out.println("No computers available in the store.");
        } else {
            System.out.println("List of Computers:");
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }
}
