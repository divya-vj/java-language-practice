
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

        import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // what to search
        int target = sc.nextInt();

        // search logic
        int result = -1; // assume not found

        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                result = i; // found at index i
                break;      // stop searching
            }
        }

        // print result
        if(result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }
}
    }
    
}
