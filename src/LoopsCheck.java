import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class LoopsCheck {

//    public static void main(String[] args) {

//       int number = 100;
//        for (int i=1; i < number; i++) {
//            if(i%3==0)
//                System.out.println(i);
//        }
//    }

    public static void main(String[] args) {

        int[] tableNumbers = new int[] {1, 3, 5, 7 ,0};

        for (int i=0; i < tableNumbers.length/2; i++) {
            int temp = tableNumbers[i]; // dla i=0 1  i=1  3
            tableNumbers[i] = tableNumbers[tableNumbers.length-1-i]; // 4 -> 0  3=>7
            tableNumbers[tableNumbers.length-1-i] = temp; //1 // tableNumbers[3] =3

        }

        for (int i=0; i <tableNumbers.length; i++) {
            System.out.println(tableNumbers[i]);
        }
    }
}

