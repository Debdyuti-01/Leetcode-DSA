/* O(n²), as we have nested loops iterating through the string. The outer loop runs for each character in the string, and the inner loop expands around the center to find palindromes. In the worst case, we may need to expand on both sides for every character, resulting in a quadratic time complexity.*/

/*O(1), as we only use a constant amount of extra space to store variables and temporary values.*/ 

class Solution {
    public String longestPalindrome(String s) {

        int maxLength = 1;
        int start = 0;

        if(s.length() <= 1)
            return s;

        for(int i=0; i< s.length();i++)
        {
            int currLen1 = palindrome(s,i,i);  // racecar
            int currLen2 = palindrome(s,i,i+1); // general case
            int currLen = Math.max(currLen1, currLen2);
            if(currLen > maxLength)
            {
                maxLength = currLen;
                start =  i - (currLen-1) / 2;
            }
        }
            return s.substring(start, start+maxLength);
        
    }

    public int palindrome(String s, int left, int right) 
    {
        while(left>= 0 && right < s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }   
}