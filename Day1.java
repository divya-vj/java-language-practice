public class Day1 {
    public static void main(String[] args) {
        
        // variables

        String name="first";
        System.out.print(name);

        /*int myNum = 15;
        System.out.println(myNum);*/

        int myNum;
        myNum = 15;
        System.out.println(myNum);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;

        System.out.println("The sum is " + x + y);   // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        /*int x = 5, y = 6, z = 50;
        System.out.println(x + y + z); // 61*/

        //int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z); // 150

        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;


        // Data types

        //int myNum = 5;       // myNum is an int
        // myNum = "Hello";  // Error: cannot assign a String to an int

        String myText = "Hi"; // myText is a String
        // myText = 123;      // Error: cannot assign a number to a String

    }
}
