class Queue {
    private items:number[];
    constructor() {
        this.items = [];
    }

    enqueue(ele:number){
        this.items.push(ele);
    }
    dequeue(): number | undefined{
        if(this.isEmpty()){
            return undefined
        }
        return this.items.shift();
    }
    front(): number | undefined{
        if(this.isEmpty()){
            return undefined;
        }
        return this.items[0];
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

const queue = new Queue();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(4);
queue.print();
console.log(queue.dequeue());
console.log(queue.front());
console.log(queue.isEmpty());
console.log(queue.size());
