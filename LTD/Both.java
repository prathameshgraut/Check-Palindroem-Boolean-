package LTD;

import java.util.Scanner;

public class Both {

	public static boolean NumberPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = sc.nextInt();
		int sum = num, res = 0, add;

		while (num > 0) {
			add = num % 10;
			res = res * 10 + add;
			num = num / 10;
		}
		boolean yes = (sum == res);
		return yes;
	}

	public static boolean StringPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter Name : ");
		String str = sc.next();
		String store = str;
		String res = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}
		boolean yes = store.equals(res);

		return yes;
	}

	public static void main(String[] args) {
		boolean num = NumberPalindrome();
		System.out.print("Number Palindroem =" + num);

		boolean yes = StringPalindrome();
		System.out.print("String Palindrome =" + yes);

	}

}
