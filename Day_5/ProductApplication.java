package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    int pid;
    String pname;
    double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
    }
}

public class ProductApplication {

    public static List<Product> products = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("==================");
            System.out.println("Menu:");
            System.out.println("==================:");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product by Id");
            System.out.println("3. Search Product between price range");
            System.out.println("4. Display all products details");
            System.out.println("5. Quit");
            System.out.print("Enter your choice (1-5): ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    searchProductById();
                    break;
                case 3:
                    searchProductByPriceRange();
                    break;
                case 4:
                	displayProducts();
                    break;
                case 5:
                    System.out.println("Quitting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void addProduct() {
    	
        System.out.print("Enter Product ID: ");
        int pid = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Product Name: ");
        String pname = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(pid, pname, price);
        products.add(product);

        System.out.println("Product added successfully!");
    }

    public static void searchProductById() {
    	
        System.out.print("Enter the Product ID to search: ");
        int searchId = Integer.parseInt(scanner.nextLine());

        for (Product product : products) {
        	
            if (product.pid == searchId) {
            	
                System.out.println("Product found: " + product);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public static void searchProductByPriceRange() {
    	
        System.out.print("Enter the 'from' price: ");
        double fromPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the 'to' price: ");
        double toPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Products in the price range:");
        for (Product product : products) {
        	
            if (product.price >= fromPrice && product.price <= toPrice) {
            	
                System.out.println(product);
            }
        }
    }

    public static void displayProducts() {
    	
        System.out.println("List of products: ");
        for (Product product : products) {
        	
            System.out.println(product);
        }
    }
}
