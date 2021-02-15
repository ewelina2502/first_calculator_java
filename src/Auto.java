public class Auto {

    public String marka;
    public String model;
    public Integer rokProdukcji; // daj wartość null w int a nie zero
    public int przebieg;

    public Auto() {

    }

    public Auto(String marka, String model, Integer rokProdukcji, Integer przebieg) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void jedz() {
        System.out.println("Jadę!");
    }

    public void hamuj() {
        System.out.println("Hamuj");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);

    }
}

