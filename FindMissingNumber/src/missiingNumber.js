function missingNumber(num) {
    const n = num.length + 1;
    const totalSum = (n*(n+1))/2;
    const arraySum = num.reduce((acc,curr)=>acc+curr,0);
    return totalSum - arraySum;
}

function findDuplicate(nums){
    const seen = new Set();
    for ( const num of nums){
        if(seen.has(num)){
            return num;
        }
        seen.add(num);
    }
}

// First reverse the entire array,then reverse the first (k) elements, finally reverse
// the rest of the elements;

// This approach ensures that the array is rotated in palce with a time complexity of O(n)
// and a space complexity of O(1), Where n is the length of the array;
function rotateArray(nums,k){
    k = k % nums.length;
    reverse(nums,0,nums.length-1);
    // console.log(nums)
     reverse(nums,0,k-1);
    // console.log(nums);
      reverse(nums,k,nums.length-1);
    return nums;
}

function reverse(nums,start,end){
    while(start < end){
        const temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    return arr;
}

// const array = [1,2,3,4,6,7];
// console.log(missingNumber(array));
const arr =[1,2,3,4,3]
// console.log(findDuplicate(arr));
// console.log(reverse(arr,0,arr.length-1))
console.log(rotateArray(arr,2))
