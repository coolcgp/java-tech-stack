package com.ranger.behavioral.iterator;

import java.util.Iterator;

/**
 * 描述:
 * 数组迭代器
 *
 * @author chongguanpeng
 * @create 2019-10-17 09:06
 */
public class ArrayIterator<E> implements Iterator {

    private E[] data;

    private int cursor;

    public ArrayIterator(E[] data) {
        this.data = data;
        this.cursor = -1;
    }


    @Override
    public boolean hasNext() {
        boolean empty = this.data == null || this.data.length == 0;
        if (empty) {
            return false;
        }
        return cursor < this.data.length - 1;
    }

    @Override
    public E next() {
        return this.data[++cursor];
    }
}
