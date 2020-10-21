package com.song.leetcode.leetcode143;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author Jeremy
 * @Description
 * 143. 重排链表
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 *
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 *
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2020-10-20 14:56
 **/
public class Leetcode143 {
    public static void reorderList(ListNode head) {
        Queue<Integer> singleQueue = new ArrayDeque();
        Stack<Integer> doubleStack = new Stack();
        int count = 0;
        while(head != null){
            count++;
            if (count % 2 == 0) {
                doubleStack.push(head.val);
            } else {
                singleQueue.add(head.val);
            }
            head = head.next;
        }
        head = null;
        ListNode pointer = null;
        while (!doubleStack.isEmpty()) {
            ListNode singleTemp = new ListNode(((ArrayDeque<Integer>) singleQueue).pop());
            ListNode doubleTemp = new ListNode(doubleStack.pop());
            if (head == null) {
                head = singleTemp;
                head.next = doubleTemp;
                pointer = head.next;
            } else {
                pointer.next = singleTemp;
                singleTemp.next = doubleTemp;
                pointer = singleTemp.next;
            }
        }

        if (!singleQueue.isEmpty()) {
            pointer.next = new ListNode(((ArrayDeque<Integer>) singleQueue).pop());
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        reorderList(head);
    }
}
