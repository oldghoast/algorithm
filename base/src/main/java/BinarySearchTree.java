/**
 * @ClassName BinarySearchTree
 * @Description 二分查找树
 * @Author oldghoast
 * @date 2021/12/9 14:39
 * @Version 1.0
 */
public class BinarySearchTree {

    //根节点
    public Node root;

    //树节点
    public class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.data = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    //查找节点
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (key > current.data) {
                current = current.rightChild;
            } else if (key < current.data) {
                current = current.leftChild;
            } else {
                return current;
            }
        }
        return null;
    }

    //插入节点
    public boolean insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            //根节点为null
            root = node;
            return true;
        } else {
            Node current = root;
            Node parent = null;
            while (current != null) {
                parent = current;
                if (current.data > data) {//遍历左子树
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return true;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
