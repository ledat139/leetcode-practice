func twoSum(nums []int, target int) []int {
    store := make(map[int]int)
    result := []int{}
    for i := 0; i < len(nums); i++ {
        temp := target - nums[i] 
        _, exist := store[temp]
        if exist {
            result = append(result, store[temp], i)
            return result
        } else {
            store[nums[i]] = i
        }
    }
    return result
}