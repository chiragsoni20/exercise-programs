package subString;

import java.util.Scanner;

public class SubString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		for(int i=str.length();i>str.length()-num;--i)                 
		{  
			System.out.print(str.charAt(i-1));           
		}  
		System.out.println();
		for(int i=0; i<num; i++) {
			System.out.print(str.charAt(i));
		}
		
	}

}
