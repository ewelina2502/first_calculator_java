public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numberIndeksu;

    public void przedstawSie() {
        System.out.println("Nzywam sie " + imie + " " + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Loguje sie za pomoca " + nick);
    }
    public void podajNumerIndeksu() {
        System.out.println("Moj numer indeksu to : " + numberIndeksu);
    }
    public void podajEmail() {
        System.out.println("Moj email to : " + email);
    }
}
