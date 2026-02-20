class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int number=x;
       
        while(number>0){
           sum=sum*10+number%10;
           number/=10;
        }
       if(x==sum){
        return true;
       }
       else{
        return false;
       }
        
    }
}