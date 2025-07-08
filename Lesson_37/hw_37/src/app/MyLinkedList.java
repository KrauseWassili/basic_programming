package app;

public class MyLinkedList implements MyList {

    private Node head = null;
    private Node tail = null;
    private int size = 0;



    @Override
    public void add(Product product) {
        if (head == null) {
            Node node = new Node(null, product, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(tail, product, null);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Product get(int index) {
        if (index < 0 || index >= size)
            return null;
        else
            return getNodeByIndex(index).product;
    }

    @Override
    public int indexOf(Product product) {
        Node currentNode = head;
        int counter = 0;
        while (currentNode != null) {
            if (currentNode.product.equals(product))
                return counter;
            currentNode = currentNode.next;
            counter++;
        }
        return -1;
    }

    public String toString() {
        String res = "";
        Node currentNode = head;
        while (currentNode != null) {
            res += currentNode.product + System.lineSeparator();
            currentNode = currentNode.next;
        }
        return res;
    }

    private Node getNodeByIndex(int index) {
        Node currentNode = head;
        int counter = 0;
        while (counter < index && currentNode != null) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    class Node {
        private Node prev;
        private Product product;
        private Node next;

        public Node(Node prev, Product product, Node next) {
            this.prev = prev;
            this.product = product;
            this.next = next;
        }
    }
}
