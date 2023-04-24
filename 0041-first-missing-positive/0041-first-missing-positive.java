class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //Adding all the values to set
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        //Looking for missing integer in ranger 1 to length of array 
        int i=1;
        while(i<=nums.length)
        {
            if(set.contains(i))
            {
                i++;
            }
            else
            {
                return i;
            }
        }

        //If not found returning the length+1 value
        return nums.length+1;
    }
}