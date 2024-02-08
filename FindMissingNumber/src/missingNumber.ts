function missingNumber(nums:number[]):number{
    const n = nums.length+1;
    const totalSum = (n*(n+1))/2;
    const arraySum = nums.reduce((acc,curr)=>acc+curr,0);
    return totalSum - arraySum;
}

function findDuplicate(nums:number[]):number{
    // @ts-ignore
    const seen = new Set<Number>();
    for (const num of nums){
        if(seen.has(num)){
            return num;
        }
        seen.add(num);
    }
    return -1;
}

function rotateArray(nums:number[],k:number):number[]{
    k= k % nums.length;
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
    return nums;
}
function reverse(arr:number[], start:number, end:number):number[]{
    while (start < end){
        [arr[start],arr[end]] = [arr[end],arr[start]];
        start++;
        end--
    }
    return arr;
}
const  arr1:number[] = [1,2,3,4,4,5]
// console.log(findDuplicate(arr1));
//
// const arr = [1,2,3,4,5,7];
// console.log(missingNumber(arr));
console.log(rotateArray(arr1,3));