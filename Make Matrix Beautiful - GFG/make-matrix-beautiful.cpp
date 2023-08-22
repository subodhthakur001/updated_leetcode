//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution
{
    public:
   int findMinOpeartion(vector<vector<int> > mat, int n)
    {
        int msum=0,ans=0;
        for(int i=0;i<n;i++){
            int sum=0 ,sum1=0;
            for(int j=0;j<n;j++){
                sum+=mat[i][j];
                sum1+=mat[j][i];
            }
            msum=max({msum,sum,sum1});
        }
 
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=mat[i][j];
            }
            ans+=abs(msum-sum);
        }
        return ans;
        
    } 
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        vector<vector<int> > matrix (n,vector<int>(n));
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                cin>>matrix[i][j];
        Solution ob;
        cout << ob.findMinOpeartion(matrix, n) << endl;
    }
    return 0;
}


// } Driver Code Ends