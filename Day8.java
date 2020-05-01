/*Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.*/


class Solution {
    public ListNode middleNode(ListNode head) {
     ListNode current = head;//store the head
      int length = 0;
      ListNode middle = head;

      while(current.next != null){
          length++;
          if(length%2 ==0){//if there are even number of elements in linkedlist
              middle = middle.next;//it will be the second middle element
          }
          current = current.next;
      }

      if(length%2 == 1){
          middle = middle.next;
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : "                                  + middle);
     return middle;
    }
}
