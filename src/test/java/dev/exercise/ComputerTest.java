package dev.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.exercise.Model.Computer;

public class ComputerTest {

    @Test
    void testComputerAttributes() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);
        
        assertEquals("Dell", computer.getBrand());
        assertEquals(16, computer.getMemory());
        assertEquals("Intel i7", computer.getProcessor());
        assertEquals("Windows 10", computer.getOperatingSystem());
        assertEquals(1200.00, computer.getPrice());
    }

    @Test
    void testToStringMethod() {
        Computer computer = new Computer("HP", 8, "AMD Ryzen 5", "Linux", 800.00);
        String expected = "Computer [Brand=HP, Memory=8GB, Processor=AMD Ryzen 5, Operating System=Linux, Price=$800.0]";
        
        assertEquals(expected, computer.toString());
    }

}
