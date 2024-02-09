function twoSum(nums,target){
    const numMap = {};
    for (let i =0; i < nums.length; i++){
        const complement = target - nums[i];
        if(numMap.hasOwnProperty(complement)){
            return [numMap[complement], i];
        }
        numMap[nums[i]] = i;
        console.log(numMap);
    }
    return []
}

const arr = [1, 3, 4, 5, 6]
console.log(twoSum(arr,7))