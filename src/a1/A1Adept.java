package a1;

import java.util.*;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numberOfStoreItems = scan.nextInt();

		ArrayList<String> itemNames = new ArrayList<String>();
		
		ArrayList<Double> itemPrices = new ArrayList<Double>();

		for (int i = 0; i < numberOfStoreItems; i++)
		{
			String nameOfItem = scan.next();			

			double priceOfItem = scan.nextDouble();

			itemNames.add(nameOfItem);

			itemPrices.add(priceOfItem);
		}

		int numberOfCustomers = scan.nextInt();

		double maximumTotal = 0;
		double minimumTotal = 0;
		double addedTotal = 0;

		String biggestName = "";
		String smallestName = "";

		for (int i = 0; i < numberOfCustomers; i++)
		{
			String firstName = scan.next();
			String lastName = scan.next();

			int numberOfItemsBought = scan.nextInt();

			double itemsTotal = 0.0;

			for (int j = 0; j < numberOfItemsBought; j++)
			{

				int quantityOfItem = scan.nextInt();

				String nameOfItem = scan.next();

				double price = itemPrices.get(itemNames.indexOf(nameOfItem));

				itemsTotal += (price * quantityOfItem); 
			}
			
			addedTotal += itemsTotal;

			if(minimumTotal == 0) minimumTotal = itemsTotal;
			
			if (itemsTotal > maximumTotal)
			{
				maximumTotal = itemsTotal;

				biggestName = firstName + " " + lastName;
			} 

			if (itemsTotal <= minimumTotal)
			{
				minimumTotal = itemsTotal;

				smallestName = firstName + " " + lastName;
			}
		}
		
		double averageTotal = (addedTotal / numberOfCustomers);

		String max = String.format("%.2f", maximumTotal);
		String min = String.format("%.2f", minimumTotal);
		String average = String.format("%.2f", averageTotal);
		
		System.out.println("Biggest: " + biggestName + " (" + max + ")" );
		System.out.println("Smallest: " + smallestName + " (" + min + ")");
		System.out.println("Average: " + average);
	}
}
