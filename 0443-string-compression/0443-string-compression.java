class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int p = 0;
        int diff = 0;
        while(j <chars.length){
            
            if(chars[j] != chars[i]){
                diff = j - i; 
                if(diff > 9){
                    String s = diff + "";
                    System.out.print(s);
                    chars[p] = chars[i];
                    p++;
                    for(int k = 0; k <s.length(); k++){
                        chars[p] = s.charAt(k);
                        p++;
                    }
                    
                }
                else if(diff == 1){
                    chars[p] = chars[i];
                    p++;
                }
                else{
                    chars[p] = chars[i];
                    p++;
                    chars[p] = (char) (diff +'0');
                    p++;
                }
                i=j;
            }
               j++; 
        }
               diff = j - i; 
                if(diff > 9){
                    String s = diff + "";
                    System.out.print(s);
                    chars[p] = chars[i];
                    p++;
                    for(int k = 0; k <s.length(); k++){
                        chars[p] = s.charAt(k);
                        p++;
                    }
                    
                }
                else if(diff == 1){
                    chars[p] = chars[i];
                    p++;
                }
                else{
                    chars[p] = chars[i];
                    p++;
                    chars[p] = (char) (diff +'0');
                    p++;
                }
        return p;
    }
}