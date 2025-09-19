package innoshriPVTLTD;

import java.util.Scanner;

public class palindromeBoolean {
	
	public boolean Palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num=sc.nextInt();
		int add,res=0,sum=num;
		
		while(num>0) {
			add=num%10;
			res=res*10+add;
			num=num/10;
		}
		boolean yes = (sum==res);
		return yes;
	}
	
	public static void main(String[] args) {
		palindromeBoolean PB = new palindromeBoolean();
		boolean store=PB.Palindrome();
		
		System.out.println(store);
	}

}
