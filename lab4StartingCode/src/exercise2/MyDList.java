package exercise2;

// Isaac Saffran



public class MyDList<E> {
    public MyNode<E> head;
    public MyNode<E> tail;
    private int size;

    public static class MyNode<E> {
        public E item;  // Renamed from element to item and made public
        public MyNode<E> next;  // Made public
        public MyNode<E> prev;  // Made public

        public MyNode(E item, MyNode<E> prev, MyNode<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    public MyDList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E item) {
        MyNode<E> newNode = new MyNode<>(item, null, head);
        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(E item) {
        MyNode<E> newNode = new MyNode<>(item, tail, null);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (head == null) throw new IllegalStateException("List is empty");
        E item = head.item;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;  // List is now empty
        }
        size--;
        return item;
    }

    public E removeLast() {
        if (tail == null) throw new IllegalStateException("List is empty");
        E item = tail.item;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;  // List is now empty
        }
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
