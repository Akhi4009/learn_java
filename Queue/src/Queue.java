import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {
    private LinkedList<Integer> items;

    public Queue(){
        this.items = new LinkedList<>();
    }

    public void enqueue(int ele){
        this.items.add(ele);
    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue underflow");
        }
        return this.items.removeFirst();
    }
    public int front(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue underflow");
        }
        return this.items.getFirst();
    }

    public boolean isEmpty(){
        return this.items.isEmpty();
    }
    public int size(){
        return this.items.size();
    }
    public void print(){
        for (int item : this.items){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.print();
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
