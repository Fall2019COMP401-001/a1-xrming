package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Novice {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		

		int people = scan.nextInt();
		
		double[] total = new double[people];
		char[] firstName = new char[people];
		String[] lastName = new String[people];
		
		for (int i=0; i<total.length; i++) {
			String first = scan.next();
			firstName[i] = first.charAt(0);
			lastName[i] = scan.next();
			int items = scan.nextInt();
			double[] list = new double[items];
						
			for (int j=0; j<list.length; j++) {

				int quantity = scan.nextInt();
				String name = scan.next();
				Double price = scan.nextDouble();
				list[j] = quantity * price;
			}
			
			total[i] = sumIt(list);
			
			System.out.println(firstName[i] + ". " + lastName[i] + ": " + df.format(total[i]));
		}
		
		
	}
	
	static double sumIt(double[] list) {
		
		double sum = 0;
		for (int i=0; i<list.length; i++) {
			sum += list[i];
		}
		return sum;
	}

}
