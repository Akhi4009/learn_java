import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
    private ArrayList<Integer> items;

    public Stack(){
        this.items = new ArrayList<>();
    }

    public void push(int ele){
        this.items.add(ele);
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.items.remove(this.items.size() - 1);
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.items.get(this.items.size() -1);
    };

    public boolean isEmpty(){
        return this.items.isEmpty();
    }

    public int size(){
        return this.items.size();
    }

    public void print(){
        for (int item: this.items){
            System.out.print(item + " ");
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}

