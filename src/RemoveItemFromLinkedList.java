import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class RemoveItemFromLinkedList {
    public static void main(String[] args) {
        ListNide mainListNide = new ListNide(3);
        ListNide listNode2 = new ListNide(3);
        ListNide listNode3 = new ListNide(1);
//        ListNide listNode4 = new ListNide(4);
//        ListNide listNode5 = new ListNide(5);
        mainListNide.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
        deleteNode(mainListNide, 2);

    }

    public static ListNide deleteNode(ListNide node, int n) {
        ListNide listNide = null;
        boolean looping = true;
        while (looping) {
            if (node.next == null) {
                looping = false;
            } else {
                if (node.val == n) {
                    node = node.next;
                } else {
                    if (listNide == null) {
                        listNide = new ListNide(node.val);
                        node = node.next;
                    } else {
                        ListNide listNide1 = new ListNide(node.val);
                        listNide.next = listNide1;
                        node = node.next;
                    }
                }
            }

        }
        return node;
    }
}

class ListNide {
    int val;
    ListNide next;

    ListNide() {
    }

    ListNide(int val) {
        this.val = val;
    }

    ListNide(int val, ListNide next) {
        this.val = val;
        this.next = next;
    }
}

