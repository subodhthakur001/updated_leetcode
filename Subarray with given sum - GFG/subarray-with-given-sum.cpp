//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(vector<int>arr, int n, long long s)
    {
        // Your code here
        int left = 0;
        int right = 0;
        long long sum = 0;
        if(s == 0) return {-1};
        vector<int> v;
        while(right < arr.size()){
            sum += arr[right];
            while(sum > s){
                sum -= arr[left];
                left++;
            }
            if(sum == s){
                  v.push_back(left+1);
                  v.push_back(right+1);
                  break;
            }
            right++;
        }
        if(v.size() == 0) return {-1};
        return v;
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
        long long s;
        cin>>n>>s;
        vector<int>arr(n);
        // int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends