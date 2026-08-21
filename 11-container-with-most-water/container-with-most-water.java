class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;

        while(left<right){
            int l = right-left;//finding the length
            int h = Math.min(height[left],height[right]);
            int area = l*h;
            maxWater = Math.max(maxWater,area);
        
            if(height[left] < height[right]){
            left++;
        }
            else {
            right--;
            }
            
        }
        return maxWater;


    }
}