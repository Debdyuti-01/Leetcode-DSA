class Solution {
    
     int counter = 0; 
    public int countSubstrings(String s) {

        for(int i=0 ; i<s.length();i++)
        {
            counter = palindrome(s,i,i);
            counter = palindrome(s, i, i+1);
        }

        return counter;
        
    }

    public int palindrome(String s, int left, int right)
    {
        
        while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right))
        {
            
            left--;
            right++;
            counter++;
        }

      return counter;
    }
}