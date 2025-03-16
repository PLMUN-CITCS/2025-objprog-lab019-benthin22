import java.util.Scanner;

public class FactorialCalculator {
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a non-negative integer: ");
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= 0) return number;
            } catch (NumberFormatException ignored) {}
            System.out.println("Invalid input. Please enter a non-negative integer.");
        }
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) factorial *= i;
        return factorial;
    }

    public static void main(String[] args) {
        int userInput = getNonNegativeInteger();
        System.out.println("The factorial of " + userInput + " is: " + calculateFactorial(userInput));
    }
}
