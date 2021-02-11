public class StudentChecker {

    public static void main(String[] args) {

        Student bartek = new Student();
        bartek.imie = "Bartek";
        bartek.nazwisko = "Kowalski";
        bartek.email = "email@email.com";
        bartek.numberIndeksu = 12345;
        bartek.nick = "Bart";

        Student zuza = new Student();
        zuza.imie = "Zuzanna";
        zuza.nazwisko = "Zuzanska";
        zuza.email = "email2@email.com";
        zuza.numberIndeksu = 12345;
        zuza.nick = "Zuzka";

        Student piotr = new Student();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Zuzanski";
        piotr.email = "email3@email.com";
        piotr.numberIndeksu = 12347;
        piotr.nick = "Piotrek";


        Student[] students = new Student[3];
        students[0] = bartek;
        students[1] = zuza;
        students[2] = piotr;


        for (int i=0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNumerIndeksu();
            students[i].zalogujSie();


        }
    }
}
