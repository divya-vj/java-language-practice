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
