package app1;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E>{
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode!=null;
            }
            @Override
            public E next() {
                if (currentNode!=null) {
                    E value = currentNode.value;
                    currentNode = currentNode.next;
                    return value;
                } else {
                    return null;
                }
            }
        };
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        if (head == null){
            Node<E> node = new Node<>(null, element, null);
            head = node;
            tail = node;
        } else {
            Node<E> node = new Node<>(tail, element, null);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public void add(E element, int index) {
        if (index>=size){
            add(element);
        } else if (index<=0){
            addFirst(element);
        } else {
            Node<E> nextNode = getNodeByIndex(index);
            Node<E> prevNode = nextNode.prev;
            Node<E> newNode = new Node<>(prevNode, element,nextNode);
            size++;
            prevNode.next = newNode;
            nextNode.prev = newNode;


        }
    }

    private void addFirst(E element) {
        Node<E> newNode = new Node<>(null, element,head);
        head.prev = newNode;
        head = newNode;
        size++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index>=size ) {
            return null;
        } else {
            return getNodeByIndex(index).value;
        }

    }



    private Node<E> getNodeByIndex(int index) {
        Node<E> currenNode = head;
        int counter = 0;
        while (counter<index && currenNode!=null){
            currenNode = currenNode.next;
            counter++;
        }
        return currenNode;
    }

    public String toString(){
        String res="";
        Node currentNode = head;
        while (currentNode!=null){
            res += currentNode.value + System.lineSeparator();
            currentNode = currentNode.next;
        }
        return res;
    }

    @Override
    public int indexOf(E element) {
        Node<E> currentNode = head;
        int index = 0;
        while (currentNode!=null){

            if (currentNode.value.equals(element)){
                return index;
            }

            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }




    class Node<E>{

        private Node<E> prev;
        private E value;
        private Node<E> next;

        public Node(Node<E> prev, E value, Node<E> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

    }


}