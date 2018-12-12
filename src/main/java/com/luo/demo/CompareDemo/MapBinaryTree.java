package com.luo.demo.CompareDemo;

/**
 * @author：罗金星 date 2018/11/23 15:17
 **/

import java.util.Map;

/**
 * 实现二叉树操作
 * @param <K>进行数据存储的Key,通过它，这个key是Comparable的子类
 * @param <V> 保存具体的数据信息
 */
class MapBinaryTree<K extends Comparable<K>,V extends Comparable<V>> {
    public  static  class  Entry<K,V> implements Comparable<K>{
        private  K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }
        public V getValue() {
            return this.value;
        }
        @Override
        public int compareTo(K o){
         return  this.compareTo(o);
        };

    }
    private class Node {
        private MapBinaryTree.Entry<K,V> data;//存放Comparable. 可以比较大小
        private Node parent;
        private Node left;
        private Node right;

        public Node(MapBinaryTree.Entry<K,V> data) {
            this.data = data;
        }

        /**
         * 进行数据检索
         *
         * @param data
         * @return
         */

//        public boolean containsNode(Comparable<K> data) {
//            if (data. compareTo((T) this.data) == 0) {
//                return true;
//            } else if (data.compareTo((T) this.data) <= 0) {
//                if (this.left!=null){
//                    return this.left.containsNode(data);}else {
//                    return false;
//                }
//            } else {
//                if(this.right!=null){
//                    return this.right.containsNode(data);
//                }else {
//                    return  false;
//                }
//
//            }
//        }

        /**
         * 实现节点位置的合适存储
         */
        public void addNode(Node newNode) {
            if (newNode.data.key.compareTo( this.data.key) <= 0) {
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
            MapBinaryTree.this.returnData[MapBinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrayNode();
            }
        }

    }

    private Node root;
    private int count;
    private Object[] returnData;
    private int foot = 0;

//    public void add(Comparable<T> data) {
//        if (data == null) {
//            throw new NullPointerException("保存数据不允许为空");
//        }
//        Node newNode = new Node(data);
//        if (this.root == null) {
//            this.root = newNode;
//        } else {
//            this.root.addNode(newNode);
//        }
//        this.count++;
//    }

    /**
     * 现在检索主要依靠Comparable实现的数据比较
     *
     * @param data
     * @return 查找到返回true, 否则返回false
     */
//    public boolean contains(Comparable<T> data) {
//        if (this.count == 0) {
//            return false;
//        } else {
//            return this.root.containsNode(data);
//        }
//    }

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

