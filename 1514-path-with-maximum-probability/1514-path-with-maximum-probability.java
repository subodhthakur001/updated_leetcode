class Pair{
    int node;
    double prob;
    public Pair(int node, double prob){
        this.node = node;
        this.prob = prob;
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Queue<Pair> q = new LinkedList<>();
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i< n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<edges.length; i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
        }
        double sProb[] = new double[n];
        Arrays.fill(sProb,(double)-1e9);
        sProb[start] = 1;
        q.add(new Pair(start,1));
        while(!q.isEmpty()){
            Pair cur = q.remove();
            int node = cur.node;
            double p = cur.prob;
            for(Pair i:adj.get(node)){
                int aNode = i.node;
                double eP = i.prob;
                if(sProb[aNode]<eP*p){
                    sProb[aNode]=eP*p;
                    q.add(new Pair(aNode,sProb[aNode]));
                }
            }
        }
        if(sProb[end] == (double)-1e9) return 0;
        return sProb[end];
    }
}