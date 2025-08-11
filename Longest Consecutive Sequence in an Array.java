class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lastsmall =Integer.MIN_VALUE,count=0,largest=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]-1 ==lastsmall){
                count+=1;
                lastsmall=nums[i];
            }
            else if(nums[i]!= lastsmall){
                count =1;
                lastsmall=nums[i];
            }
            largest=Math.max(largest,count);
        }
        return largest;
    }
}
