class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length ; i++){
            for(int j = i; j < nums.length ; j++){
                if(findGCD(Arrays.copyOfRange(nums, i, j+1), k)){
                    count++;
                    if(!findGCD(Arrays.copyOfRange(nums, i, j+2), k)){
                        break;
                    }
                }
            }
        }
        return count;
    }
    static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // Function to find gcd of array of
    // numbers
    static boolean findGCD(int arr[], int n)
    {
        Arrays.sort(arr);
        if(arr.length == 1 && arr[0] == n){
            return true;
        }
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
               
        }
         if(result != n)
        {
             return false;
        }
 
        return true;
    }
 
}
