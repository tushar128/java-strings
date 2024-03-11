package tushar.com;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// Remove white spaces

		String str = " T u s h a r";
		String wh = str.replaceAll("\\s+", "");
		System.out.println(wh);
	}
	
}
