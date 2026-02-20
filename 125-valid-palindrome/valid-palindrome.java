
class Solution {
    public boolean isPalindrome(String s) {
        
        String last=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left=0;
        int right=last.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(last.charAt(left)==last.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return isPalindrome;
    }
}