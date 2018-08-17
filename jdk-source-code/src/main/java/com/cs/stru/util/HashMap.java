package com.cs.stru.util;

import java.util.LinkedHashMap;

/**
 * @author benjaminChan
 * @date 2018/8/17 0017 上午 10:53
 *
 *  在JDK1.8之前，HashMap采用数组+链表实现，即使用链表处理冲突，同一hash值的节点都存储在一个链表里。
 *  但是当位于一个桶中的元素较多，即hash值相等的元素较多时，通过key值依次查找的效率较低。
 *  而JDK1.8中，HashMap采用数组+链表+红黑树实现，当链表长度超过阈值（8）时，将链表转换为红黑树。
 *
 *  HashMap的实现了。首先有一个每个元素都是链表（可能表述不准确）的数组，当添加一个元素（key-value）时，
 *  就首先计算元素key的hash值，以此确定插入数组中的位置，但是可能存在同一hash值的元素已经被放在数组
 *  同一位置了，这时就添加到同一hash值的元素的后面，他们在数组的同一位置，但是形成了链表，
 *  所以说数组存放的是链表。而当链表长度太长时，链表就转换为红黑树。
 *
 *  HashMap的优化提升了查找的效率
 *
 *  TODO
 *  Map接口还是有点难写的
 */
public class HashMap<K, V> implements Map<K, V> {

    int threshold;

    final float loadFactor;

    transient int size;

    transient int modCount;

    transient Node<K,V> [] table;

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public HashMap() {
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    public HashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    public HashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal initialCapacity:" + initialCapacity);
        }
        if (initialCapacity > MAXIMUM_CAPACITY) {
            initialCapacity = MAXIMUM_CAPACITY;
        }
        if (loadFactor <= 0) {
            throw new IllegalArgumentException("Illegal load factor:" + initialCapacity);
        }
        this.loadFactor = loadFactor;
        /**
         * threshold 一般为 DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY
         * 这里是大于等于initialCapacity的最小的2的幂
         */
        this.threshold = tableSizeFor(initialCapacity);
    }

    /**
     * 大于等于initialCapacity的最小的2的幂
     * @param cap
     * @return
     */
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
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
    public boolean containsKey(Object o) {
        return false;
    }

    @Override
    public boolean containsValue(Object o) {
        return false;
    }

    @Override
    public V put(K k, V v) {
        return putVal(hash(k),k,v,false,true);
    }

    private V putVal(int hash, K k, V v, boolean onlyIfAbsent, boolean evict) {
        Node<K,V>[] tab;Node<K,V> p;int n,i;

        return null;
    }

    /**
     * hash算法
     * @param key
     * @return
     */
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    static class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        final K k;
        V v;
        Node<K,V> next;

        public Node(int hash, K k, V v, Node<K, V> next) {
            this.hash = hash;
            this.k = k;
            this.v = v;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getV() {
            return v;
        }
    }
}
