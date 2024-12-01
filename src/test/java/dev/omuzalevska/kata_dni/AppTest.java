package dev.omuzalevska.kata_dni;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testMain_ValidInput() {
        String input = "12345678\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(null);

        String output = outputStream.toString();
        assertTrue(output.contains("letter for you DNI: Z")); // 12345678
    }

    @Test
    public void testMain_InvalidInput() {
        String input = "abcd\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(null);

        String output = outputStream.toString();
        assertTrue(output.contains("The data entered is incorrect. Please enter a valid number."));
    }

    // @Test
    // public void testMain_Exception() {
    //     Exception exception = assertThrows(IllegalArgumentException.class, () -> {
    //         DNICalculator.calculateDNI(-1);
    //     });
    //     assertEquals("DNI number must be between 0 and 99999999", exception.getMessage());
    // }

}
