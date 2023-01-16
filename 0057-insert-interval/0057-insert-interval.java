class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for(int[] in : intervals){
            if(newInterval[0] > in[1]){
                ans.add(in);
            }
            else if(newInterval[1] < in[0]){
                ans.add(newInterval);
                newInterval = in;
            }
            else{
                newInterval[0] = Math.min(newInterval[0],in[0]);
                newInterval[1] = Math.max(newInterval[1],in[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}