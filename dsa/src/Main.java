public class Main {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.display();
    }
}

class  Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next =null;
    }
}

class LinkedList {
    Node head;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display(){
        Node current = head;
        while (current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

