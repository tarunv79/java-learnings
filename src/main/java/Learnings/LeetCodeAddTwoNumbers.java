package Learnings;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

public class LeetCodeAddTwoNumbers {

    public static void main(String[] args) {


        //ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        //ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1,new ListNode(9, new ListNode(9)));
        //ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));

        ListNode l3 = new ListNode(0, new ListNode(0, new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(1)))))))))));


        ListNode output = addTwoNumbers(l1,l2);
        System.out.println(getValue(output));
        assert output.equals(l3);

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(ListNode next) {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumberSol2(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int order = 1;
        int sum = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            sum = sum + (x*order + y*order);
            System.out.println("Added: "+x*order +" and "+y*order + " Sum = "+sum);
            order  = order*10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        return dummyHead.next;
    }

    public static ListNode addTwoNumberSolOriginal(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int a = getValue(l1);
        int b = getValue(l2);

        System.out.println("l1="+a +" ,l2="+b);

        int c = a+b;
        if(c==0){
            return new ListNode(0);
        }
        ListNode L = getNext(c);

        System.out.println("Answer:" +getValue(L));

        return L;

    }

    private static ListNode getNext(int n){

       if(n==0){
           return null;
       }
        return new ListNode(n%10 , getNext(n/10));
    }

    public static int getValue(ListNode l){
        int order = 1;
        int a = 0;
        ListNode temp = l;
        while(temp!=null){
            a =  a + (temp.val * order);
            temp = temp.next;
            order = order*10;
        }

        return a;
    }
}


