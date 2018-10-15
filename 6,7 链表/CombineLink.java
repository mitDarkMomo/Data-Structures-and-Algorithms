//两个有序的链表合并
class Node {
    int val;
    Node next;
    
    Node(int _val) {
        val = _val;
    }
}

public class CombineLink {
    public static Node combineLink(Node _link1, Node _link2) {
        Node cur = new Node(-1);
        Node head = cur;
        
        while(_link1 != null && _link2 != null) {
            if(_link1.val <= _link2.val) {
                cur.next = _link1;
                _link1 = _link1.next;
            } else {
                cur.next = _link2;
                _link2 = _link2.next;
            }
            
            cur = cur.next;
        }
        
        if(_link1 == null) {
            cur.next = _link2;
        } else {
            cur.next = _link1;
        }
        
        return head.next;
    }
    
    public static void main(String[] args) {
        Node link1 = new Node(0);
        Node head = link1;
        for(int i = 1; i < 4; i++) {
            Node node = new Node(i);
            link1.next = node;
            link1 = link1.next;
        }
        link1 = head.next;
        
        Node link2 = head;
        for(int i = 4; i < 8; i++) {
            Node node = new Node(i);
            link2.next = node;
            link2 = link2.next;
        }
        link2 = head.next;
        
        
        head = combineLink(link1, link2);
        while(head != null) {
            System.out.println("Node value is: " + head.val);
            head = head.next;
        }
    }
}
