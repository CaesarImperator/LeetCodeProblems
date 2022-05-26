class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!(queue.isEmpty())) {
            level++;
            int size = queue.size();
            ArrayList<Integer> value = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                value.add(queue.remove().val);
            }
            if (level % 2 == 0) {
                Collections.reverse(value);
            }
            result.add(value);
        }
        return result;
    }
}