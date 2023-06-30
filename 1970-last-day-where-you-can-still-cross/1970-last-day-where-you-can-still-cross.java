class Solution {
    // instead of searching for land pathways from top to bottom, we can track whether there is an eight-connected
    // water way from left to right. For that we check, if our current cell neighbors a cell, that has a
    // connection to the left or right side, and if it does, update recursively all neighbors, that are
    // now also connected. these neighbor checks happen at most 2 times per cell, so we run in O(n * m)
    public int latestDayToCross(int row, int col, int[][] cells) {
        int[][] connected = new int[row + 2][col + 2]; // larger grid to avoid doing range checks all the time
        int[][] dirs = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};

        int day = 1;
        for (int[] cell : cells) {
            int r = cell[0], c = cell[1]; // cells are 1 based, so they are already centered in our larger array and no offset is needed
            boolean left = c == 1, right = c == col; // base case: cell is in left or right side

            for (int[] dir : dirs) { // check if we are connected to right or left side
                int neighbor = connected[r + dir[0]][c + dir[1]];
                if (neighbor == 2) left = true;
                else if (neighbor == 3) right = true;
            }

            if (left && right) return day - 1;
            
            connected[r][c] = left ? 2 : (right ? 3 : 1);

            // update previously unconnected neighbors
            if (left) connect(r, c, 2, connected, dirs);
            else if (right) connect(r, c, 3, connected, dirs);

            day++;
        }
        return -1; // won't be reached
    }

    private void connect(int row, int col, int side, int[][] grid, int[][] dirs) {
        for (int[] dir : dirs) {
            int x = row + dir[0], y = col + dir[1];
            if (grid[x][y] == 1) {
                grid[x][y] = side;
                connect(x, y, side, grid, dirs);
            }
        }
    }
}