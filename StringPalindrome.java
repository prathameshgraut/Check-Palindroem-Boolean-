public class StringPalindrome {

	public static void main(String[] args) {
		String str = "CTX";
		String store = str;
		String res = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}
		boolean yes = store.equals(res);
		if (true) {
			System.out.print(yes);
		} else {
			System.out.print(yes);
		}
	}

}
