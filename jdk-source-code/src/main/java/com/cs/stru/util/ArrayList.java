package com.cs.stru.util;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author benjaminChan
 * @date 2018/8/16 0016 下午 4:01
 */
public class ArrayList<E> implements List<E> {

    private int size;

    protected transient int modCount = 0;

    transient Object[] elementData;

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_OBJECT_ARRAY = new Object[]{};

    public ArrayList() {
        this.elementData = EMPTY_OBJECT_ARRAY;
    }

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
        return indexOf(o) >= 0;
    }

    /**
     * Object 为null时的特殊情况
     *
     * @param o
     * @return
     */
    private int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (elementData[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public boolean add(E e) {
        if (elementData == EMPTY_OBJECT_ARRAY || size > DEFAULT_CAPACITY) {
            elementData = Arrays.copyOf(elementData, size + DEFAULT_CAPACITY);
        }
        elementData[size++] = e;
        modCount++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                fastRemove(i);
                return true;
            }
        }
        return false;
    }

    private void fastRemove(int i) {
        modCount++;
        int numMoved = size - i - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, i + 1, elementData, i, numMoved);
        }
        elementData[--size] = null;
    }

    @Override
    public void clear() {
        modCount++;
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    private class Itr implements Iterator<E> {
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public E next() {
            return (E) elementData[cursor++];
        }
    }
}
