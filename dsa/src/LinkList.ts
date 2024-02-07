class Nod {
    data:number;
    next:Nod | null;
    constructor(data:number) {
        this.data = data;
        this.next = null;
    }
}

class LinkList {
    head: Nod | null
    constructor() {
        this.head = null;
    }

    insert(data :number){
     const newNode = new Nod(data);
     if(!this.head){
         this.head = newNode;
     }else {
         let current = this.head;
         while (current.next){
             current = current.next;
         }
         current.next = newNode;
     }

    }
    display(){
        let current = this.head;
       while (current){
            console.log(current.data);
            current = current.next;
        }
    }
}

const list = new LinkList();
list.insert(1);
list.insert(3);
list.insert(4)
list.insert(40)
list.display();

function bubblesort(arr: number[]):number[]{
    const len = arr.length;
    for (let i=0; i< len; i++) {
        for (let j = 0; j < len - 1; j++) {
            if(arr[j]>arr[j+1])
            [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
        }
    }
    return arr;
}

const arr = [1,4,3,5,7,9,4]
console.log(bubblesort(arr));