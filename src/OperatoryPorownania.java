import java.util.Scanner;

public class OperatoryPorownania {
    public static void main(String[] args) {
//        int firstNumber = 4;
//        int secondNumber = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Your first number: " + firstNumber);
        System.out.println("Write second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Your second number: " + secondNumber);

        boolean result = secondNumber > firstNumber;

        System.out.println(result);
        System.out.println("a > b :" + (firstNumber > secondNumber));
        System.out.println("a < b :" + (firstNumber < secondNumber));
        System.out.println("a <= b :" + (firstNumber >= secondNumber));
        System.out.println("a <= b :" + (firstNumber <= secondNumber));
        System.out.println("a == b :" + (firstNumber == secondNumber));
        System.out.println("a != b :" + (firstNumber != secondNumber));

    }
}
