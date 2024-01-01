class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int number1 = -1;
        int number2 = -1;
        int len = nums.length;
        
        for(int i=0; i<len; i++) {
            if(nums[i] == number1) {
                count1++;
            } else if(nums[i] == number2) {
                count2++;
            } else if(count1==0){
                number1 = nums[i];
                count1++;
            } else if(count2==0){
                number2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        count1 = 0;
        count2 = 0;
        for(int i=0; i<len; i++) {
            if(nums[i] == number1)
                count1++;
            else if(nums[i] == number2)
                count2++;
        }    
        if(count1 > len/3)
            ans.add(number1);
        if(count2 > len/3)
            ans.add(number2);
        return ans;
    }
}