package strings;

public class strings {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        String txt = "Hello";
        System.out.println(txt.charAt(0));  // H
        System.out.println(txt.charAt(4));  // o

        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2));  // true
        System.out.println(txt3.equals(txt4));  // false

        String txt = "   Hello World   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");
    }
    
}
