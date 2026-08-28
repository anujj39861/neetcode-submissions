class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1pointer = m-1;
        int num2pointer = n-1;
        int resultpointer = m+n -1;
        while(num1pointer >= 0 && num2pointer >= 0){
            if(nums1[num1pointer] > nums2[num2pointer]){
                nums1[resultpointer] = nums1[num1pointer];
                num1pointer--;
            }
            else{
                nums1[resultpointer] = nums2[num2pointer];
                num2pointer--;
            }
            resultpointer--;
        }
        while(num2pointer >= 0){
            nums1[resultpointer] = nums2[num2pointer];
            num2pointer--;
            resultpointer--;

        }
    }
}