class Solution {
    public boolean isPalindrome(String s) {
       String num=s.toLowerCase().replaceAll("[^a-z0-9]","");
       String rev="";
       for(int i=num.length()-1;i>=0;i--){
        rev=rev+num.charAt(i);
       }
       if(num.equals(rev))return true;
       else{
        return false;
       }
    }
}
