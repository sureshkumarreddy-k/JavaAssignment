// Question 5: Merge and Sort the elements in two Linked-List

// Description: Consider two Linked-List with N number of integers in Data-Node respectively.

// Task 1- WAP in Java to merge both Linked-Lists.

// Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.

// Sample input: Linked-List-1:- 25->35->12->4->36->48

// Linked-List-2:- 8->32->22->45->63->49

// Output:- 4->8->12->22->25->32->35->36->45->48->49->63

import java.util.*;
public class MergeAndSort_Linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        LinkedList<Integer> llist1 = new LinkedList<>();
        LinkedList<Integer> llist2 = new LinkedList<>();
        LinkedList<Integer> llist3 = new LinkedList<>();

        System.out.println("Enter elements into LinkedList1: ");
        for(int i=0;i<n;i++) {
            int ele = sc.nextInt();
            llist1.add(ele);
        }

        System.out.println("Enter elements into LinkedList2: ");
        for(int i=0;i<n;i++) {
            int ele = sc.nextInt();
            llist2.add(ele);
        }

        Collections.sort(llist1);
        Collections.sort(llist2);

        int i=0,j=0;
        while(i<n && j<n) {
            if(llist1.get(i) < llist2.get(j)) {
                llist3.add(llist1.get(i));
                i++;
            } else if(llist1.get(i) > llist2.get(j)) {
                llist3.add(llist2.get(j));
                j++;
            }
        }

        while(i<n) {
            llist3.add(llist1.get(i));
            i++;
        }

        while(j<n) {
            llist3.add(llist2.get(j));
            j++;
        }
        System.out.print("The elements after merge and sort are: ");
        for(int k=0;k<llist3.size();k++) {
            System.out.print(llist3.get(k)+"->");
        }
    }
}
