class Solution {
    public boolean isPalindrome(int x) {
        int b=0;
        int c=x;
        
        while(x>0){
            b=b*10+x%10;
            x=x/10;
        }
        if(c==b){
            return true;
        }
        return false;

        
    }
}