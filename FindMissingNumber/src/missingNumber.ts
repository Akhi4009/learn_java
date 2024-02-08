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
const  arr1:number[] = [1,2,3,4,4,5]
console.log(findDuplicate(arr1));

const arr = [1,2,3,4,5,7];
console.log(missingNumber(arr));