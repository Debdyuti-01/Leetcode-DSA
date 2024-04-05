/* Time : O(n), Space: O(26) */

class Solution {
    public int characterReplacement(String s, int k) {

        int arr[] = new int[26];                      // Array to store counts of each Uppercase alphabet A-Z
        int left = 0;                                 // window start pointer
        int maxCount=0;                               // Keeps track of frequency count of all alphabets: Keeps the highest value
        int maxLength=0;                              // Keeps the max Length of the window where replacement will take place

        for(int right = 0; right<s.length(); right++)
        {
            arr[s.charAt(right)-'A']++;                     // Increments the frequency of character came across by right pointer. (-'A') we did to get the index value
            maxCount = Math.max(maxCount, arr[s.charAt(right)-'A']);     // Keeps track of the max frequency in the array

            if((right-left-maxCount+1)> k)                  // If (window length - max count ) > K
            {
                arr[s.charAt(left)-'A']--;                  // Then decrement the count of the value pointed by left pointer rn in the array
                left++;                                     // Slowly slide the window from left side by incrementing y 1
            }
            
            maxLength = Math.max(maxLength, (right-left+1));      // Return the max Length of the window finally
        }

        return maxLength;
    }
}