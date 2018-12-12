package com.luo.demo.CompareDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author：罗金星 date 2018/11/22 10:33
 * 自定义排序
 **/

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return 0;
        }

    }
}

/**
 * 节点类
 * 实现二叉树的数据操作
 */

class BinaryTree<T extends Comparable<T>> {
    private class Node {
        private Comparable<T> data;//存放Comparable. 可以比较大小
        private Node parent;
        private Node left;
        private Node right;

        public Node(Comparable<T> data) {
            this.data = data;
        }

        /**
         * 进行数据检索
         *
         * @param data
         * @return
         */

        public boolean containsNode(Comparable<T> data) {
            if (data.compareTo((T) this.data) == 0) {
                return true;
            } else if (data.compareTo((T) this.data) <= 0) {
                if (this.left!=null){
                return this.left.containsNode(data);}else {
                    return false;
                }
            } else {
                if(this.right!=null){
                    return this.right.containsNode(data);
                }else {
                    return  false;
                }

            }
        }

        /**
         * 实现节点位置的合适存储
         */
        public void addNode(Node newNode) {
            if (newNode.data.compareTo((T) this.data) <= 0) {
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        /**
         * 实现所有数据的获取处理，按照中序遍历的形式来完成
         */
        public void toArrayNode() {
            if (this.left != null) {
                this.left.toArrayNode();
            }
            BinaryTree.this.returnData[BinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrayNode();
            }
        }

    }

    private Node root;
    private int count;
    private Object[] returnData;
    private int foot = 0;

    public void add(Comparable<T> data) {
        if (data == null) {
            throw new NullPointerException("保存数据不允许为空");
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    /**
     * 现在检索主要依靠Comparable实现的数据比较
     *
     * @param data
     * @return 查找到返回true, 否则返回false
     */
    public boolean contains(Comparable<T> data) {
        if (this.count == 0) {
            return false;
        } else {
            return this.root.containsNode(data);
        }
    }

    /**
     * 以对象数组的形式返回
     *
     * @return
     */
    public Object[] toArray() {
        if (this.count == 0) {
            return null;
        } else {
            this.returnData = new Object[this.count];
            this.foot = 0;
            this.root.toArrayNode();
            return this.returnData;
        }
    }

}

public class Demo1 {
    public static void main(String[] args) {
//        Integer data[]=new Integer[]{10,9,5,2,20};
//        String data[]=new String[]{"c","b","a"};
//        Person[] persons = new Person[]{
//                new Person("小花", 11),
//                new Person("小红", 12),
//                new Person("小九", 13),
//        };
//        Arrays.sort(persons);
//        System.out.println(Arrays.toString(persons));
        binaryTreeToString();
    }

    public static void binaryTreeToString() {
        BinaryTree<Person> tree = new BinaryTree<Person>();
        tree.add(new Person("小花", 10));
        tree.add(new Person("小红", 11));
        tree.add(new Person("小1", 12));
        tree.add(new Person("小2", 19));
        tree.add(new Person("小3", 6));
        tree.add(new Person("小4", 1));
        tree.add(new Person("小5", 5));
     //   System.out.println(Arrays.toString(tree.toArray()));
        System.out.println(tree.contains(new Person("小1", 2)));
    }

}
