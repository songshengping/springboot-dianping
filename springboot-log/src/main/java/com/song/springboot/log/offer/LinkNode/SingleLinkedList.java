package com.song.springboot.log.offer.LinkNode;

/**
 * @Description 单向链表的java实现(offer来了第140页,王磊注)
 * @Date 2020/11/1 19:01
 * @Created by Jeremy
 */
public class SingleLinkedList {
    private int length;// 链表节点的个数
    private Node head;// 头结点
    public SingleLinkedList(){
//        length = 0;
//        head = null;
    }
    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data = data;
        }
    }

    public Object addHead(Object obj){
        Node newHead = new Node(obj);
        if (length == 0) {
            head = newHead;
        } else {
           newHead.next = head;
           head = newHead;
        }
        length++;
        return obj;
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addHead(1);
        sll.addHead(2);
    }
}
