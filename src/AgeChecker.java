import java.util.Scanner;
public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your age:");
        int age = scanner.nextInt();

        if(age < 18 && age >= 0) {
            System.out.println("You can't buy alkohol");
        } else if (age < 0 ) {
            System.out.println("Please write correct age");
        } else
            System.out.println("Thank you for shopping");
    }
}
