class Solution {
    public int reverse(int x) {
        
       int b=0;
       while(x!=0){
        if(b>Integer.MAX_VALUE/10||b<Integer.MIN_VALUE/10) return 0;
        b=b*10+(x%10);
        x=x/10;
       } 
       return b;
    }
}