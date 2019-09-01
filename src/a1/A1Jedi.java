package a1;

import java.util.Scanner;

public class A1Jedi {
	
	static class Item {
		String name;
		int quantity;
		int buy;
		int buyers;
		
		public Item () {
			this.name = "";
			this.quantity = 0;
			this.buy = 0;
			this.buyers = 0;
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int howManyitems = scan.nextInt();
		Item[] list = new Item[howManyitems];
		
		
		for (int i=0; i < list.length; i++) {
			list[i] = new Item();
			list[i].name = scan.next();
			scan.nextDouble();
		}
		
		int customers = scan.nextInt();
		
		for (int i=0; i < customers; i++) {
			scan.next();
			scan.next();
			int items = scan.nextInt();
			
			for (int j=0; j < items; j++) {
				int howMany = scan.nextInt();
				String what = scan.next();
				
				for (int k=0; k < list.length; k++) {
					if (list[k].name.equals(what)) {
						list[k].quantity += howMany;
						list[k].buy += 1 ;
						}
					}
				}
			for (int k=0; k < list.length; k++) {
				if (list[k].buy > 0) {
					list[k].buyers += 1;
					list[k].buy = 0;
				}
			}
			
		}
		
		for (int i=0; i < howManyitems; i++) {
			if (list[i].quantity==0) {
				System.out.println("No customers bought " + list[i].name);
			} else {
				System.out.println(list[i].buyers + " customers bought " + list[i].quantity + " " + list[i].name); 
			}
		}
		
	}
}