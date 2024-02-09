function twoSum(nums:number[],target:number):number[]{
    const numMap:{[key:number]:number}= {}

    for ( let i =0; i<nums.length; i++){
        const complement:number = target - nums[i];
        if(numMap.hasOwnProperty(complement)){
            return [numMap[complement], i];
        }
        numMap[nums[i]] = i;
        console.log(numMap);
    }
    return [];
}

const arr = [1,3,3,4,5,6];
console.log(twoSum(arr,4));