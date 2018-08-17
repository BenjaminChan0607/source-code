package com.cs.stru.util;

/**
 * @author benjaminChan
 * @date 2018/8/16 0016 下午 4:47
 */
public interface Map<K, V> {

    int size();

    boolean isEmpty();

    boolean containsKey(Object o);

    boolean containsValue(Object o);

    V put(K k, V v);
}
