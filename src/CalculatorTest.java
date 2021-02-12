import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber,secondNumber);
        int substraction = calculator.sub(firstNumber,secondNumber);
        int multiplication = calculator.mult(firstNumber,secondNumber);
        int division = calculator.div(firstNumber,secondNumber);
        int mod = calculator.mod(firstNumber,secondNumber);

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + substraction);
        System.out.println("Wynik mnozenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);

//Druga opcja:
// System.out.println("Wynik dodawania " + calculator.add(firstNumber,secondNumber));

    }
}
