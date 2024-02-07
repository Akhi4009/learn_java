class Stack {
    private items:number[];
    constructor() {
        this.items = [];
    }

    push(ele:number){
        this.items.push(ele);
    }

    pop(): number | undefined {
        if(this.isEmpty()){
            return undefined;
        }
        return this.items.pop();
    }
    peek(): number | undefined {
        if(this.isEmpty()){
            return undefined;
        }
        return this.items[this.items.length -1];
    }
    isEmpty():boolean{
        return this.items.length === 0;
    }
    size():number{
        return this.items.length;
    }
    print(){
        console.log(this.items.join(' '));
    }

}

const stack = new Stack();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);

stack.print();
console.log(stack.pop());
console.log(stack.peek());
console.log(stack.isEmpty())
console.log(stack.size())