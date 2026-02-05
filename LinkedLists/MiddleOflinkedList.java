public class MiddleOflinkedList {
    public static Node middleOfLinkedList(Node head){
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String args[]){
        Node head = new Node(0);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node result = middleOfLinkedList(head);
        result.printNode(result);
    }
}
