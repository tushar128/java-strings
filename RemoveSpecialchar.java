package tushar.com;

public class RemoveSpecialchar {

	public static void main(String[] args) {
		// Remove all special char from Strings
		String str ="Tushar@30";
		String rl = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(rl);
		String withoutSpaces = rl.replaceAll(" ", ""); // Remove spaces
		System.out.println(withoutSpaces);
		
	}

}
