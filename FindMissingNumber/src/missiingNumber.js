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

// const array = [1,2,3,4,6,7];
// console.log(missingNumber(array));
const arr =[1,2,3,4,3]
console.log(findDuplicate(arr));