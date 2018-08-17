package com.cs.stru.util;

import java.util.Iterator;

/**
 * @author benjaminChan
 * @date 2018/8/16 0016 下午 4:48
 */
public class LinkedList<E> implements List<E> {

    protected transient int size;
    protected transient int modCount;

    transient Node<E> first;
    transient Node<E> last;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    private int indexOf(Object o) {
        int index = 0;
        for (Node<E> node = first; node != null; node = node.next) {
            if (o.equals(node.value)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    @Override
    public Object[] toArray() {
        Object[] arrays = new Object[]{};
        int i = 0;
        for (Node<E> node = first; node.next != null; ) {
            arrays[i++] = node.value;
        }
        return arrays;
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    private void linkLast(E e) {
        Node<E> t = last;
        Node<E> newNode = new Node<>(e, t, null);
        last = newNode;
        if (t == null) {
            first = last;
        } else {
            t.next = newNode;
        }
        size++;
        modCount++;
    }

    @Override
    public boolean remove(Object o) {
        for (Node<E> node = first; node.next != null; ) {
            if (o.equals(node.value)) {
                unlink(node);
                return true;
            }
        }
        return false;
    }

    private E unlink(Node<E> node) {
        E vale = node.value;
        Node<E> pre = node.pre;
        Node<E> next = node.next;

        if (next == null) {
            pre.next = null;
        } else {
            pre.next = next;
            node.next = null;
        }

        if (pre == null) {
            next.pre = null;
        } else {
            next.pre = pre;
            node.pre = null;
        }

        node.value = null;
        size--;
        modCount++;
        return vale;
    }

    @Override
    public void clear() {
        for (Node<E> node = first; node.next != null; ) {
            Node<E> t = node;
            node.value = null;
            node.pre = null;
            node.next = null;
            node = t;
        }
        first = last = null;
        modCount++;
    }

    private class Node<E> {
        E value;
        Node<E> pre;
        Node<E> next;

        public Node(E value, Node<E> pre, Node<E> next) {
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }

    private class Itr implements Iterator<E> {

        Node<E> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            Node<E> t = current;
            current = t.next;
            E e = t.value;
            return e;
        }
    }
}
