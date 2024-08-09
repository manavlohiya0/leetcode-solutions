class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] postfix = new int[length];
        int[] output = new int[length];
        prefix[0] = 1;
        postfix[length-1] = 1;
        for (int i=1; i<length; i++ ){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for (int i=length-2; i>=0; i-- ){
            postfix[i] = postfix[i+1]*nums[i+1];
        }
        output[0] = postfix[0];
        output[length-1] = prefix[length-1];
        for (int i = 1; i< length-1; i++){
            output[i] = prefix[i]*postfix[i];
        }
        return output;
    }
}  
