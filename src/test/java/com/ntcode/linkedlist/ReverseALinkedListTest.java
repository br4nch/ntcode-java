package com.ntcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class ReverseALinkedListTest {

    private final ReverseALinkedList main = new ReverseALinkedList();

    @Test
    void reverseList() {
        Node head = new Node(1);
        int n = head.val;
        while (n <= 5) {
            head.next = new Node(n++);
        }
        Node expected = new Node(5);
        int i = expected.val;
        while (i >= 1) {
            expected.next = new Node(i--);
        }
        Node actual = main.reverseList(head);
        while (actual.next != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}