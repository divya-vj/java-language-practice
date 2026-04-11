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






}
        }
    }
    
}
