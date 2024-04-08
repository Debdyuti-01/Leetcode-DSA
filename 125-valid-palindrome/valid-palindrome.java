/* Time: O(n), Space: O(1) */
class Solution {
    public boolean isPalindrome(String s) {

       // Prepared a regex for removing non-alphabets and white space within the string
        String newString= s.replaceAll("([^0-9a-zA-Z]|\\s)+","").toLowerCase();

        // Consider two pointer approach : one pointer at start of string and another at the end of string
        // Both pointers in each iteration moves towards each other that is moves towards the middle of the string
        int left=0;
        int right=newString.length()-1;
    
        while(left < right)
        {
            if(newString.charAt(left) != newString.charAt(right))
            {
                return false;
            }

           left++; 
           right--;
           
        }

    return true;
    }
}