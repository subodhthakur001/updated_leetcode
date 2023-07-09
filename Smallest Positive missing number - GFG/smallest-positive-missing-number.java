//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
       // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){//loop for inserting elemets of the array into hashmap
            map.put(arr[i],0);
        }
        for(int i=1;i<arr.length+1;i++){//traversing from 1-size
            if(!map.containsKey(i)){
                return i;// returning the first element which was missing
            }
        }
       return arr.length+1;//last case if all the positive elements upto size are already present in the array
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends