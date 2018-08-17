package com.cs.stru.util;

import java.util.HashMap;

/**
 * @author benjaminChan
 * @date 2018/8/16 0016 下午 4:34
 */
public class Test {

    public static void main(String[] args) {
//        listAndSet();
        map();
    }

    private static void map() {
//        java.util.Map<String, String> map = new HashMap<>();
//        map.put("1", "tom");
//        map.put("2", "jerry");
    }

    private static void listAndSet() {
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jerry");
        list.add("thomas");
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("--------------------------------------------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("tom");
        linkedList.add("jerry");
        linkedList.add("thomas");
        for (String string : linkedList) {
            System.out.println(string);
        }
        System.out.println("--------------------------------------------------");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("tom");
        hashSet.add("jerry");
        hashSet.add("thomas");
        for (String string : hashSet) {
            System.out.println(string);
        }
        System.out.println("--------------------------------------------------");
    }
}
