package com.highradius.product.management.dataaccesslayer;

import com.highradius.product.management.entities.Product;
import com.highradius.product.management.utilities.FilesConstants;
import com.highradius.product.management.utilities.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductDLL {
	
	/**
	 * This is method for saving the data to file
	 * @param prd
	 * @return
	 */
    public static boolean saveProduct(Product prd) {
        try {
            FileWriter fw = new FileWriter(FilesConstants.PRODUCT_FILE_PATH, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(prd.getpId() + "," + prd.getpName() + "," + prd.getBrand() + "," + prd.getPrice() + "\n");
            bw.close();
            return true;
        } catch (Exception ex) {
            Logger.logErrorMessage(ex.getMessage(), "ProductDLL", "saveProduct", "saveProduct");
            return false;
        }
    }

    public static List<Product> getAllProducts() {
        List<Product> allProducts = new ArrayList<>();

        try {
            FileReader fr = new FileReader(FilesConstants.PRODUCT_FILE_PATH);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int pId = Integer.parseInt(data[0]);
                String pName = data[1];
                String brand = data[2];
                int price = Integer.parseInt(data[3]);
                Product product = new Product(pId, pName, price, brand);
                allProducts.add(product);
            }

            br.close();
        } catch (Exception ex) {
            Logger.logErrorMessage(ex.getMessage(), "ProductDLL", "getAllProducts", "getAllProducts");
        }

        return allProducts;
    }
}
