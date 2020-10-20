package com.song.leetcode.leetcode141;

/**
 * @Author Jeremy
 * @Description 单链表
 * @Date 2020-10-19 15:53
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}