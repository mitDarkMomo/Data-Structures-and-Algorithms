public class Node {
    private int val;
    private Node next;

    Node(int _val) {
        val = _val;
    }
}

public class LRUCatch {
    private Node catch;
    private int SIZE = 10;

    public void set(int _val) {
        Node newNode = new Node(_val);
        newNode.next = catch;
        catch = newNode;

        int count = 0;
        while (newNode.next != null && count < SIZE) {
            if(newNode.next.val == _val) {
                newNode.next = newNode.next.next;
                break;
            }

            newNode = newNode.next;
            count++;
        }

        if(count == SIZE - 1) {
            newNode.next = null;
        }
    }
    
}