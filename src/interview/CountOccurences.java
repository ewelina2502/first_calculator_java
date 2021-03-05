package interview;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {

    // int[] numbers = new int[] {1,2,3,2,5,3};
    public static void main(String[] args) {
        countOccurense(new int[] {1,2,3,2,5,3});

    }
    public static void countOccurense(int[] numbers) {
        Map<Integer, Integer> occurenses = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
            if(occurenses.containsKey(numbers[i])) {
                Integer value = occurenses.get(numbers[i]);
                occurenses.put(numbers[i],value+1);
            }
            else {
                occurenses.put(numbers[i],1);
            }
        }
        for(Integer key : occurenses.keySet()) {
            System.out.println("Number " + key + " occurences " + occurenses.get(key));
        }
    }
}
