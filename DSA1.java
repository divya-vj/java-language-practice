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

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // assume first element is both max and min
        int max = arr[0];
        int min = arr[0];

        // start loop from index 1 (already checked index 0)
        for(int i = 1; i < n; i++) {

            if(arr[i] > max) {
                max = arr[i]; // found new maximum
            }

            if(arr[i] < min) {
                min = arr[i]; // found new minimum
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
