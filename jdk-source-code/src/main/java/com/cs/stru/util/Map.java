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

    V get(Object key);

    V remove(Object key);

    void clear();

    Set<K> keySet();

    Set<Map.Entry<K, V>> entrySet();

    interface Entry<K, V> {

        K getKey();

        V getV();

        boolean equals(Object o);

        int hashCode();
    }

    boolean equals(Object o);

    int hashCode();

    default V replace(K key, V value) {
        V curValue = null;
        if (containsKey(key)) {
            curValue = put(key, value);
        }
        return curValue;
    }
}
