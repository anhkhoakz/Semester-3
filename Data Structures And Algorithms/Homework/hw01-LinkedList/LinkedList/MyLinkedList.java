import java.util.NoSuchElementException;

class MyLinkedList implements ListInterface {
    Node head;

    @Override
    public void addFirst(int item) {
        head = new Node(item, head);
    }

    @Override
    public int count() {
        int size = 0;

        for (Node n = head; n != null; n = n.getNext()) {
            size++;
        }
        return size;
    }

    @Override
    public void print() {
        System.out.print("[");
        for(Node n = head; n != null; n = n.getNext()) {
            System.out.print(n.getElement() + " ");
        }
        System.out.println("]");
    }

    @Override
    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        int value = head.getElement();
        head = head.getNext();
        return value;
    }

}