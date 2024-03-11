package tushar.com;

public class Dublicatechar {

	public static void main(String[] args) {
		
		String str =" aabbccddeeffgghh";
		int count = 0 ;
		
		for (int i =0 ; i<str.length() ;i++)
		{
			char ch  = str.charAt(i);
			for(int j= i+1 ; j<str.length() ; j++)
			{
				char c = str.charAt(j);
				if(ch==c)
				{
					System.out.println(" Dublicate aarrays " + str.charAt(j) + " ");
					count ++ ;
				}
				
			}
		}
				System.out.println(" Count the String " + count + " ");
	}

}
