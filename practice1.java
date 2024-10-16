class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class practice1 {
    public static void traverseLL(Node head){

        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverseLL(head);
    }
}