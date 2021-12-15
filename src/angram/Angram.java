package angram;

import java.util.Arrays;
import java.util.Scanner;

public class Angram {
	
	public static void main(String[] args) {
		boolean a = Angram.angram();
		if(a==true) {
			System.out.println("angram");
		}else {
			System.out.println("Not angram");
		}
	}
	
	public static boolean angram() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str = sc.nextLine();
		System.out.println("Enter Second String");
		String str1 = sc.nextLine();
		
		int num = str.length();
		int num1 = str1.length();
		
		char[] str2 = str.toCharArray();
		char[] str3 = str1.toCharArray();
		
		if(num!=num1) {
			return false;
		}else {
			
			Arrays.sort(str2);
			Arrays.sort(str3);
			
			for(int i=0; i<num; i++) {
					if (str2[i]!=str3[i]) {
						return false;
					}
				}
			return true;
		}	
	}
}


