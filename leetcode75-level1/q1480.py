class Solution(object):
    def runningSum(self, nums):
        list = []
        x = 0
        for i in range(len(nums)):
            x += nums[i]
            list.append(x)
        return list


nums = [3,1,2,10,1]
sol = Solution()
result = sol.runningSum(nums)
print(result)
