package tushar.com;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {
		// With sort method
		String str = "TUSHAR";
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(" Sort the String Array "+ new String(arr)+ " " );
	}

}
