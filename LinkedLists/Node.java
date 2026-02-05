public class Node {
    public int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
    public void printNode(Node head){
        while(head != null){
            System.out.print(head.data);
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }

    }
}
