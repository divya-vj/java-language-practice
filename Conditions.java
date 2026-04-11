public class Conditions {
    public static void main(String[] args) {
        //If Statements

        boolean isRaining = true;

        if (isRaining) {
        System.out.println("Bring an umbrella!");

        if (20 > 18) {
        System.out.println("20 is greater than 18");

        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
        }

        int x = 20;
        int y = 20;
        if (x == y) {
        System.out.println("x is equal to y");
        }

        boolean isLightOn = true;

        if (isLightOn) {
        System.out.println("The light is on.");
        }

        boolean isLightOn = false;

        if (isLightOn) {
        System.out.println("The light is on.");  // This will not be printed
        }

        System.out.println("This line runs no matter what, because it is outside the if statement.");

        if (20 > 18)

            System.out.println("20 is greater than 18");

        int x = 20;
        int y = 18;

        if (x > y)
        System.out.println("x is greater than y");  // Belongs to if
        System.out.println("This line runs no matter what (not part of the if statement)");

        // Output:
        // x is greater than y
        // This line runs no matter what (not part of the if statement)


        boolean isRaining = false;

        if (isRaining) {
        System.out.println("Bring an umbrella!");
        } else {
        System.out.println("No rain today, no need for an umbrella!");
        } 

        int time = 20;

        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
        System.out.println("Bring an umbrella.");
        } else if (weather == 2) {
        System.out.println("Wear sunglasses.");
        } else {
        System.out.println("Just go outside normally.");
        }
        // Outputs "Wear sunglasses."

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int x = 15;
        int y = 25;

        if (x > 10) {
        System.out.println("x is greater than 10");
        
        // Nested if 
        if (y > 20) {
            System.out.println("y is also greater than 20");
        }
        }

        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
        System.out.println("Old enough to vote.");
        
        if (isCitizen) {
            System.out.println("And you are a citizen, so you can vote!");
        } else {
            System.out.println("But you must be a citizen to vote.");
        }
        } else {
        System.out.println("Not old enough to vote.");
        }

        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b && c > a) {
        System.out.println("Both conditions are true");
        }

        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b || a > c) {
        System.out.println("At least one condition is true");
        }

        int a = 33;
        int b = 200;

        if (!(a > b)) {
        System.out.println("a is NOT greater than b");
        }

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
        System.out.println("Access granted");
        } else {
        System.out.println("Access denied");
        }

        // Try changing securityLevel to test different outcomes:
        //
        // securityLevel 1 = Access granted
        // securityLevel 2 = Access granted
        // securityLevel 3 = Access denied
        // securityLevel 4 = Access denied
        //
        // If isAdmin = true, access is granted.


}   
        }
    }
    
}
