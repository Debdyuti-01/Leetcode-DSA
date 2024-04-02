/* Approach 1: To traverse through the string and find substrings and keep comparing the length. Return max length.*/
/* Approach 2: Consider an array to keep track of repeating characters. arr[256] ascii characters. Hence, space complexity will be more. */
/*Approach 3: Consider a HashMap, two pointers to create a window */
/* Time complexity : O(n) , Space Complexity : O(size of string) */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0;
        int right=0;
        int maxLength=0;

        while(right < s.length())
        {
            char ch = s.charAt(right);
            if(map.containsKey(ch))
            {
                left = Math.max(left, map.get(ch));

            }

        maxLength = Math.max(maxLength, right-left+1);
        map.put(ch,right+1);
        right++;

        }
    return maxLength;
    }
}