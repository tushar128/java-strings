package tushar.com;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="Tushar";
StringBuilder sb = new StringBuilder(str);
System.out.println(sb.reverse());

// Aproch 4
StringBuffer sb1 = new StringBuffer(str);
System.out.println(sb1.reverse());
	}

}
