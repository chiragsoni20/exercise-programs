package linklist;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkList {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			int num1 = sc.nextInt();
			
			ArrayList<Integer> numbers1 = new ArrayList<>();
			for(int j=0; j<num1; j++) {
				numbers1.add(sc.nextInt());
			}
			numbers.add(numbers1);
		}
		
		int num2 = sc.nextInt();
		
		for(int i=0; i<num2; i++) {
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			
			try {
				
				System.out.println(numbers.get(num3-1).get(num4-1));
				
			}catch (Exception e) {
				System.out.println("Error");
			}
			
		}
		
	}

}
