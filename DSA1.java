import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // what to search
        int target = sc.nextInt();
        // search logic
        int result = -1; // assume not found
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                result = i; // found at index i
                break;      // stop searching
            }
        }
        // print result
        if(result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }
}


