import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Your first number: " + firstNumber);
        System.out.println("Write second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Your second number: " + secondNumber);

        int addition = firstNumber + secondNumber;
        System.out.println("Wynik dodawania " + addition);
        int substraction = firstNumber - secondNumber;
        System.out.println("Wynik odejmowania " + substraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Wynik mnozenia " + multiplication);
        int division = firstNumber / secondNumber;
        System.out.println("Wynik dzielenia " + division);
        int mod = firstNumber%secondNumber;
        System.out.println("Wynik modulo " + mod);
    }
}
