class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        emptyString = ""
        if (s == emptyString):
            return 0
        maxCount = 1
        i = 0
        while(i < len(s) - 1):
            Dict = {}
            Dict[i] = s[i]
            count = 1
            j = i + 1
            if(maxCount < len(s) - i):
                while(s[j] not in Dict.values()):
                    count += 1
                    Dict[j] = s[j]
                    if(j < len(s) - 1):
                        j += 1
                    else:
                        break
            maxCount = max(count, maxCount)
            i += 1
        return maxCount