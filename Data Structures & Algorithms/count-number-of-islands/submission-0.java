class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    bfs(grid, r, c);
                    islands++;
                }
            }
        }
        return islands;
    }

    void bfs (char[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[] {r,c});
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!q.isEmpty()) {
            int[] node = q.poll();
            int row = node[0], col = node[1];

            for (int[] dir : directions) {
                int newrow = row + dir[0];
                int newcol = col + dir[1];
                if ( newrow >= 0 &&
                     newcol >= 0 && 
                     newrow < grid.length && 
                     newcol < grid[0].length &&
                     grid[newrow][newcol] == '1') {
                        q.add(new int[]{newrow, newcol});
                        grid[newrow][newcol] = '0';
                     }
            }
        }
    }
}
