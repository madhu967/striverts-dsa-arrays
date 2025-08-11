class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
            }
            max=Math.max(max,arr[i]);
        }
        int left = 0, right = ans.size() - 1;
        while (left < right) {
            int temp = ans.get(left);
            ans.set(left, ans.get(right));
            ans.set(right, temp);
            left++;
            right--;
        }
        return ans;
    }
}
