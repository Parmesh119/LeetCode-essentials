class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        l=set()
        for i in range(len(nums1)):
            if(nums1[i] in nums2):
                l.add(nums1[i])

        return l