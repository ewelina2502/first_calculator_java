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
        System.out.println("Result addition " + addition);
        int substraction = firstNumber - secondNumber;
        System.out.println("Result substraction " + substraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Result multiplication " + multiplication);
        int division = firstNumber / secondNumber;
        System.out.println("Result division " + division);
        int mod = firstNumber%secondNumber;
        System.out.println("Result modulo " + mod);
    }
}
