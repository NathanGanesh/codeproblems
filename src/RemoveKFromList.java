import java.util.List;

public class RemoveKFromList {
    public static void main(String[] args) {
        ListNode mainListNode = new ListNode(0);
        ListNode listNode2 = new ListNode(456);
        ListNode listNode3 = new ListNode(789);
        ListNode listNode4 = new ListNode(0);
//        ListNode listNode5 = new ListNode(7);
        mainListNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
//        listNode4.next = listNode5;
        solution(mainListNode, 0);
//        System.out.println(, -1000);
    }

    static ListNode<Integer> solution(ListNode<Integer> l, int k) {
        ListNode nodeItem = l;
        ListNode currentListNode = null;
        ListNode objectListNode = null;

        if (l.next==null){
           if (l.value==k){
               return null;
           }else {
               return l;
           }
        }
        while (nodeItem.next!=null) {
            if (!nodeItem.value.equals( k + "")) {
                if (currentListNode == null) {
                    currentListNode = new ListNode(nodeItem.value);
                    nodeItem = nodeItem.next;
                } else {
                    if (currentListNode.next == null) {
                        objectListNode = new ListNode(nodeItem.value);
                        currentListNode.next = objectListNode;

                    } else {
                        ListNode listNode = new ListNode(nodeItem.value);
                        objectListNode.next = listNode;
                        objectListNode = listNode;
                    }
                    nodeItem = nodeItem.next;
                    if (nodeItem.next==null){
                        objectListNode.next = new ListNode(nodeItem.value);
                    }
                }
            } else {
                nodeItem = nodeItem.next;
            }
        }
        return currentListNode;
    }

}
