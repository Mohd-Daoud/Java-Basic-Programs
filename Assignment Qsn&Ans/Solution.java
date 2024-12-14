class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int tempNo = x;
        int ReversNo = 0;
        while (x>0) {
            int LastDigit = x%10;
            ReversNo = (ReversNo*10) + LastDigit;
            x = x/10;
        }
        if(ReversNo==tempNo)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(121));
        System.out.println(s.isPalindrome(-121));
        System.out.println(s.isPalindrome(10));
    }
}