function insertionSort(arr:number[]):number[]{
    const n = arr.length;
    for (let i=0;i<n;i++){
        let key = arr[i];
        let j = i-1;
        while(j >=0 && arr[j] > key){
            arr[j+1] = arr [j];
            j = j-1;
        }
        arr[j+1] = key;
    }
    return arr;
}
const arr = [1.6,4,8,9,23,45,67,98,56,7];
console.log(insertionSort(arr));