//链表中环的检测
class Node {
    int val;
    Node next;
    
    Node(int _val) {
        val = _val;
    }
}

public class RingOfLink {
    public static int getRingNum(Node _node) {
        private int firstCount;
        private Node slow = _node;
        private Node fast = _node;
        private int stepCount;
        
        while(fast.next == null || fast.next.next ==null) {
            fast = fast.next.next;
            slow = slow.next;
            stepCount++;
            
            if(fast == slow) {
                if(firstCount != 0) {
                    return stepCount - firstCount;
                } else {
                    firstCount == stepCount;
                }
            }
            
        }
        
        return 0;
    }
}