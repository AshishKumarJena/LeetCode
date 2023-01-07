class Solution {
public:
    int jump(vector<int>& nums) {
        int maxR = nums[0];
        int step = nums[0];
        int jump = 1;
        if(nums.size()==1) return 0;
        else if(nums[0] == 0) {
            return -1;
        }
        else {
            for(int i = 1; i < nums.size(); i++) {
                if(i==nums.size()-1) {
                // if(i==n-1&&step) {
                    return jump;
                }
                maxR = max(maxR, i + nums[i]);
                step--;
                // if(step<0)
                //     return -1;
                if(step==0){
                    jump++;
                    if(i>=maxR) {
                        return -1;
                    }
                    step = maxR - i;
                }
            }
        }
        return step;
    }
};