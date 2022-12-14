class Solution {
    public int longestPalindrome(String s) {
       int charCount[]=new int[128];
        for(char c:s.toCharArray())
        {
            charCount[c]++;
        }
        
        int len=0;
        for(int i:charCount)
        {
            len+=2*(i/2);
        }
        return len<s.length()?len+1:len;
    }
}