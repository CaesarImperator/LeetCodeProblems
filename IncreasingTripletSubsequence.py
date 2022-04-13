class Solution(object):
    def increasingTriplet(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        first = nums[0]
        second = 2**31 - 1
        
        for elem in nums:
            if(elem > first and elem > second):
                return True
            elif(elem > first):
                second = elem
            else:
                first = elem
        return False