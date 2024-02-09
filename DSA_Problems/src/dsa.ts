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

function reverseInteger(x: number): number {
    const INT_MAX: number = Math.pow(2, 31) - 1;
    const INT_MIN: number = -Math.pow(2, 31);

    let reversed: number = 0;
    while (x !== 0) {
        const digit: number = x % 10;
        // @ts-ignore
        x = Math.trunc(x / 10);
        if (reversed > INT_MAX / 10 || (reversed === INT_MAX / 10 && digit > 7)) return 0;
        if (reversed < INT_MIN / 10 || (reversed === INT_MIN / 10 && digit < -8)) return 0;
        reversed = reversed * 10 + digit;
    }
    return reversed;
}


console.log(reverseInteger(123));
console.log(reverseInteger(-123));
console.log(reverseInteger(120));
const arr = [1,3,3,4,5,6];
console.log(twoSum(arr,4));