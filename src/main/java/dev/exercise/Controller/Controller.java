package dev.exercise.Controller;

import dev.exercise.Model.Computer;
import dev.exercise.Model.Store;
import dev.exercise.View.View;

public class Controller {

    private Store store;
    private View view;

    public Controller(Store store, View view) {
        this.store = store;
        this.view = view;
    }

    public void start() {
        int option;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    Computer computer = view.requestComputerData();
                    store.addComputer(computer);
                    view.displayMessage("Computer added successfully.");
                    break;

                case 2:
                    String brandToDelete = view.requestBrand();
                    if (store.deleteComputerByBrand(brandToDelete)) {
                        view.displayMessage("Computer deleted successfully.");
                    } else {
                        view.displayMessage("No computer found with the specified brand.");
                    }
                    break;

                case 3:
                    String brandToSearch = view.requestBrand();
                    Computer found = store.searchComputerByBrand(brandToSearch);
                    if (found != null) {
                        view.displayMessage("Computer found: " + found);
                    } else {
                        view.displayMessage("No computer found with the specified brand.");
                    }
                    break;

                case 4:
                    view.displayComputers(store.listComputers());
                    break;

                case 5:
                    view.displayMessage("Thank you for using the system!");
                    break;

                default:
                    view.displayMessage("Invalid option. Please try again.");
            }
        } while (option != 5);
    }

}
