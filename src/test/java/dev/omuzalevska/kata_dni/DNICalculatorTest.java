package dev.omuzalevska.kata_dni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DNICalculatorTest {

    @Test
    public void testCalculateDNI_ValidNumbers() {
        assertEquals('T', DNICalculator.calculateDNI(23));
        assertEquals('Z', DNICalculator.calculateDNI(12345678));
        assertEquals('X', DNICalculator.calculateDNI(87654321));
    }
    
    @Test
    public void testCalculateDNI_Border() {
        assertEquals('T', DNICalculator.calculateDNI(0));
        assertEquals('R', DNICalculator.calculateDNI(99999999));
    }

    @Test
    public void testCalculateDNI_InvalidNumbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DNICalculator.calculateDNI(-1);
        });
        assertEquals("DNI number must be between 0 and 99999999", exception.getMessage());
    }
}