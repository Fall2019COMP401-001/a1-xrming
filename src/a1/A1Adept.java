package a1;

import java.util.Scanner;

public class A1Adept {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int item = scan.nextInt();
		
		String[] itemName = new String[item];
		double[] itemPrice = new double[item];
		
		for (int i=0; i < item; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		
		
		int customers = scan.nextInt();
		
		double [] total = new double[customers];
		String[] firstName = new String[customers];
		String[] lastName = new String[customers];
		
		for (int i=0; i < total.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int cart = scan.nextInt();
			
			for (int j=0; j < cart; j++) {
				int howMany = scan.nextInt();
				String what = scan.next();
				for (int k=0; k < item; k++) {
					if (itemName[k].equals(what)) {
						total[i] += itemPrice[k] * howMany;
					}
				}
			}
		}
		
		double average = calculateValueAve(total);
		int min = findValueMin(total, firstName, lastName);
		int max = findValueMax(total, firstName, lastName);
		
		System.out.println("Biggest: "+ firstName[max]+ " " + lastName[max] + " (" + String.format("%.2f", total[max]) + ")");
		System.out.println("Smallest: "+ firstName[min]+ " " + lastName[min] + " (" + String.format("%.2f", total[min]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));

	}
	
	
	
	static double calculateValueAve(double[] total) {
		
		double sum = 0;
		
		for (int i=0; i<total.length; i++) {
			sum += total[i];
		}
		double ave = sum/total.length;
		return ave;
	}
	

	
	static int findValueMin(double[] total, String[] firstName, String[] lastName) {
		
		double min = total[0];
		int whichOne = 0;
		
		for (int i=0; i<total.length; i++) {
			if (total[i] < min) {
				min = total[i];
				whichOne = i;
			}
		}
		return whichOne;
	}
	
	
	static int findValueMax(double[] total, String[] firstName, String[] lastName) {
		
		double max = total[0];
		int whichOne = 0;
		
		for (int i=0; i<total.length; i++) {
			if (total[i] > max) {
				max = total[i];
				whichOne = i;
			}
		}
		return whichOne;
	}
	

}
