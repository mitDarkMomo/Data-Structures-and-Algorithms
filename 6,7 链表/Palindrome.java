public class Node {
    private int val;
    private Node next;

    public Node(int _val) {
        val = _val;
    }
}

public class Palindrome {
    /**
     * 使用快慢两个指针找到链表中点，慢指针每次前进一步，快指针每次前进两步。
     * 在慢指针前进的过程中，同时修改其 next 指针，使得链表前半部分反序。
     * 最后比较中点两侧的链表是否相等。
     */
    public boolean isPalindrome(Node node) {
        if(node.next == null) {
            return true;
        }
        Node fast = node;
        Node slow = node;
        Node pre = null;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            Node next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }

        if(fast.next != null) {
            slow = slow.next;
        }

        while(slow.next != null) {
            if(pre.val != slow.val) {
                return false;
            }

            pre = pre.next;
            slow = slow.next;
        }

        return true;
    }
}