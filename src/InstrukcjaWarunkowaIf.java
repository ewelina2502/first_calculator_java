public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float a = 4.0F;
        float b = 0;

        if (b != 0) {
            System.out.println("Result of division: " + (a / b));
        } else {
            System.out.println("Please try again without value 0");
        }
    }
}
