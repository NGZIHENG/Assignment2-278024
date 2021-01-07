package Asgm2;

import java.util.Scanner;

public class Asgm2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String custName;
		String custPhone;
		String custIC;
		int custService=0;
		int hour=0;
		int custLaptop=0;
		int quantity=0;
		double laptopprice = 0.00;
		double totalprice=0.00;
		double amount = 0.00;
		double discountprice=0.00;
		char next=0;
		double pricetopaid=0.00;
		
		
		System.out.println("Brand of Laptop We Sell: 1.hp 2.ASUS 3.Acer 4.Lenovo");
		for (int i=0; i<52; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.print("Enter Your Name: ");
		custName = in.next();
		System.out.print("Enter Your Phone No.: ");
		custPhone = in.next();
		System.out.print("Enter Your IC No.: ");
		custIC = in.next();
			
		do{
			System.out.println();
			System.out.print("Which Brand of Laptop You Want: ");
			custLaptop = in.nextInt();
			
			if (custLaptop == 1) {
				laptopprice = 3600.00;
			}
				
			else if (custLaptop == 2) {
				laptopprice = 5600.00;
			}
			
			else if (custLaptop == 3) {
				laptopprice = 4500.00;
			}
			
			else if (custLaptop == 4) {
				laptopprice = 2800.00;
			}
			
			else if (custLaptop >=5) {
				System.out.print("Invalid");
			}
			
			System.out.print("Quantity You Want To Buy: ");
			quantity = in.nextInt();
			
			totalprice = laptopprice * quantity;
			
			amount = amount + totalprice;
			
			discountprice = amount * 0.20;
			
			pricetopaid = amount - discountprice;
			
			System.out.print("Enter Y If You Want Buy Another Brand: ");
			next = in.next().charAt(0);
		} while (next == 'Y' || next == 'y');
		
		int i=0;
		while (i<52) {
			System.out.print("*");
			i++;
		}
		
		System.out.println();
		System.out.println("Customer Name: " + custName);
		System.out.println("Customer Phone No.: " + custPhone);
		System.out.println("Customer IC No.: " + custIC);
		System.out.println("Amount of Price : RM" + amount);
		System.out.println("Discount 20%: RM" + discountprice);
		System.out.println("Price Need To Be Paid by Customer: RM" + pricetopaid);

	}

}
