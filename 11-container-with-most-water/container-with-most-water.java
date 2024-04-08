// Time complexity o(n) Space complexity o(1);
class Solution {
    public int maxArea(int[] height) {

        // Two pointer approach
        int left=0,right=height.length-1;
      
        int maxWater=0;

        while(left<right)
        {   
            int minHeight= Math.min(height[left],height[right]);
            int width = right - left;
            maxWater=Math.max(maxWater, (minHeight * width));

            // Rule: To determine how pointers will move, we consider: whichever pointer's height is less, that pointer increments'
            if(height[left] <= height[right]) 
                left++;
            else 
                right--;
        }
        
        return maxWater;
    }
}