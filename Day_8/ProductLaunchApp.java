package com.highradius.product.management.uilayer;

import com.highradius.product.management.businesslogiclayer.ProductBLL;
import com.highradius.product.management.entities.Product;

import java.util.List;
import java.util.Scanner;

public class ProductLaunchApp {
	
    public static void main(String[] args) {
    	
        Scanner obj = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=====================================");
            System.out.println("Product Database Management System");
            System.out.println("=====================================");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product by Name");
            System.out.println("3. Search Product by Brand");
            System.out.println("4. Display all Products");
            System.out.println("5. Quit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(obj.nextLine());
            
            Product prd = new Product(choice, null, choice, null);
            
            switch (choice) {
                case 1:
                    // Read the product details from the user
                    System.out.println("Enter Product Id: ");
                    prd.setpId(Integer.parseInt(obj.nextLine()));
                    System.out.println("Enter Product name: ");
                    prd.setpName(obj.nextLine());
                    System.out.println("Enter Product Brand: ");
                    prd.setBrand(obj.nextLine());
                    System.out.println("Enter product Price: ");
                    prd.setPrice(Integer.parseInt(obj.nextLine()));

                    String message = ProductBLL.addProduct(prd);
                    System.out.println(message);
                    break;

                case 2:
                    System.out.println("Enter Product Name: ");
                    String prdName = obj.nextLine();
                    List<Product> matchingProductsByName = ProductBLL.searchProductByName(prdName);

                    if (!matchingProductsByName.isEmpty()) {
                        for (Product product : matchingProductsByName) {
                            System.out.println(product.toString());
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter Product Brand: ");
                    String prdBrand = obj.nextLine();
                    List<Product> matchingProductsByBrand = ProductBLL.searchProductByBrand(prdBrand);

                    if (!matchingProductsByBrand.isEmpty()) {
                        for (Product product : matchingProductsByBrand) {
                            System.out.println(product.toString());
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    List<Product> allProductsInDescendingOrderOfPrice = ProductBLL.getAllProductsInDescendingOrderOfPrice();

                    if (!allProductsInDescendingOrderOfPrice.isEmpty()) {
                        for (Product product : allProductsInDescendingOrderOfPrice) {
                            System.out.println(product.toString());
                        }
                    } else {
                        System.out.println("No products found.");
                    }
                    break;

                case 5:
                	System.out.println("Quit....");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 5);

        obj.close();
    }
}