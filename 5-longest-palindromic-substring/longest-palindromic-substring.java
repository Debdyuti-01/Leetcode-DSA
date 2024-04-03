

/* Time: O(n^2) Space O(1) */
class Solution {

   int start; int maxLen;

   public String longestPalindrome(String s) {

        // Base Case:
        if(s.length() < 2) return s;

       for(int i = 0; i < s.length(); i++){

           extendPalindrome(s, i, i);// odd length

           extendPalindrome(s, i, i + 1);// even length

       }

       return s.substring(start, start + maxLen);

   }

   private void extendPalindrome(String s, int left, int right){

       while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){

           left--; 
           right++;

       }    

       if(right - (left + 1) > maxLen){
        // if length is more, increment
           maxLen = right - (left + 1);
        // adjust the pointer.
           start = left + 1;

       }

   }

}