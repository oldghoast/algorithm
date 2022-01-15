package exercise0019;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author oldghoast
 * @date 2022/1/14 15:53
 * @Version 1.0
 */
public class Solution {

    public static ListNode removeNthFromEnd(ListNode listNode, int n) {
        ListNode.Node current = listNode.head;
        ListNode.Node pre = listNode.head;
        for(int i=0;i<listNode.size-n;i++){
            pre = current;
            current = current.next;
        }
        pre.next = current.next;
        listNode.size--;
        return listNode;
    }

    public int getLength(ListNode head) {
        return head.size;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.addHead("5");
        listNode.addHead("4");
        listNode.addHead("3");
        listNode.addHead("2");
        listNode.addHead("1");

        ListNode listNode2 = removeNthFromEnd(listNode,2);
        listNode2.display();
    }
}
