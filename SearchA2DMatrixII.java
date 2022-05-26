class Solution {
    private int binarySearch(int[] arr, int start, int finish, int target) {
        if (finish >= start) {
            int mid = start + (finish - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                return binarySearch(arr, mid + 1, finish, target);
            }
            else if(arr[mid] > target) {
                return binarySearch(arr, start, mid - 1, target);
            }
        }

        return -1;

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int index = binarySearch(matrix[i], 0, matrix[i].length - 1, target);
            if (index != -1) {
                return true;
            }
        }
        return false;
    }
}