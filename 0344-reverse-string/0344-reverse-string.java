class Solution {
    public void reverseString(char[] s) {
       char temp;    
        int start = 0;
        int len = s.length;
        int end = len-1;
        while (start < end)
        {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        } 
    }
}