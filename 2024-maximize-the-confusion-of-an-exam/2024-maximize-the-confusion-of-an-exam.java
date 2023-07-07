class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0;
        int count = 0;
        int maxlen = Integer.MIN_VALUE;
        int n = answerKey.length();
        for(int i = 0; i < n; i++){
            if(answerKey.charAt(i) == 'F'){
                count++;
            }
            while(count > k){
                if(answerKey.charAt(left) == 'F'){
                    count--;
                }
                left++;
            }
            maxlen = Math.max(maxlen,(i - left) + 1);
        }
        left = 0;
        count = 0;
         for(int i = 0; i < n; i++){
            if(answerKey.charAt(i) == 'T'){
                count++;
            }
            while(count > k){
                if(answerKey.charAt(left) == 'T'){
                    count--;
                }
                left++;
            }
            maxlen = Math.max(maxlen,(i - left) + 1);
        }
         return maxlen;
    }
   
}