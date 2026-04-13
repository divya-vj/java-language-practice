public class Day3 {
    public static void main(String[] args) {
        //switch
        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }
        // Outputs "Thursday" (day 4)

        int day = 4;
        switch (day) {
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
        }
        // Outputs "Looking forward to the Weekend"

        //loops
        int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }

        int countdown = 3;

        while (countdown > 0) {
        System.out.println(countdown);
        countdown--;
        }

        System.out.println("Happy New Year!!");

        //do while loop

        int i = 0;
        do {
        System.out.println(i);
        i++;
        }
        while (i < 5);

        
        int i = 10;

        do {
        System.out.println("i is " + i);
        i++;
        } while (i < 5);

        int dice = 1;

        while (dice <= 6) {
        if (dice < 6) {
            System.out.println("No Yatzy.");
        } else {
            System.out.println("Yatzy!");
        }
        dice = dice + 1;
        }

        //for loop

        for (int i = 0; i < 5; i++) {
        System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
        sum = sum + i;
        }
        System.out.println("Sum is " + sum);

        // Outer loop
        for (int i = 1; i <= 2; i++) {
        System.out.println("Outer: " + i); // Executes 2 times
        
        // Inner loop
        for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        }
        } 

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
            System.out.print(i * j + " ");
        }
        System.out.println();
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
        System.out.println(car);
        }

        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
        System.out.println(num);
        }

        



        










    }
    
}
