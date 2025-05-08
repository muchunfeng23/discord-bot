package com.yl.place.test;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTest {
    public static void main(String[] args) {
        // 创建一个 ArrayDeque 队列
        Queue<String> queue = new ArrayDeque<>(5);

        // 添加元素到队列
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        queue.add("F");
        queue.add("G");

        // 遍历队列
        System.out.println("遍历队列：");
        for (String item : queue) {
            System.out.println(item);
        }

        // 移除元素
        System.out.println("\n移除元素：");
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }
    }

}
