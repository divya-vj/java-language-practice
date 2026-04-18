public try {
    // code that might throw an error
    int result = 10 / 0;   // ArithmeticException!
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    // always runs, whether error occurred or not
    System.out.println("This always runs");
} Day7 {
    
}
try {
    int[] arr = new int[5];
    arr[10] = 1;               // ArrayIndexOutOfBoundsException
    String s = null;
    s.length();                // NullPointerException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of range!");
} catch (NullPointerException e) {
    System.out.println("Null reference!");
} catch (Exception e) {       // catches any other exception
    System.out.println("Some error: " + e.getMessage());
}

static int divide(int a, int b) throws ArithmeticException {
    if (b == 0) throw new ArithmeticException("Divide by zero");
    return a / b;
}

// When calling:
try {
    System.out.println(divide(10, 0));
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ... your code
        sc.close();  // good practice to close
    }
}

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();           // reads integer
double d = sc.nextDouble();     // reads decimal
String word = sc.next();        // reads one word (stops at space)
String line = sc.nextLine();    // reads full line including spaces
long l = sc.nextLong();         // reads long
boolean b = sc.nextBoolean();   // reads true/false

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();            // first, read size
int[] arr = new int[n];          // create array
for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();       // read each element
}
// Input given as:
// 5
// 1 2 3 4 5

Scanner sc = new Scanner(System.in);
int t = sc.nextInt();    // number of test cases
while (t-- > 0) {
    int n = sc.nextInt();
    // solve for this test case
    System.out.println(result);
}
// Input:
// 3       ← 3 test cases
// 5       ← first case input
// 10      ← second case
// 2       ← third case

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();   // ← consume leftover newline after nextInt()!
String s = sc.nextLine();   // now this reads correctly

// Without sc.nextLine() in between, the String reads empty!

Scanner sc = new Scanner(System.in);
int rows = sc.nextInt(), cols = sc.nextInt();
int[][] matrix = new int[rows][cols];
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
    }
}
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

import java.io.*;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine().trim());
String[] parts = br.readLine().split(" ");
int[] arr = new int[n];
for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(parts[i]);

// Use this when Scanner is too slow (large test cases > 10^5)