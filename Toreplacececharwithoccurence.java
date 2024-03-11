package tushar.com;

public class Toreplacececharwithoccurence {

	public static void main(String[] args) {
		// Replace char with an occurence
		String str = " tusharbhartiay";
		char cr = 't';
		/*if(str.indexOf(cr)== -1)
		{
			System.out.println("Given char is not available in it");
		}*/
		char[]  arr = str.toCharArray();
		int r = 1 ;
		for(int i=0 ; i<arr.length ;i++)
		{
			if(arr[i]==cr)// t==t t==u t== s.......t==y
			{
				// 1 approch
			//	arr[i] = String.valueOf(r).charAt(0);
				//2 approch
				arr[i] =(char) (r + '0' ) ;
				r++;
			}
		}
		//System.out.println (arr);
		System.out.println (new String(arr));
	}

}
