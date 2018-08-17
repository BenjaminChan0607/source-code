package com.cs.stru.util;

import java.util.Iterator;

/**
 * @author benjaminChan
 * @date 2018/8/16 0016 下午 7:58
 */
public interface Set<E> extends Collection<E> {

    int size();

    boolean isEmpty();

    boolean add(E e);

    boolean remove(Object o);

    boolean contains(Object o);

    Iterator<E> iterator();

    void clear();

    Object[] toArray();

    boolean equals(Object o);
}
