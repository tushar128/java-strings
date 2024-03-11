package tushar.com;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// Find dublicate 
		String a = "AABBCCddEEEFF";
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                char ch = a.charAt(j);
                if (i != j && ch == c) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                res += c;
            }
        }

        System.out.println("Remove duplicate array: " + res);
	}

}
