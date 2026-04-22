
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Primitive array
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");


        int[] array={10,20,30};
        //index starts @ 0 always
        array[0] = 10
        array[2]=30

        //length
        int n=array.length;

        //take array input 

        import java.util.Scanner;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size of arr
        int[] array=new int[n];

        for (int array[i = 0; i<n;i++){
            array[i] =sc.nextInt();//take each element
        }

        
        }
    }
    
}
