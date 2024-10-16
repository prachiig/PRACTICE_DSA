// Traversal in a singly LL


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class practice1 {


    // TC - O(N)
    // SC- 0(1)
    public static void traverseLL(Node head){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
    }

    // TC - O(N)
    // SC - 0(N) - stack space
    public static void traverseLL_recurcise(Node head){
        Node ptr = head;
        if(ptr == null){
            System.out.println("empty list");
            return;
        }
        else{
            System.out.print(ptr.data+" ");
            traverseLL_recurcise(ptr.next);
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Non-recursive approach:");
        traverseLL(head);
        System.out.println("\n"+"Recursive approach:");
        traverseLL_recurcise(head);
    }
}