package dev.omuzalevska.kata_dni;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Input number DNI (0-99999999): ");
            String input = scanner.nextLine();

            try {
                int dniNumber = Integer.parseInt(input);
                char letter = DNICalculator.calculateDNI(dniNumber);
                System.out.println("letter for you DNI: " + letter);
                validInput = true; 

            } catch (NumberFormatException e) {
                System.out.println("The data entered is incorrect. Please enter a valid number.");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
