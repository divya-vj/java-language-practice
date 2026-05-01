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

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // two pointer setup
        int left = 0;
        int right = n - 1;

        // reverse logic
        while(left < right) {

            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // move pointers
            left++;
            right--;
        }

        // print reversed array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // j tracks position for next non-zero
        int j = 0;

        // move all non-zero elements to front
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // fill remaining positions with 0
        while(j < n) {
            arr[j] = 0;
            j++;
        }

        // print result
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // n = how many numbers should be there
        int n = sc.nextInt();
        int[] arr = new int[n - 1]; // array has n-1 elements

        // take array input
        for(int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // expected sum if no number was missing
        int expectedSum = n * (n + 1) / 2;

        // actual sum of given array
        int actualSum = 0;
        for(int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }

        // missing number
        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // track largest and second largest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            if(arr[i] > first) {
                second = first;    // old first drops to second
                first = arr[i];    // new element becomes first
            }
            else if(arr[i] > second && arr[i] != first) {
                second = arr[i];   // new second largest found
            }
        }

        // check if second largest exists
        if(second == Integer.MIN_VALUE) {
            System.out.println("No second largest exists");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}
