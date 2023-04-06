class Solution {
    
    public boolean isOnPerimeter(int i,int j,int rows,int cols)
    {  //is cell is on border return false else true
        return (i == 0 || j == 0 || i == rows - 1||j == cols - 1);
    }
    public boolean isClosedIsland(int i,int j,int[][] grid)
    {
        int m = grid.length,n =  grid[0].length;  

       //if cell is water or already visited return true
        if(grid[i][j] == 1 || grid[i][j] == -1)
           return true;
        //utility function to check if a cell is on perimter
        if(isOnPerimeter(i,j,m,n)) return false;
        
       //mark cell as visited
       grid[i][j] = -1;
       boolean left = isClosedIsland(i,j - 1,grid);
       boolean right = isClosedIsland(i,j + 1,grid);
       boolean up = isClosedIsland(i - 1,j,grid);
       boolean down = isClosedIsland(i + 1,j,grid);
     
//if its four directionally closed or not
       return left && right && up & down;
    }
    public int closedIsland(int[][] grid) {
        
        int count = 0;
        int m = grid.length,n =  grid[0].length;
        for(int i = 1;i < m - 1;i++)
        {
            for(int j = 1;j < n - 1;j++)
            {
                if((grid[i][j] == 0) && isClosedIsland(i,j,grid))
                 count++;
            }
        }

        return count;
    }
}