package dev.exercise;

import dev.exercise.Controller.Controller;
import dev.exercise.Model.Store;
import dev.exercise.View.View;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Store store = new Store("TechStore", "Angelo Colmenares", "12345678-T");
        View view = new View();
        Controller controller = new Controller(store, view);
        controller.start();
    }
}
