class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        return sb.toString().contentEquals(sb.reverse());
    }
}