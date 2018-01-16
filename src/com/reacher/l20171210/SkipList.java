package com.reacher.l20171210;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by reacher on 17-12-10.
 */
public class SkipList {

    private static final int MAX_LEVEL = 7;


    /**
     * (1 | 2) & (3 | 4)
     *
     * 1 & 3 | 1 & 4 | 2 & 3 | 2 & 4
     *
     * @param args
     */
    public static void main(String[] args) {

        Random random = new Random(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);

        Node head = new Node(-1);

        while (true) {
            int value = scanner.nextInt();
            if (0 == value) {
                break;
            }
            Node node = new Node(value);
            int level = random.nextInt(MAX_LEVEL);
            /**
             * if(null != head->nexts[i]) {
             *      node->nexts[i] = head->nexts[i];
             * }
             * head->nexts[i] = node;
             */
            for (int i = 0; i <= level; ++i) {
                if (null != head.nexts[i]) {
                    node.nexts[i] = head.nexts[i];
                }
                head.nexts[i] = node;
            }
        }
        for (int i = MAX_LEVEL - 1; i >= 0 ; --i) {
            Node temp = head.nexts[i];
            System.out.print(String.format("第%s层：", i));
            while (null != temp) {
                System.out.print(temp.data + "-->");
                temp = temp.nexts[i];
            }
            System.out.println();
        }


    }


    /**
     * Node head = new Node(-1);    Node node = new Node(3);
     * Random level = 3
     *
     *  3:------------------------------------------>node3
     *  2:--------->node1--------------------------->node3
     *  1:--------->node1--------------------------->node3
     *  0:--------->node1--------->node2------------>node3
     *  data:-1     data:1         data:2            data:3
     */

    public static class Node {
        private int data;
        private Node[] nexts;

        public Node(int data) {
            this.data = data;
            this.nexts = new Node[MAX_LEVEL];
        }
    }

}
