package lab7;

import lab6.Rate;

import java.util.*;

public class MyList<E> implements List<Rate> {
    private Node head;
    private Node tail;
    private int size;

    public MyList() {
    }

    public MyList(Rate rate) {
        add(rate);
    }

    public MyList(Collection<? extends Rate> collection) {
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // todo fix
    @Override
    public boolean contains(Object o) {
        for (Rate rate : this) {
            if (rate.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Rate> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Rate> {
        protected Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Rate next() {
            /*if (!hasNext()) {
                throw new NoSuchElementException();
            }*/
            try {
                Rate rate = currentNode.getRate();
                currentNode = currentNode.getNext();
                return rate;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();
            }
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Rate rate) {
        Node node = new Node(rate, null, tail);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Rate> c) {
        boolean isCollectionChanged = false;
        for (Rate rate : c) {
            isCollectionChanged |= add(rate);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Rate> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Rate get(int index) {
        return null;
    }

    @Override
    public Rate set(int index, Rate element) {
        return null;
    }

    @Override
    public void add(int index, Rate element) {

    }

    @Override
    public Rate remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Rate> listIterator() {
        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<Rate> {
        /*private Node currentNode = head;
        @Override
        public boolean hasNext() {
            return false;
        }
        @Override
        public Rate next() {
            return null;
        }*/

        @Override
        public boolean hasPrevious() {
            return currentNode.getPrevious() != null;
        }

        @Override
        public Rate previous() {
            currentNode = currentNode.getPrevious();
            return currentNode.getRate();
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Rate rate) {

        }

        @Override
        public void add(Rate rate) {

        }

    }

    @Override
    public ListIterator<Rate> listIterator(int index) {
        return null;
    }

    @Override
    public List<Rate> subList(int fromIndex, int toIndex) {
        return null;
    }
}