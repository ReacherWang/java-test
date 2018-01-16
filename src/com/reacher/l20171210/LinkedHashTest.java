package com.reacher.l20171210;

import java.util.Scanner;

/**
 * Created by reacher on 17-12-10.
 */
public class LinkedHashTest {

    /**
     * 1、定义一个数组：
     * 2、数据的初始化形式：假如：n = 5  数据：17 11 20 42 .....
     *      0－－－>head0-->20-->null
     *      1－－－>head1-->11-->null
     *      2－－－>head2-->42-->17-->null
     *      .
     *      .
     *      .
     *      n－－－>headn-->null
     *
     * @param args
     */

    private static final int SIZE = 5;

    public static void main(String[] args) {
        Node[] lists = new Node[5];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int value = scanner.nextInt();
            if (0 == value) {
                break;
            }
            set(value, lists);
        }
        for (int i = 0; i < lists.length; ++i) {
            System.out.print(String.format("List[%s]:-->", (i + 1)));
            Node head = lists[i];
            while (null != head) {
                System.out.print(head.value);
                head = head.next;
                System.out.print("-->");
            }
            System.out.println();
        }
    }

    public static void set(int value, Node[] lists) {
        int key = hash(value);

        Node node = new Node(value);
        if (null != lists[key]) {
            node.next = lists[key];
        }
        lists[key] = node;
    }

    public static final int hash(int value) {
        return value % SIZE;
    }

    public static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
