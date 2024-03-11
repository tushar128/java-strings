package tushar.com;

public class FirstNonRepeted {

	public static void main(String[] args) {
		// Find First non Repeted char
		String str ="aabbccddefghkk";
		char[] arr = str.toCharArray();
		boolean foundNonRepeated = false ;
		for(int i =0 ; i<arr.length ; i++)
		{
		boolean unique = true;
		for(int j =0 ; j<arr.length ; j++)
		{
			if(i!= j && arr[i]== arr[j])
			{
				unique = false ;
				break;
			}
		}
		if(unique)
		{
			foundNonRepeated = true;
		
			System.out.println(" First non repeted char is  " + arr[i]);
			break;
		}
		}
		if (!foundNonRepeated) {
            System.out.println("No non-repeated char found in the string.");
}
}
}