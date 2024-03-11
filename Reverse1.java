package tushar.com;

public class Reverse1 {

	public static void main(String[] args) {
		// Sting java by CharAtt () Methods
		String str = "Tushar";
		//appproch 1
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
		    System.out.println(ch[i]); // Printing without a new line
		}
// approch 2
		
		for (int i = str.length() - 1; i >= 0; i--) {
		    System.out.println(str.charAt(i));
		}
	}

}
