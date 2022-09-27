package com.ntcode.linkedlist;

public class Node {
    protected int val;
    protected Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
