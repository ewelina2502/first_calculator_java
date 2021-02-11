public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
        int result = metody.pobierzWynik();
        int result2 = result *2;
        System.out.println("Resultat przed mnożeniem to: " + result);
        System.out.println("Resultat po mnożeniu to: " + result2);

    }
}
