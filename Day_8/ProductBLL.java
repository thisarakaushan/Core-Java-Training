package com.highradius.product.management.businesslogiclayer;

import com.highradius.product.management.entities.Product;
import com.highradius.product.management.dataaccesslayer.ProductDLL;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductBLL {

    public static String addProduct(Product prd) {
        // Logic for validation
        StringBuilder message = new StringBuilder();
        if (prd.getpId() < 0)
            message.append("Invalid Product Id\n");
        if (prd.getpName().length() < 3)
            message.append("Product name should have a minimum of 3 characters.\n");
        if (prd.getBrand().isEmpty() || !Character.isUpperCase(prd.getBrand().charAt(0)))
            message.append("Brand name should start with a capital letter.\n");
        if (prd.getPrice() < 0)
            message.append("Product price cannot be negative.\n");

        if (message.length() == 0) {
            if (ProductDLL.saveProduct(prd))
                return "Product saved successfully.";
            else
                return "Unable to save product details.";
        } else
            return message.toString();
    }
    
    /**
     * This is the method for search product using product name
     * @param prdName
     * @return
     */
    public static List<Product> searchProductByName(String prdName) {
        List<Product> matchingProducts = new ArrayList<>();
        List<Product> allProducts = ProductDLL.getAllProducts();

        // Search with matching characters
        matchingProducts = allProducts.stream()
                .filter(p -> p.getpName().toLowerCase().contains(prdName.toLowerCase()))
                .collect(Collectors.toList());

        return matchingProducts;
    }
    
    /**
     * This is the method for search product using product brand.
     * @param prdBrand
     * @return
     */
    public static List<Product> searchProductByBrand(String prdBrand) {
        List<Product> matchingProducts = new ArrayList<>();
        List<Product> allProducts = ProductDLL.getAllProducts();

        // Search with complete matching name only
        matchingProducts = allProducts.stream()
                .filter(p -> p.getBrand().equalsIgnoreCase(prdBrand))
                .collect(Collectors.toList());

        return matchingProducts;
    }
    
    /**
     * This is the method for printing all the products.
     * @return
     */
    public static List<Product> getAllProductsInDescendingOrderOfPrice() {
        List<Product> allProducts = ProductDLL.getAllProducts();

        // Sort products in descending order of price
        allProducts.sort((p1, p2) -> Integer.compare(p2.getPrice(), p1.getPrice()));

        return allProducts;
    }
}