package exercise0019;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author oldghoast
 * @date 2022/1/14 16:04
 * @Version 1.0
 */
public class ListNode {

    public int size;
    public Node head;

    public ListNode() {
        this.size = 0;
        this.head = null;
    }

    public class Node {
        public Object data;
        public Node next;

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
}
