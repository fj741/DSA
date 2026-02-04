class LinkedListCycleDetection{

    public static boolean detectCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow.data == fast.data){
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]){
        Node head = new Node(0);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = head;

        if(detectCycle(head)){
            System.out.println("Circular");
        }
        else{
            System.out.println("Not Circular");
        }
    }
}