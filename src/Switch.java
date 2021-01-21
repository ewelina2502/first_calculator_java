public class Switch {

    public static void main(String[] args) {
        String meal = "Pizza";

        switch (meal) {
            case "Pizza":
                System.out.println("Price = 22 pln");
                break;
            case "Losos":
                System.out.println("Price = 35 pln");
                break;
            case "Frytki":
                System.out.println("Price = 9 pln");
                break;
            default:
                System.out.println("We don't have this meal in menu");
        }
    }
}
