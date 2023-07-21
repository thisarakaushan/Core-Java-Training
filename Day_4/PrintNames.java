package mypackage;

public class PrintNames {
    public static void main(String[] args) {
    	
        String[] names = {"ABC", "BCD", "CDE", "DEF", "EFG", "FGH", "GHI", "HIJ"};

        // Using for loop (using index)
        System.out.println("Using for loop (using index): ");
        
        for (int i = 0; i < names.length; i++) {
        	
            System.out.println(names[i]);
        }

        // Using for-each loop
        System.out.println("\nUsing for-each loop: ");
        
        for (String name : names) {
        	
            System.out.println(name);
        }
    }
}
