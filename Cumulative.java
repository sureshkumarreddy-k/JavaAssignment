// 1.Cumulative Multiple of an Array with exception handling


import java.util.*;
public class Cumulative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int mul=1;
        
        for(int i=0;i<arr.length;i++){
            mul=arr[i]*mul;
            arr[i]=mul;
        }
        System.out.print("The resultant array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }
        catch(Exception e){
            System.out.println("Enter valid input");
            System.out.print(e);
        }
    }
}
