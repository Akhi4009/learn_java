var Queue = /** @class */ (function () {
    function Queue() {
        this.items = [];
    }
    Queue.prototype.enqueue = function (ele) {
        this.items.push(ele);
    };
    Queue.prototype.dequeue = function () {
        if (this.isEmpty()) {
            return undefined;
        }
        return this.items.shift();
    };
    Queue.prototype.front = function () {
        if (this.isEmpty()) {
            return undefined;
        }
        return this.items[0];
    };
    Queue.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    Queue.prototype.size = function () {
        return this.items.length;
    };
    Queue.prototype.print = function () {
        console.log(this.items.join(' '));
    };
    return Queue;
}());
var queue = new Queue();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(4);
queue.print();
console.log(queue.dequeue());
console.log(queue.front());
console.log(queue.isEmpty());
console.log(queue.size());
