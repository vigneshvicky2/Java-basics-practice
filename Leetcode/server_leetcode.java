// 1267. Count Servers that Communicate

// You are given a map of a server center, represented as a m * n integer matrix grid, where 1 means that on that cell there is a server and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column.

// Return the number of servers that communicate with any other server.

// Example 1:

// Input: grid = [[1,0],[0,1]]
// Output: 0
// Explanation: No servers can communicate with others.
// Example 2:

// Input: grid = [[1,0],[1,1]]
// Output: 3
// Explanation: All three servers can communicate with at least one other server.
// Example 3:

// Input: grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
// Output: 4
// Explanation: The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other. The server at right bottom corner can't communicate with any other server.

public class server_leetcode{
    public static void main(String[] args) {
        //grid = [[1,0],[0,1]] --> 0
        //grid = [[1,0],[1,1]] --> 3
        //grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]] --> 4

        int[][] grid = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int sum;
        int[] col = new int[grid[0].length];
        int[] row = new int[grid.length];
        for(int i=0;i<m;i++){
            sum =0;
            for(int j=0;j<n;j++){
                    sum += grid[i][j];
            }
            row[i] = sum;

        }
        for(int i=0;i<n;i++){
            sum =0;
            for(int j=0;j<m;j++){
                    sum += grid[j][i];
            }
            col[i] = sum;

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(row[i]>1 || col[j]>1){
                        count++;
                }
            }

        }   }
        System.out.println(count); 

    }
}