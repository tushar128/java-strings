package tushar.com;

public class FoundNonrepeted {

	public static void main(String[] args) {
		
		// Find First non Repeated char
		        String str = "a";
		        char[] arr = str.toCharArray();
		        boolean foundNonRepeated = false;

		        for (int i = 0; i < arr.length; i++) {
		            boolean unique = true;
		            for (int j = 0; j < arr.length; j++) {
		                if (i != j && arr[i] == arr[j]) {
		                    unique = false;
		                    break;
		                }
		            }
		            if (unique) {
		                foundNonRepeated = true;
		                System.out.println("First non-repeated char: " + arr[i]);
		                break;
		            }
		        }

		        if (!foundNonRepeated) {
		            System.out.println("No non-repeated char found in the string.");
		        }
		    }
		}

	
