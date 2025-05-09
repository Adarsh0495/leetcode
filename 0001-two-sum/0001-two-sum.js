/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
function twoSum(nums, target) {
    let numMap = {};
        for (let i = 0; i < nums.length; i++) {
        let complement = target - nums[i];
                if (numMap.hasOwnProperty(complement)) {
            return [numMap[complement], i];
        }
        
        numMap[nums[i]] = i;
    }
}