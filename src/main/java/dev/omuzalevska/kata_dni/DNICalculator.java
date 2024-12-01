package dev.omuzalevska.kata_dni;

public class DNICalculator {
    private static final char[] DNI_LETTERS = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
        'C', 'K', 'E'
    };

    public static char calculateDNI(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99999999");
        }
        int remainder = dniNumber % 23;
        return DNI_LETTERS[remainder];
    }
}
