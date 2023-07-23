// Question 3: Find the count of singulars in array -
// Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingularCount {
    public static void main(String args[]){
        int n,count=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(hmap.containsKey(arr[i])){
                hmap.replace(arr[i],hmap.get(arr[i])+1);
            } else {
                hmap.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> e : hmap.entrySet()){
            if(e.getValue()%2!=0){
                count+=1;
            }
        }
        System.out.print("Total number of Singular socks : "+count);
    }
}
