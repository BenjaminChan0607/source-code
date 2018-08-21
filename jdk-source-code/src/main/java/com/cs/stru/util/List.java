package com.cs.stru.util;

import java.util.Iterator;

/**
 * @author benjaminChan
 * @date 2018/8/16 0016 下午 3:25
 */
public interface List<E> extends Collection<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<E> iterator();

    Object[] toArray();

    boolean add(E e);

    boolean remove(Object o);

    boolean equals(Object o);

    void clear();

}
