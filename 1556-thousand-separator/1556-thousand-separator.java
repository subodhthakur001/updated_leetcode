class Solution {
    public String thousandSeparator(int n) {
        String s = " " +  n;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int pointer = sb.length() - 1;
        int count = 0;
        while(pointer > 0){
            if(count == 3){
                ans.append('.');
                 count = 0;
            }
            ans.append(sb.charAt(pointer));
            count++;
            pointer--;
        }
        return ans.reverse().toString();
    }
}