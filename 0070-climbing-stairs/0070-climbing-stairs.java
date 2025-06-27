class Solution {
    public int climbStairs(int n) {

        if(n==1)return 1;
        if(n==2)return 2;

int first=1;
int secound=2;
int curr=0;
for(int i=3;i<=n;i++){
    curr=first+secound;
    first=secound;
    secound=curr;

}
        return curr;

    }

}