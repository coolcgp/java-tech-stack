package com.ranger.behavioral.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述:
 * 入口
 *
 * @author chongguanpeng
 * @create 2019-10-17 09:02
 */
public class Main {

    public static void main0(String[] args) {
        List<Character> list = new LinkedList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            list.add(i);
        }
        Iterator<Character> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println(list.stream().map(String::valueOf)
                .collect(Collectors.joining(",")));

    }

    public static void main(String[] args) {
        String[] str = new String[]{"a", "b", "c"};
        ArrayIterator<String> iterator = new ArrayIterator<>(str);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
