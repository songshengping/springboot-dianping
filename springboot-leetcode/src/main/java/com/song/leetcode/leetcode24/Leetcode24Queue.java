package com.song.leetcode.leetcode24;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author Jeremy
 * @Description 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例 1：
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * <p>
 * 示例 2：
 * 输入：head = []
 * 输出：[]
 * <p>
 * 示例 3：
 * 输入：head = [1]
 * 输出：[1]
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2020-10-19 12:35
 **/
public class Leetcode24Queue {

    public static ListNode swapPairs(ListNode head) {
        int count = 0;
        ListNode result = null;
        ListNode resuleNext = null;
        Queue<Integer> queue = new ArrayDeque();
        ListNode next = null;
        while (head != null) {
            count++;
            if (count % 2 == 0) {
                queue.add(head.val);
                queue.add(next.val);
                next = null;
            } else {
                next = new ListNode(head.val);
            }
            head = head.next;
        }
        if (next != null) {
            queue.add(next.val);
        }
        while(!queue.isEmpty()){
            result = new ListNode(((ArrayDeque<Integer>) queue).removeFirst());
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = swapPairs(head);
        System.out.println("args = [" + result + "]");
    }
}
