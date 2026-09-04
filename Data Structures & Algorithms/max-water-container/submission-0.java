class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int res = 0;

        while(left<right){
            int width = right-left;
            int height = Math.min(heights[left], heights[right]);
            int area = width * height;
            res = Math.max(res,area);

            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
