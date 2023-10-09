class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int l=lastIndex(nums,target);
        int f = firstIndex(nums,target);
        if(l==-1&&f==-1){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        ans[0]=f;
        ans[1]=l;
        return ans;
        
    }
    public int lastIndex(int[] nums,int target){
        int s=0;
        int l =nums.length-1;
        int last=-1;
        while(s<=l){
            int mid = (s+l)/2;
            if(nums[mid]>target){
                l = mid-1;
            }
            else if(nums[mid]<target){
                s= mid+1;
            }
            else{
                last=mid;
                s=mid+1;
            }
        }
        return last;
    }
    public int firstIndex(int[] nums,int target){
        int s=0;
        int l =nums.length-1;
        int first=-1;
        while(s<=l){
            int mid = (s+l)/2;
            if(nums[mid]>target){
                l = mid-1;
            }
            else if(nums[mid]<target){
                s= mid+1;
            }
            else{
                first=mid;
                l= mid-1;
            }
        }
        return first;
    }
}