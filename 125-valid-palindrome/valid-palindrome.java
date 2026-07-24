class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--){
            sb.append(s1.charAt(i));
        }

        return s1.equals(sb.toString());
        
    }
}