import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        
        // Convert to lowercase so "Madam" and "madam" both work
        s = s.toLowerCase();
        
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        
        if (s.equals(reversed)) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is NOT a Palindrome");
        }
    }
}