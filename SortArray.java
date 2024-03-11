package tushar.com;

public class SortArray {

	public static void main(String[] args) {
		// Sort the Arrays without sorting  methods
		
        String str = "tushar";
        char arr[] = str.toCharArray();
        char temp;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (char c : arr) {
            System.out.print(c);
        }
	}
}
