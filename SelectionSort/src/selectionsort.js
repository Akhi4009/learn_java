function selectionSort(arr){
    const n = arr.length;
    for (let i=  0;i < n; i++){
        let minIndex = i;
        for(let j = i +1; j < n; j++){
            if (arr [j] < arr[minIndex]){
                minIndex = j;
            }
        }
        if(minIndex !== i){
            [arr[i],arr[minIndex]] = [arr[minIndex],arr[i]];
        }
    }
    return arr;
}

const arr = [13,45,4,55,22,11,44,5,3]
console.log(selectionSort(arr));