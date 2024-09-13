import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Celsius degree
        System.out.print("Enter a Celsius degree: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the result
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
