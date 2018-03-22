package com.ysp.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class YList {



    public static void main(String[] args){
        List list = new ArrayList(2);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString() + "  " + list.size() + " >>> ");
        //list = null;
        System.out.println((list == null ? 11 : list.hashCode()) ^ 11);
        System.out.println(123 ^ 1231);

        int aa = 10;
        System.out.println(aa <<= 3);

        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map.put("a", 1));
        System.out.println(map.put("b", 2));
        System.out.println(map.toString());
        System.out.println(map.put("a", 3));
        System.out.println(map.toString());

        int h =10;
        h ^= (h >>> 20) ^ (h >>> 12);
        System.out.println(h);
        h =10;
        h = (h >>> 20) ^ (h >>> 12);
        System.out.println(10 & 10);

        //Collections.synchronizedList()

    }
}
