package node;

public class Node<E> {
    private E data;
    private Node next;

    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
