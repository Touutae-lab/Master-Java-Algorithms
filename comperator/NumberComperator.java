package comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberComperator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(3);

        AscendingOrder ascendingOrder = new AscendingOrder();
        numbers.sort(ascendingOrder);
        DescendingOrder descendingOrder = new DescendingOrder();

        for (Integer number : numbers) {
            System.out.println(number);
        }

        numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());

        // Example
        Collections.sort(numbers, ascendingOrder);
        Collections.sort(numbers, descendingOrder);
        numbers.sort(descendingOrder);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

class AscendingOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

class DescendingOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}