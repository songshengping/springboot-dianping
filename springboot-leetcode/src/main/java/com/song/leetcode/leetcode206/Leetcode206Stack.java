package com.song.leetcode.leetcode206;

import java.util.Stack;

/**
 * @Author Jeremy
 * @Description
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解决:使用堆栈的方式反转单链表
 * @Date 2020-10-19 12:34
 **/
public class Leetcode206Stack {

    public static ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode headNext = null;
        Stack<Integer> stack = new Stack();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (!stack.isEmpty()) {
            ListNode temp = new ListNode(stack.pop());
            if (result == null) {
                headNext = result  = temp;
            } else {
                headNext.next = temp;
                headNext = headNext.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        reverseList(listNode);
    }

}

