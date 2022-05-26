class NumberOfIslands {
    public void visitAdjacentLand(int row, int column, char[][] grid, boolean visited[][]) {
        if (row >= grid.length || column >= grid[0].length || row < 0 || column < 0) {
            return;
        }

        else if (!visited[row][column] && grid[row][column] == '1') {
            visited[row][column] = true;
            visitAdjacentLand(row, column + 1, grid, visited);
            visitAdjacentLand(row, column - 1, grid, visited);
            visitAdjacentLand(row + 1, column, grid, visited);
            visitAdjacentLand(row - 1, column, grid, visited);
        }

        return;
    }



    public int numIslands(char[][] grid) {
        int count = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    visitAdjacentLand(i, j, grid, visited);
                }
            }
        }
        return count;
    }
}