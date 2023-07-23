// Question 6: Remove Duplicates from Linked-List

// Skill Mapping: Intermediate

// Description: Consider a Linked-List with N number of repeated integers in Data-Node.

// Task - WAP in Java to remove the repeated integer numbers from Linked-List.

// Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5

// Output:- 2->5->12->3->1


import java.util.*;
public class Duplicate_Remove {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;

    public static void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        Duplicate_Remove llist = new Duplicate_Remove();
        HashSet<Integer> hset = new HashSet<>();
        System.out.print("Enter Elements of LinkedList: ");
        for(int i=0;i<n;i++) {
            int val = sc.nextInt();
            llist.insert(val);
        }
        
        Node temp  = head; 
        Node prev = null;
        while(temp != null) {
            if(!hset.add(temp.data)) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        System.out.print("Elements after removing duplicates are: ");
        Node temp1 = head;
        while(temp1!=null) {
            if(temp1.next!=null)
                System.out.print(temp1.data+"->");
            else
                System.out.println(temp1.data);
            temp1 = temp1.next;
        }
        System.out.println();

    }
}
