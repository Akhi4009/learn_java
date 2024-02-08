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

function mergeSortedArrays(
    nums1:number[],m:number,nums2:number[],n:number
):number[]{

    let i = m-1;
    let j = n-1;
    let k = m+n-1;
    while (i >=0 && j >=0){
        if(nums1[i] > nums2[j]){
            nums1[k--] = nums1[i--]
        }else{
            nums1[k--] = nums2[j--]
        }
    }
    while (j >=0){
        nums1[k--] = nums2[j--];
    }
    return nums1;
}

const  arr1:number[] = [1,2,3,4,4,5]
const arr2:number[] = [2,3,5,6,7]
console.log(mergeSortedArrays(arr1,6,arr2,5))
// console.log(findDuplicate(arr1));
//
// const arr = [1,2,3,4,5,7];
// console.log(missingNumber(arr));
// console.log(rotateArray(arr1,3));