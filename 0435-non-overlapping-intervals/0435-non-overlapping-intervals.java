class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<Pair> list = new ArrayList<>();
        for(int[] a : intervals){
            list.add(new Pair(a[0],a[1]));
        }
        Collections.sort(list,(a,b) -> a.second - b.second);
        // for(int i = 0; i < list.size(); i++){
        //     System.out.println(list.get(i).first + ">" + list.get(i).second);
        // }
        int count = 0;
        int n = list.size();
        for(int k = 0,j =1;k < n && j < n;j++ ){
            if(list.get(k).second > list.get(j).first){
                count++;
            }
            else{
                 k = j;
            }
        }
        return count;
    }
   
}
 class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }