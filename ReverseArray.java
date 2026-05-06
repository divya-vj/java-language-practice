/*import java.util.Scanner;

public class MaxMin{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
}*/

import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int left=0;
        int right=n-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");

        }

    }
}

