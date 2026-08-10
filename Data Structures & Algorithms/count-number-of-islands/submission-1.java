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
        Deque<int[]> q = new ArrayDeque<>();
        grid[r][c] = '0';
        q.offer(new int[]{r,c});
        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        while(!q.isEmpty()) {
            int[] node = q.poll();
            int rw = node[0], cl = node[1];

            for (int[] d : dir) {
                int nr = rw + d[0];
                int nc = cl + d[1];

                if ( nr >= 0 && nc >= 0 &&
                     nr < grid.length && nc < grid[0].length && 
                     grid[nr][nc] == '1') {
                        q.offer(new int[] {nr, nc});
                        grid[nr][nc] = '0';
                     }
            }
        }
    }
}
