// Insertion at front of LL

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class practice2 {

    // TC - 0(1)
    // SC - 0(1)
    public static void insertAtfirst(Node head, int x){
        Node ptr = head;
        Node newNode = new Node(x);
        newNode.next = ptr;
        printLL(newNode);
    }


    // TC - 0(1)
    // SC - 0(1)
    public static void insertAftertNode(Node head, int pos, int x){
        Node ptr = head;
        int count = 0;
        Node newNode = new Node(x);
        while(count != pos){
            ptr = ptr.next;
            count++;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        printLL(head);
    }


    // TC - 0(1)
    // SC - 0(1)
    public static void insertBeforeNode(Node head, int pos, int x){
        Node ptr = head;
        int count = 0;
        Node newNode = new Node(x);
        while(count < pos-1){
            ptr = ptr.next;
            count++;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        printLL(head);
    }



    public static void printLL(Node head){
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
        int a = 50;
        int pos = 2;
        insertAtfirst(head, a);
        System.out.println("\n");
        insertAftertNode(head, pos, a);
        System.out.println("\n");
        insertBeforeNode(head, pos, a);
    }
}
