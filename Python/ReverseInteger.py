class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if(x > 0):
            ans = int(str(x)[::-1])
        else:
            ans = int(str(x * -1)[::-1]) * -1
        
        m1 = 2 ** 31 * (-1)
        m2 = 2 ** 31 - 1
        
        if ans > m2 or ans < m1:
            return 0
        return ans