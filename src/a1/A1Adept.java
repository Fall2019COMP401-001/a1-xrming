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
		String[] cusname = new String[customers];
		
		for (int i=0; i < total.length; i++) {
			cusname[i] = scan.next() + scan.next();
			int cart = scan.nextInt();
			
			for (int j=0; j < cart; j++) {
				int howMany = scan.nextInt();
				String what = scan.next();
				for (int k=0; k < item; k++) {
					if (itemName[k] == what) {
						total[i] += itemPrice[k] * howMany;
					}
				}
			}
		}
		
		String average = calculateValueAve(total, cusname);
		String min = findValueMin(total, cusname);
		String max = findValueMax(total, cusname);
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(average);

	}
	
	
	
	static String calculateValueAve(double[] total, String[] cusname) {
		
		double sum = 0;
		
		for (int i=0; i<total.length; i++) {
			sum += total[i];
		}
		double ave = sum/total.length;
		return "Average: " + ave;
	}
	

	
	static String findValueMin(double[] total, String[] cusname) {
		
		double min = total[0];
		int whichOne = 0;
		
		for (int i=0; i<total.length; i++) {
			if (total[i] < min) {
				min = total[i];
				whichOne = i;
			}
		}
		return "Smallest: " + cusname[whichOne] + " (" + min + ")";
	}
	
	
	static String findValueMax(double[] total, String[] cusname) {
		
		double max = total[0];
		int whichOne = 0;
		
		for (int i=0; i<total.length; i++) {
			if (total[i] > max) {
				max = total[i];
				whichOne = i;
			}
		}
		return "Biggest: " + cusname[whichOne] + " (" + max + ")";
	}
	

}
