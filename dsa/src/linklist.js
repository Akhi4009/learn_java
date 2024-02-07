var Nod = /** @class */ (function () {
    function Nod(data) {
        this.data = data;
        this.next = null;
    }
    return Nod;
}());
var LinkList = /** @class */ (function () {
    function LinkList() {
        this.head = null;
    }
    LinkList.prototype.insert = function (data) {
        var newNode = new Nod(data);
        if (!this.head) {
            this.head = newNode;
        }
        else {
            var current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = newNode;
        }
    };
    LinkList.prototype.display = function () {
        var current = this.head;
        while (current) {
            console.log(current.data);
            current = current.next;
        }
    };
    return LinkList;
}());
var list = new LinkList();
list.insert(1);
list.insert(3);
list.insert(4);
list.insert(40);
list.display();
function bubblesort(arr) {
    var _a;
    var len = arr.length;
    for (var i = 0; i < len; i++) {
        for (var j = 0; j < len - 1; j++) {
            if (arr[j] > arr[j + 1])
                _a = [arr[j + 1], arr[j]], arr[j] = _a[0], arr[j + 1] = _a[1];
        }
    }
    return arr;
}
var arr = [1, 4, 3, 5, 7, 9, 4];
console.log(bubblesort(arr));
