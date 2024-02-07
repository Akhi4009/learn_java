public class Main {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.display();

    BubbleSort ob = new BubbleSort();
    int arr[] = { 1,4,5,6, 7, 9, 8};
    ob.bubbleSort(arr);
    System.out.println("Sorted array");
    for ( int i =0; i< arr.length; i++){
        System.out.println(arr[i] + "");
    }
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

// Bubble sort

 class BubbleSort {
    void bubbleSort(int arr[]){
        int n = arr.length;
        for ( int i=0; i < n; i++){
            for ( int j=0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr [j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
