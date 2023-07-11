//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here
int stRow=0;
         int endRow=n-1;
         int stCol=0;
         int endCol=m-1;
         int count=0;
         int total=n*m;
         int ans;
         while(count<=total){
             for(int i=stCol; i<=endCol; i++){
                 ans=A[stRow][i];
                 count++;
                 if(count==k){
                     return ans;
                 }
             }
             stRow++;
             for(int i=stRow; i<=endRow; i++){
                 ans=A[i][endCol];
                 count++;
                 if(count==k){
                     return ans;
                 }
             }
             endCol--;
             for(int i=endCol; i>=stCol; i--){
                 ans=A[endRow][i];
                 count++;
                 if(count==k){
                     return ans;
                 }
             }
             endRow--;
             for(int i=endRow; i>=stRow; i--){
                 ans=A[i][stCol];
                 count++;
                 if(count==k){
                     return ans;
                 }
             }
             stCol++;
         }
         return -1;
    }
}