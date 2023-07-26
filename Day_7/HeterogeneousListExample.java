package mypackage;

import java.util.ArrayList;
import java.util.List;

public class HeterogeneousListExample {
    public static void main(String[] args) {
        List<Object> heterogeneousList = new ArrayList<>();

        // Adding elements of different types to the list
        heterogeneousList.add("Hello");
        heterogeneousList.add(42);
        heterogeneousList.add(3.14);
        heterogeneousList.add(true);

        // Accessing elements from the list
        String str = (String) heterogeneousList.get(0);
        int num = (int) heterogeneousList.get(1);
        double pi = (double) heterogeneousList.get(2);
        boolean flag = (boolean) heterogeneousList.get(3);

        System.out.println(str); // Output: Hello
        System.out.println(num); // Output: 42
        System.out.println(pi);  // Output: 3.14
        System.out.println(flag); // Output: true
    }
}
