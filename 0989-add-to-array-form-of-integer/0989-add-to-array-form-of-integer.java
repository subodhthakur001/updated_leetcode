class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = num.length-1;
        while (n>=0 || k!=0){
            if (n>=0){
                k+=num[n];
                n--;
            }
            list.addFirst(k%10);
            k/=10;
        }
        return list ;
    }
}
// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         String s = "";
//         List<Integer> ans = new ArrayList<>();
//         for(int i: num){
//             s=s+i;
//         }
//        System.out.println(s);
//         long n = Long.parseLong(s)+k;
//         System.out.println(n);
//         System.out.println(n);
//         while(n>0){
//             long d = n%10;
//             System.out.println(d);
//             ans.add((int)d);
//             n=n/10;
//         }
//       Collections.reverse(ans);
//         return ans;
//     }

// }