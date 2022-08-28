class Solution {
    
    // public void swap(int ma, int mi){
    //     int temp = mi;
    //     mi = ma;
    //     ma = temp;
    // }
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int ma = ans;
        int mi = ans;
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            if(nums[i]<0){
                // swap(ma,mi);
                int temp = mi;
                mi = ma;
                ma = temp;
            }
            ma = Math.max(nums[i], ma*nums[i]);
            mi = Math.min(nums[i], mi*nums[i]);
            ans = Math.max(ans, ma);
        }
        return ans;
    }
}