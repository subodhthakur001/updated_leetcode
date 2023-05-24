class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        
         //create a pair for nums1 and nums2
        //greedy algo will be we have to find min of nums2 such that min of num2 will be max upon the all possibilites of nums2
        
        int[][] pair = new int[nums1.length][2];
        
        for(int i = 0 ; i < nums1.length ; i++){
            pair[i][0] = nums2[i];
            pair[i][1] = nums1[i];
        }
        
        
        //sort the array on basis of desc order of nums2fddvdvdvdvdfdfdfvdfvzdfv
        Arrays.sort(pair,(a,b)->b[0] - a[0]);
        
        long answer = 0 ;
        
        int j = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,(a,b)->a-b);
        int min = Integer.MAX_VALUE;
        long sum = 0;
        //first add k items frm sorted array and the last item will have min
        
        while(j < k){
            sum+=pair[j][1];
            min = Math.min(min,pair[j][0]);
            pq.offer(pair[j++][1]);
        }
        
        answer = min*sum;
        
        //all the items left in pair[i][0] are can be used as min
        for(int i = j ; i < pair.length ; i++){
            min = pair[i][0];
            //check if the pair[i][1] is greater than smallest of number in our bucket
           if(pq.peek() < pair[i][1]){
                sum = sum + pair[i][1] - pq.poll();
                pq.offer(pair[i][1]);
                answer = Math.max(answer,sum*min);
            }
        }
        
        return answer;
        
    }
}