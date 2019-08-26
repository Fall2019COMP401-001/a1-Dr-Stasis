package a1;

import java.util.*;

public class A1Jedi {

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);		

		int numberOfStoreItems = scan.nextInt();				

		ArrayList<String> itemNames = new ArrayList<String>();

		Map<String, Integer> customersPerItem = new HashMap<String, Integer>();		
		Map<String, Integer> quantityPerItem = new HashMap<String, Integer>();
		
		for(int i = 0; i < numberOfStoreItems; i++)
		{
			String nameOfItem = scan.next();

			double priceOfItem = scan.nextDouble();

			itemNames.add(nameOfItem);

			customersPerItem.put(nameOfItem, 0);

			quantityPerItem.put(nameOfItem, 0);
		}

		int numberOfCustomers = scan.nextInt();

		for(int i = 0; i < numberOfCustomers; i++)
		{
			String firstName = scan.next();
			String lastName = scan.next();						

			Map<String, Boolean> alreadyBought = new HashMap<String, Boolean>();

			int numberOfBoughtItems = scan.nextInt();
			
			for(int j = 0; j < numberOfBoughtItems; j++)
			{								
				int quantityOfItem = scan.nextInt();
				
				String nameOfItem = scan.next();
				
  				int customersWithItem = customersPerItem.get(nameOfItem);
  				
  				if(!(alreadyBought.containsKey(nameOfItem)))
  				{
  					customersWithItem++;

  					alreadyBought.put(nameOfItem, true);
  				}

  				customersPerItem.put(nameOfItem, customersWithItem);

  				int itemQuantity = quantityPerItem.get(nameOfItem);

  				itemQuantity += quantityOfItem;

  				quantityPerItem.put(nameOfItem, itemQuantity);
			}
		}

		for(String itemName : itemNames)
		{
			int customers = customersPerItem.get(itemName);
			int quantity = quantityPerItem.get(itemName);
			
			if(customers == 0) System.out.println("No customers bought " + itemName);				
			
			else System.out.println(customers + " customers bought " + quantity + " " + itemName);
		}
	}
}
