package mypackage;

class Operations {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }

    String add(String str1, String str2) {
        return str1 + str2;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Operations math = new Operations();

        int sum1 = math.add(2, 3);
        System.out.println("Sum of integers: " + sum1);
        
        int sum2 = math.add(2, 3, 4);
        System.out.println("Sum of integers: " + sum2);

        double sum3 = math.add(2.5, 3.7);
        System.out.println("Sum of doubles: " + sum3);

        String combinedStr = math.add("Hello, ", "World!");
        System.out.println("Combined String: " + combinedStr);
    }
}