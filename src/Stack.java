package src;

import java.util.EmptyStackException;

public class Stack<T> {

    private Node<T> top;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }

    public Stack(){
        top = null;
        size = 0;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        top = null;
        size = 0;
    }
}

