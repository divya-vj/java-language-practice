import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        int result=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                result=i;
                break;
            }
        }

        if(result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("result found at index " + result);
        }

    }
}