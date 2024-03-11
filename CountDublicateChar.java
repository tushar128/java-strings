package tushar.com;

public class CountDublicateChar {

	public static void main(String[] args) {
		// Finds And Count Dublicate char in Strings
		String str =" aabbccddeeffgghh";
		int count =0 ;
		char[] ch = str.toCharArray();
		for (int i =0 ; i<ch.length ;i++)
		{
			for(int j= i+1 ; j<ch.length ; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(" Dublicate aarrays " + ch[j] + " ");
					count ++ ;
				}
				
			}
		}
				System.out.println(" Count the String " + count + " ");
	}

}
