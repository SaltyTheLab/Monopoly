package org.example;

public class CircularLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    // Add a new node to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head to make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain the circular nature
        }
    }

    public Node<T> location() {
        return head;
    }

    public T step() {
        if (head != null)
            head = head.next;
        return head.data;
    }
}