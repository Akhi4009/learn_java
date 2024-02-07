class Stack{
    constructor() {
        this.items=[];
    }
    push(ele){
        this.items.push(ele);
    }

    pop(){
        if(this.isEmpty()){
            return "underflow";
        }
        return this.items.pop();
    }

    peek(){
        return this.items[this.items.length-1];
    }
    isEmpty(){
        return this.items.length === 0;
    }

    size(){
        return this.items.length;
    }
    print(){
        console.log(this.items.join(' '));
    }
}

const stack = new Stack();
stack.push(1);
stack.push(2)
stack.push(3);
stack.push(4)
stack.print()
console.log(stack.pop());
console.log(stack.peek())
console.log(stack.isEmpty());
console.log(stack.size());