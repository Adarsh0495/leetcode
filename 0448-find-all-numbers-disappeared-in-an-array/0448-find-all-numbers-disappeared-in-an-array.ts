function findDisappearedNumbers(nums: number[]): number[] {
    // Sort the input array
    nums.sort((a, b) => a - b);

    const result: number[] = [];
    let n = nums.length;

    // Check for missing numbers in the range [1, n]
    let expected = 1;
    for (let i = 0; i < n; i++) {
        // Skip duplicate numbers
        if (i > 0 && nums[i] === nums[i - 1]) {
            continue;
        }
        while (expected < nums[i]) {
            result.push(expected);
            expected++;
        }
        expected++;
    }

    // If there are any remaining missing numbers after the last element
    while (expected <= n) {
        result.push(expected);
        expected++;
    }

    return result;
}