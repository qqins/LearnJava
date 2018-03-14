package learn.how2j.collection.node;

import java.util.Comparator;

/**
 * @author qqins
 */
public class Node {
    public Node leftNode;
    public Node rightNode;
    public Object value;

    public void add(Object obj) {
        if (value == null) {
            value = obj;
        } else {
            if ((int) value - (int) obj >= 0) {
                if (leftNode == null) {
                    leftNode = new Node();
                }
                leftNode.add(obj);
            } else {
                if (rightNode == null) {
                    rightNode = new Node();
                }
                rightNode.add(obj);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        Node node = new Node();
        for (int i : a) {
            node.add(i);
        }
    }
}
