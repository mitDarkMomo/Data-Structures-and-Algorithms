//单链表反转
class Node {
    int val;
    Node next;
}

public class LinkUtil {
    public static Node revertLink(Node target) {
        if(target == null || target.next == null) {
            return target;
        }
        
        Node cur = null;
        while(target.next != null) {
            Node next = target.next;
            target.next = cur;
            cur = target;
            target = next;
        }
        
        target.next = cur;
        return target;
    }
    
    public static void main(String[] args) {
        Node target = new Node();
        target.val = 0;
        Node head = target;
        for(int i = 1; i < 6; i++) {
            Node node = new Node();
            node.val = i;
            target.next = node;
            target = node;
        }
        
        Node before = head;
        while(before != null) {
            System.out.println(before.val);
            before = before.next;
        }
        System.out.println("=============================");
        head = LinkUtil.revertLink(head);
        Node after = head;
        while(after != null) {
            System.out.println(after.val);
            after = after.next;
        }
    }
}
