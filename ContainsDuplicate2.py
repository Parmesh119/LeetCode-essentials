from ast import List


class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        n=len(nums)
        d=dict()
        for i in range(n):
            if nums[i] not in d:
                d[nums[i]]=i
            elif nums[i] in d:
                if i-d[nums[i]]<=k:
                    return True
                else:
                    d[nums[i]]=i
        return False