class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev="";
        for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }

        return s1.equals(rev);
        
    }
}