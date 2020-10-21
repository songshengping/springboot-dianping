package com.song.leetcode.leetcode143;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jeremy
 * @Description //TODO
 * @Date 2020-10-20 15:31
 **/
public class Leetcode143M2 {
    public static void reorderList(ListNode head) {
        int nodeIndex = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        while (head != null) {
            nodeIndex++;
            map.put(nodeIndex, head);
            head = head.next;
        }
        ListNode p = head = map.get(1);
        for (int i = 2; i < nodeIndex; i++){
            int insertIndex = --nodeIndex;
            ListNode insert = map.get(insertIndex);
            ListNode temp = map.get(i);
            p.next = insert;
            insert.next = temp;
            p = temp;
            temp.next = null;
        }
        if (map.size() != 0 && map.size() % 2 == 0) {
            p.next = map.get(map.size() / 2 + 1);
            p.next.next = null;
        }
    }
}
