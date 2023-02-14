from ast import List

class Solution:
    def removeElement(self, list: List[int], val: int) -> int:
        while val in list:
            list.remove(val)