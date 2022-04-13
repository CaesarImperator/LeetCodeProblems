class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        zeroIndex = []
        hasZero = False
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 0:
                    zeroIndex.append(j)
                    hasZero = True
            if hasZero:
                matrix[i] = [0] * len(matrix[i])
                hasZero = False
        for row in matrix:
            for index in range(len(row)):
                if index in zeroIndex:
                    row[index] = 0