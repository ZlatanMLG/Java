package lab7;

import lab6.Rate;

public class Node {
    private Rate rate;
    private Node next;
    private Node previous;

    public Node(Rate rate, Node next, Node previous) {
        this.rate = rate;
        this.next = next;
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Rate getRate() {
        return rate;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}