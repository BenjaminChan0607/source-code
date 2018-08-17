package com.cs.stru.util;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author benjaminChan
 * @date 2018/8/16 0016 下午 8:03
 */
public class HashSet<E> implements Set<E> {

    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public HashSet() {
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Object[] toArray() {
        Object[] arrays = new Object[]{};
        int i = 0;
        for (Object o : map.keySet()) {
            arrays[i++] = o;
        }
        return arrays;
    }
}
