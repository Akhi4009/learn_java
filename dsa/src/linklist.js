class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }

}

class  LinkedList {
    constructor() {
        this.head = null;
    }

    insert(data){
        const newNode = new Node(data);
        if (!this.head){
            this.head = newNode;
        }else{
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

const list = new LinkedList();
list.insert(1);
list.insert(2);
list.insert(3);
list.insert(4);
list.display();