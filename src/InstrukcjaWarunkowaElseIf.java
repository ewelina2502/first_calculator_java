public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        int number = 12;

        if(number == 0) {
            System.out.println("Value = 0");
        }
        else if(number > 10){
            System.out.println("Value > 10");
        }
        else if(number > 0) {
            System.out.println("Value is +");
        }
        else if(number < -5){
            System.out.println("Value < -5");
        }
        else {
            System.out.println("No condition was met");
        }
    }
}
