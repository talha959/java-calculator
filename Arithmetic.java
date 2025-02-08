import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN;
        double modulus = num1 % num2;
        double exponentiation = Math.pow(num1, num2);
        
        // Display results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
            System.out.println("Modulus: " + modulus);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        System.out.println("Exponentiation: " + exponentiation);
        
        scanner.close();
    }
}