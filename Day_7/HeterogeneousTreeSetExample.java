package mypackage;

import java.util.TreeSet;

public class HeterogeneousTreeSetExample {
    public static void main(String[] args) {
        TreeSet<Object> heterogeneousSet = new TreeSet<>();

        // Adding elements of different types to the TreeSet
        heterogeneousSet.add("Hello");
        heterogeneousSet.add(42);
        heterogeneousSet.add(3.14);
        heterogeneousSet.add(true);

        // Accessing elements from the TreeSet
        String str = (String) heterogeneousSet.first();
        int num = (int) heterogeneousSet.higher(str);
        double pi = (double) heterogeneousSet.higher(num);
        boolean flag = (boolean) heterogeneousSet.higher(pi);

        System.out.println(str); // Output: Hello
        System.out.println(num); // Output: 42
        System.out.println(pi);  // Output: 3.14
        System.out.println(flag); // Output: true
    }
}
