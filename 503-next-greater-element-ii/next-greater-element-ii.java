import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> sb=new Stack<>();
        int n=nums.length;
        int arr[]= new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=-1;
        }
        for(int i=2*(n-1);i>=0;i--){
            int num=nums[i%n];
        
        while(!sb.isEmpty() && sb.peek()<= num){
            sb.pop();
        }
        if(i<n){
            if(!sb.isEmpty()){
                arr[i]=sb.peek();
            }}
            sb.push(num);
        }
        return arr;
    }
    

}