package com.song.leetcode.leetcode232;

import java.util.Stack;

/**
 * @Author Jeremy
 * @Description
 * 使用栈实现队列的下列操作：
 *
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2020-10-19 12:34
 **/
public class Leetcode232 {
    private Stack<Integer> stackIn = new Stack();
    private Stack<Integer> stackOut = new Stack();
    public Leetcode232() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public Integer pop() {
        if (stackOut.isEmpty()) {
            if (stackIn.isEmpty()) {
                return null;
            } else {
                for (int i = 0; !stackIn.isEmpty(); i++) {
                    stackOut.push(stackIn.pop());
                }
            }
        }
        return stackOut.isEmpty()? null:stackOut.pop();
    }

    /** Get the front element. */
    public Integer peek() {
        if (stackOut.isEmpty()) {
            if (stackIn.isEmpty()) {
                return null;
            } else {
                for (int i = 0; !stackIn.isEmpty(); i++) {
                    stackOut.push(stackIn.pop());
                }
            }
        }
        return stackOut.isEmpty()? null:stackOut.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode232 obj = new Leetcode232();
        obj.push(1);
        obj.push(2);
        System.out.println("obj.peek() = [" + obj.peek() + "]");
        System.out.println("obj.pop() = [" + obj.pop() + "]");
        System.out.println("obj.empty() = [" + obj.empty() + "]");
    }
}
