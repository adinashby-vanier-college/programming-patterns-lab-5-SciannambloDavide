package com.prog2.labs;

/**
 * @author adinashby
 *
 */
public class LabFive {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public static ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = new ListNode(head.val, head);
        ListNode previous = temp; 
        ListNode current = head;
        while (current != null) {
            if (previous.val <= current.val) {
                previous = current;
                current = current.next;
                continue;
            }
            ListNode p = temp;
            while (p.next.val <= current.val) {
                p = p.next;
            }
            ListNode t = current.next;
            current.next = p.next;
            p.next = current;
            previous.next = t;
            current = t;
        }
        return temp.next;
    }
}
