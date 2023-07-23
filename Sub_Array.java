// Question 4: Java Subarray


import java.io.*;
import java.util.*;

public class Sub_Array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int negative_subarray=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int cur_sum=0;
                for(int k=i;k<=j;k++){
                    cur_sum+=arr[k];
                }
                if(cur_sum<0){
                    negative_subarray++;
                }
            }
        }
        System.out.println(negative_subarray);
    }
} 
