package a1;

import java.util.Scanner;

public class A1Jedi {
	
	static class Item {
		String name;
		int quantity;
		int buyers;
		
		public Item (String n, int q, int b) {
			this.name = n;
			this.quantity = q;
			this.buyers = b;
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int howManyitems = scan.nextInt();
		Item[] list = new Item[howManyitems];
		
		
		for (int i=0; i < list.length; i++) {
			list[i] = new Item("", 0, 0);
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
				if (list[i].name.equals(what)) {
					list[i].quantity += howMany;
					list[i].buyers += 1;
				}
			}
			if (list[i].quantity==0) {
				System.out.println("No customers bought " + list[i].name);
			} else {
				System.out.println(list[i].buyers + " customers bought " + list[i].quantity + " " + list[i].name); 
			}
		}
		
	}
}