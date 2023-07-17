//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
    //  int arr[]=new int[26];
    HashMap<Character, Integer> hm = new HashMap<>();
     StringBuilder sb = new StringBuilder();
     Queue<Character> queue = new LinkedList<>();
     
     for(int i=0;i<A.length();i++){
         char c=A.charAt(i);
         hm.put(c,hm.getOrDefault(c,0)+1);
         queue.add(c);
         
         while(!queue.isEmpty() && hm.get(queue.peek()) > 1){
             queue.remove();
         }
         if(queue.isEmpty()){
             sb.append('#');
         }
         else{
             sb.append(queue.peek());
         }
     }
     return sb.toString();
    }
}