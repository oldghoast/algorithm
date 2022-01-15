/**
 * @ClassName a
 * @Description TODO
 * @Author oldghoast
 * @date 11/23/21 4:13 PM
 * @Version 1.0
 */


public class SingleLinkedList {

    private int size;
    private Node head;

    public SingleLinkedList() {
        this.size = 0;
        this.head = null;
    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

    }

    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (this.size == 0) {
            this.head = newHead;
        } else {
            newHead.next = this.head;
            this.head = newHead;
        }
        size++;
        return obj;
    }

    public void display() {
        if (this.size > 0) {
            Node node = this.head;
            int tempSize = this.size;
            if (tempSize == 1) {
                System.out.println("[" + node.data + "]");
                return;
            }
            while (tempSize > 0) {
                if (node.equals(this.head)) {
                    System.out.print("[" + node.data + "->");
                } else if (node.next == null) {
                    System.out.print(node.data + "]");
                } else {
                    System.out.print(node.data + "->");
                }
                node = node.next;
                tempSize--;
            }
        } else {
            System.out.println("[]");
        }
    }


    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("1");
        singleLinkedList.addHead("2");
        singleLinkedList.display();
    }

}
