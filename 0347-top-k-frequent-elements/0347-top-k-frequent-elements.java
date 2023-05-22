class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i :  nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for(int key : hm.keySet()){
            pq.offer(new Pair<Integer,Integer>(key,hm.get(key)));
        }
        for(int i = 0; i < k; i++){
            arr[i] = pq.poll().getKey();
        }
        System.out.println(pq);
        return arr;
    }
}