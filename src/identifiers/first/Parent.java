package identifiers.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fourth = "private";

    public void firstMethod() {
        System.out.println("public");
    }

    void secondMethod() {
        System.out.println("default");
    }

    protected void thirdMethod() {
        System.out.println("protected");
    }

    private void fourthMethod() {
        System.out.println("public");
    }

    public void testIdetifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();

    }
}
