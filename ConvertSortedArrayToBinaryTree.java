class Solution {
    public TreeNode BST(int[] nums, int low, int high) {
        if(low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BST(nums, low, mid-1);
        root.right = BST(nums, mid +1 , high);
        return root;
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }

        return BST(nums, 0, nums.length - 1);
    }
}