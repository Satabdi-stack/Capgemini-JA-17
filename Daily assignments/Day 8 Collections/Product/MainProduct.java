package capgemini.code;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		int ch = 0;
		Product[] pList = new Product[4];
		pList[0] = new Product(1234, "Monitor", 5000);
		pList[1] = new Product(1111, "Keyboard", 500);
		pList[2] = new Product(1211, "Mouse", 1100);
		pList[3] = new Product(3411, "Speakers", 800);
		
		Product p = new Product();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter choice:\n1. Update details\n2. View Details\n3. Search details\n4. Delete Product\n5. Exit");
			try {
				ch = sc.nextInt();
				
				switch(ch) {
				case 1:
					System.out.println("Enter the pid to update product details");
					int pid = sc.nextInt();
					p.updateProductById(pList, pid);
					break;
				case 2:
					System.out.println("The details are: ");
					p.displayProductDetails(pList);
					break;
				case 3:
					System.out.println("Enter pid to search: ");
					pid = sc.nextInt();
					p.findProductById(pList, pid);
					break;
				case 4:
					System.out.println("Enter pid to delete: ");
					pid = sc.nextInt();
					p.deleteProductById(pList, pid);
					break;
				default:
						System.out.println("Exiting!");
				}
				
			} catch (NumberFormatException e) { e.printStackTrace(); }
			
		}
		while (ch != 5);
		sc.close();
		
	}

}