import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicJava {

    public static void main(String[] args) {
        // Array
        // Integer vs int
        // Integer is Wrapper object that implement int Primitive type with useful operation
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.size();
        // Delete as Index
        numbers.remove(1);
        Integer index = 10;
        // Delete as Object
        numbers.remove(index);

        int[] numbersStatic = {1, 2, 3,};
        int sizeStatic = numbersStatic.length;

        // HashMap Operation
        Map<Integer, Integer> mapper = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : mapper.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Integer key : mapper.keySet()) {
            System.out.println(key + ": " + mapper.get(key));
        }

        for (Integer value : mapper.values()) {
            System.out.println(value);
        }


        mapper.containsKey(1);
        mapper.put(1, 2);
        mapper.forEach((key, value) -> mapper.put(key, value * 2));
        mapper.get(1);
        mapper.remove(1);
        mapper.size();

        // create an array of numbers 1 to 5
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);  // print out 5

        // create an array capable of holding 5 strings
        // String in Java is immutable
        String[] clothes = new String[5];  // since String is of type object, clothes now hold 5 null values
        clothes[0] = "shirt";  // initialize first element
        clothes[1] = "dress";  // initialize second element

        int[] numbersList = {20, 6, 13, 5};
        // simple for loop goes through indices so we fetch elements using indices
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // for-each loop directly fetches elements
        for (int number : numbersList) {
            System.out.println(number);
        }




        // AutoBoxing Java

    }

    // Insertion sort
    public static List<Integer> sortList(List<Integer> unsortedList) {
        for (int i = 0; i < unsortedList.size(); i++) {
            int current = i;
            // gets the smallest element and inserts at current index
            while (current > 0 && unsortedList.get(current) < unsortedList.get(current - 1)) {
                int temp = unsortedList.get(current);
                // swaps current smaller element with the element before it
                unsortedList.set(current, unsortedList.get(current - 1));
                unsortedList.set(current - 1, temp);
                current--;
            }
        }
        return unsortedList;
    }

    // Static Array Version of Insertion sort



}
