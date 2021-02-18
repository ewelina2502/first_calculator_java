public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tom";
        teacher.age = 29;
        teacher.school = "University";
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello2();

        Footballer footballer = new Footballer();
        footballer.name = "Mike";
        footballer.age = 21;
        footballer.walk();
        footballer.eat();
        footballer.footballClub = "Boca Juniors";
        footballer.playFootball();
    }
}
