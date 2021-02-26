import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args)  {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\Ewelina\\first_project_java\\src\\tests.txt");
            System.out.println("Close file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        }
        finally { //wykona się zawsze
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
