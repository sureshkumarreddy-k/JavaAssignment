// Question 12: Reverse Nodes in k-Group
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)
      return head;

    final int length = getLength(head);
    ListNode temp = new ListNode(0, head);
    ListNode prev = temp;
    ListNode curr = head;

    for (int i = 0; i < length / k; ++i) {
      for (int j = 0; j < k - 1; ++j) {
        ListNode next = curr.next;
        curr.next = next.next;
        next.next = prev.next;
        prev.next = next;
      }
      prev = curr;
      curr = curr.next;
    }

    return temp.next;
  }

  private int getLength(ListNode head) {
    int length = 0;
    for (ListNode curr = head; curr != null; curr = curr.next)
      ++length;
    return length;
    }
}
