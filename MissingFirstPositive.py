from ast import List

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        exist = set(nums)
        for i in range(1, len(nums) + 2):
            if i not in exist:
                return i