// Find the frequency elements using collection.

package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        Map<Integer, Integer> freq = new HashMap<>();

        // Calculate the frequency of elements
        for (Integer num : numbers) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of elements
        for (Integer n : freq.keySet()) {
            System.out.println(n + ": " + freq.get(n));
        }
    }
}
