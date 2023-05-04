class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new ArrayDeque<>();
        Queue<Integer> qd = new ArrayDeque<>();
        int n = senate.length();
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R'){
                qr.add(i);
            } 
            else {
                qd.add(i);
            }
        }
        while(!(qr.isEmpty()) && !(qd.isEmpty())){
            int r_id = qr.element();
            int d_id = qd.element();
            qr.remove();
            qd.remove();
            if(r_id < d_id){
                qr.add(r_id+n);
            } 
            else{
                qd.add(d_id+n);
            }
        }
        return (qr.size() > qd.size())?"Radiant" : "Dire";
    }
}