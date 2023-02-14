class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int c = 0;
        while(i >= 0 || j >= 0 || c != 0){
            int sum = 0;
            if(i >= 0){
                sum += a.charAt(i) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
            }
            sum += c;
            if(sum == 1){
                sb.append(1);
                c = 0;
            }
            else if(sum == 2){
                sb.append(0);
                c = 1;
            }
            else if(sum == 3){
                sb.append(1);
                c = 1;
            }
            else{
                sb.append(0);
                c = 0;
            }
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}