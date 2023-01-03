class Solution {
    
    public static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        int ptr1=0;
        int ptr2=nums.length-1;
        int i = 0;
        while(i <= ptr2) {
            if(nums[i]==0) {
                swap(nums, ptr1, i);
                i++;
                ptr1++;
            } else if (nums[i]==1){
                i++;
            } else {
                swap(nums, i, ptr2);
                ptr2--;
            }
        }
    }
}