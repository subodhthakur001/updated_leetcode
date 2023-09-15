class Solution {
    int[]f ;
    int find(int x){
        if(f[x]!=x)
        return f[x]=find(f[x]);
        return f[x];
    }
    void union(int x,int y){
        x = find(x);
        y = find(y);
        if(x<y)
        f[y]=x;
        else
        f[x]=y;
    }
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> p = new PriorityQueue<>((a,b)->a[2]-b[2]);
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                p.offer(new int[]{i,j,Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1])});
            }
        }
        f = new int[points.length];
        for(int i=0;i<points.length;i++)
            f[i]=i;
        int c=0,d=0;
        while(c<points.length-1){
            int[] a = p.poll();
            if(find(a[0])==find(a[1]))continue;
             c++;
            union(a[0],a[1]);
            d+=a[2];
        }
        return d;
    }
}