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

        //float myNum = 5.75f;
        System.out.println(myNum);

        //double myNum = 19.99d;
        System.out.println(myNum);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        char myGrade = 'B';
        System.out.println(myGrade);
        
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        //var myNum = 5;         // int
        var myDouble = 9.98;   // double
        var myChar = 'D';      // char
        var myBoolean = true;  // boolean
        var myString = "Hello"; // String

        //Type Casting

        int myInt = 9;
        //double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);    // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        //double myDouble = 9.78d;
        //int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt);    // Outputs 9

        //Operators

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        //int x = 10;
        //int y = 3;

        System.out.println(x + y); // 13
        System.out.println(x - y); // 7
        System.out.println(x * y); // 30
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1

        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5

        
        int a = 10;
        int b = 3;
        System.out.println(a / b);   // Integer division, result is 3

        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d);   // Decimal division, result is 3.333...

        //int x = 5;
        //int y = 3;
        System.out.println(x > y);

        int age = 18;

        System.out.println(age >= 18); // true, old enough to vote
        System.out.println(age < 18);  // false

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));










     }
}
