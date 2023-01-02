from ast import List


class RemoveDuplicatesfromSortedArray:
    def removeDuplicates(self, nums: List[int]) -> int:
        j=1
        for i in range(1,len(nums)):
            if nums[i-1]!=nums[i]:
                nums[j]=nums[i]
                j+=1
        return j