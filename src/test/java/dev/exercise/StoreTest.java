package dev.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.exercise.Model.Computer;
import dev.exercise.Model.Store;

public class StoreTest {

     private Store store;

    @BeforeEach
    void setup() {
        store = new Store("TechStore", "Angelo Colmenares", "12345678-T");
    }

    @Test
    void testAddComputer() {
        Computer computer = new Computer("Apple", 16, "M1", "macOS", 2000.00);
        store.addComputer(computer);

        assertEquals(1, store.listComputers().size());
        assertEquals("Apple", store.listComputers().get(0).getBrand());
    }

    @Test
    void testSearchComputerByBrand() {
        Computer computer = new Computer("Asus", 32, "Intel i9", "Windows 11", 2500.00);
        store.addComputer(computer);

        Computer found = store.searchComputerByBrand("Asus");
        assertNotNull(found);
        assertEquals("Asus", found.getBrand());
    }

    @Test
    void testSearchComputerByBrand_NotFound() {
        Computer found = store.searchComputerByBrand("NonExistent");
        assertNull(found);
    }

    @Test
    void testDeleteComputerByBrand() {
        Computer computer = new Computer("Lenovo", 8, "Intel i5", "Windows 10", 900.00);
        store.addComputer(computer);

        boolean isDeleted = store.deleteComputerByBrand("Lenovo");
        assertTrue(isDeleted);
        assertEquals(0, store.listComputers().size());
    }

    @Test
    void testDeleteComputerByBrand_NotFound() {
        boolean isDeleted = store.deleteComputerByBrand("NonExistent");
        assertFalse(isDeleted);
    }

    @Test
    void testListComputers() {
        Computer comp1 = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);
        Computer comp2 = new Computer("HP", 8, "AMD Ryzen 5", "Linux", 800.00);

        store.addComputer(comp1);
        store.addComputer(comp2);

        List<Computer> computers = store.listComputers();
        assertEquals(2, computers.size());
        assertEquals("Dell", computers.get(0).getBrand());
        assertEquals("HP", computers.get(1).getBrand());
    }
}
