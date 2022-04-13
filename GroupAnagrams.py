class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        Dict = {}
        for s in strs:
            if tuple(sorted(s)) not in Dict:
                Dict[tuple(sorted(s))] = [s]
            else:
                Dict[tuple(sorted(s))].append(s)
        return Dict.values()