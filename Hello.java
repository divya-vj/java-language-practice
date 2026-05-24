import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String s1 = sc.nextLine().toLowerCase();
        
        System.out.println("Enter second string:");
        String s2 = sc.nextLine().toLowerCase();
        
        // If lengths differ they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("NOT Anagrams");
            return;
        }
        
        // Convert to char array, sort, compare
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("NOT Anagrams");
        }
    }
}