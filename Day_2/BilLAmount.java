/*
 Business Requirement:

Clothes:
   1 = no discount
   2 = 20 % discount
   3 or more = 30% discount

Electronic:
   1 = no discount
   2 = 40% discount
   3 or more = 50% discount

 */

package mypackage;

import java.util.Scanner;

public class BilLAmount {

	public static void main(String[] args) {

		String itemType;
		int quantity, unitPrice, billAmount, discount;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the ItemType: ");
		itemType = obj.nextLine();
		
		System.out.println("Enter UnitPrice: ");
		unitPrice = Integer.parseInt(obj.nextLine());
		
		System.out.println("Enter quantity purchased: ");
		quantity = Integer.parseInt(obj.nextLine());
		
		obj.close();
		
		discount = 0;
		
//		if(quantity==2) {
//			discount = (itemType.equals("e"))?40:20;
//		}
//		else if(quantity>=3) {
//			discount = (itemType.equals("e"))?50:30;
//		}
//		else {
//			discount = 0;
//		}
//		
//		billAmount = (100- discount)*quantity*unitPrice/100;
//		System.out.println("Bill Amount: "+billAmount);
		
		discount = (quantity == 2) ? (itemType.equals("e") ? 40 : 20) : (quantity >= 3) ? (itemType.equals("e") ? 50 : 30) : 0;
        billAmount = (100 - discount) * quantity * unitPrice / 100;
        System.out.println("Bill Amount: " + billAmount);
	}

}
