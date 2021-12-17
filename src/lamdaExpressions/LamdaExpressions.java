package lamdaExpressions;

import java.io.IOException;
import java.util.Scanner;

interface Opration {
    boolean check(int a);
}

class CheckNumber{
	
	public static boolean checker(Opration p, int num) {
        return p.check(num);
    }
	
	 public Opration isOdd() {
	        return num -> (num % 2)==1;
	    }
	 
	 public Opration isPrime() {
	        return (num) -> {
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        };
	    }
	 public Opration isPalindrome() {
	        return (num) -> {
	            String str = num + "";
	            String newStr = new StringBuffer(str).reverse().toString();
	            return str.equals(newStr);
	        };
	    }
	
}

public class LamdaExpressions {
	
	public static void main(String[] args) throws IOException {
		
		CheckNumber ob = new CheckNumber();
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Opration op;
        boolean ret = false;
        String ans = null;
        while (number-- > 0) {
          
            int num1 = sc.nextInt();
            int num = sc.nextInt();
            if (num1 == 1) {
                op = ob.isOdd();
                ret = CheckNumber.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            }else if(num1 == 2){
            	 op = ob.isPrime();
                 ret = CheckNumber.checker(op, num);
                 ans = (ret) ? "PRIME" : "COMPOSITE";
            }else if(num1 == 3) {
            	op = ob.isPalindrome();
            	ret = CheckNumber.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
       
		
	}
}
