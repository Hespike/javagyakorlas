/* Given an integer x, return true if x is palindrome integer. An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not. */

class Solution {
    public boolean isPalindrome(int x) {
        int remainder;
        int sum = 0;
        int temp = x;
        
        while(x > 0){
            remainder = x % 10;
            sum = (sum * 10) + remainder;
            x = x/10;
        }
        if(temp == sum)
            return true;
        else 
            return false;
    }
}
