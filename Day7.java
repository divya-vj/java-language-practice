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