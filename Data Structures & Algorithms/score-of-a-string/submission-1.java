class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        int n = s.length() - 1;

        for(int i = 0 ; i< n; i++){
            ans += Math.abs(s.charAt(i) - s.charAt(i+1)); 
        }
        return ans;
    }
}