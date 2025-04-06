class Solution {
    public int climbStairs(int n) {
        int a=1;
        int b=1;
        for(int i=2;i<=n;i++){
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
    }
}