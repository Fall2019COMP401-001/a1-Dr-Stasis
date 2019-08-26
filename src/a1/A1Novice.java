package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfCustomers = scan.nextInt();

		for(int i = 0; i < numberOfCustomers; i++)
		{

			String firstName = scan.next();
			String lastName = scan.next();

			int numberOfItems = scan.nextInt();

			double totalOfItems = 0;

			for (int j = 0; j < numberOfItems; j++)
			{
				int quantityOfItem = scan.nextInt();

				String nameOfItem = scan.next();

				double priceOfItem = scan.nextDouble();

				totalOfItems += (priceOfItem * quantityOfItem);
			}			

			String total = String.format("%.2f", totalOfItems);

			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + total);			
		}
	}
}
