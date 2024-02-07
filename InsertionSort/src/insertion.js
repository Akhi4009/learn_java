function insertionSort(arr){
    const n = arr.length;
    for (let i=1; i < n; i++){
        let key = arr[i];
        let j= i-1;
        while (j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }
    return arr;
}


const arr =[2,1,3,5,4];
console.log(insertionSort(arr));
const array = [64, 34, 25, 12, 22, 11, 90];
console.log(insertionSort(array));