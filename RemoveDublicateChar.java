package tushar.com;

public class RemoveDublicateChar  {

    public static void main(String[] args) {
        // Remove duplicate char through nested loop approach
        String a = "abbbccd";
        String res = "";
int i , j;
        for ( i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
           // boolean isDuplicate = false;

            for ( j = 0; j < i; j++) {
                char ch = a.charAt(j);
                if (ch == c) {
                 //   isDuplicate = true;
                    break;
                }
            }

            if (i==j) {
                res += c;
            }
        }

        System.out.println("Remove duplicate array: " + res);
    }
}
