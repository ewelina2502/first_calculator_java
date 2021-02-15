public class AutoTest {

    public static void main(String[] args) {

        Auto auto = new Auto( "Audi", "A8", 2020, 10000);

        System.out.println(auto.marka);
        System.out.println(auto.model);
        System.out.println(auto.rokProdukcji);
        System.out.println(auto.przebieg);

        auto.jedz();
        auto.hamuj();
        auto.info();

        Auto noName = new Auto("noName", "noName", 0, 0);

        noName.jedz();
        noName.hamuj();
        noName.info();

    }
}

