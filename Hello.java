String s="divya";

for(int i=0;i<s.length;i++){
    char c=s.charAt(i);
    System.out.println(c);
}

//string reversal

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        String reversed="";

        for (int i=s.length()-1;i>=0;i--){
            reversed = reversed+s.charAt(i);

        }
        System.out.println("reversed" + reversed)
    }}
}

