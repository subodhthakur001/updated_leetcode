class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
      int[] arr = new int[nums.length];
        int[] res = new int[nums.length-(k-1)];
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && nums[i]>=nums[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                arr[i]=nums.length;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(i);
        }
        int j =0;
        for(int i=0;i<=nums.length-k;i++){
           j=i;
            while(arr[j]<i+k){
                j = arr[j];
            }
            res[i]=nums[j];
        }
        return res;
    }
}