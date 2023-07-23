// Question 2: Find missing numbers in array -
// Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

import java.util.Scanner;
public class MissingNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1]-arr[i];
            if(diff==1);
            else{
                if(arr[i]+1!=arr[i+1]){
                    for(int j=arr[i]+1;j<arr[i+1];j++){
                        System.out.print(j+" ");
                    }
                }
            }
        } 
    }
}
