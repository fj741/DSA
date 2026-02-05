public class ReverseLinkedList{
    public static Node reverseNode(Node head){
        Node current = head;
        Node previous = null;

        while(current!=null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }


        return previous;
    }


    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node result = reverseNode(head);
        result.printNode(result);

    }
}