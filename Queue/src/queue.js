class Queue {
    constructor() {
        this.items = [];
    }
    enqueue(ele){
        this.items.push(ele);
    }
    dequeue(){
        if(this.isEmpty()){
            return "Underflow"
        }
        return this.items.shift();
    }

    front(){
        if(this.isEmpty()){
            return "Underflow"
        }
        return this.items[0];
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

const queue = new Queue();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(4)
queue.print();
console.log(queue.dequeue());
console.log(queue.front());
console.log(queue.isEmpty());
console.log(queue.size());