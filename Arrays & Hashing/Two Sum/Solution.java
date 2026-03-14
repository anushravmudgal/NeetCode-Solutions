class Solution {
  public int[] twoSum(int[] nums, int target) {

    //Creating a hashmap with key being target-current number and value being its index
    HashMap<Integer, Integer> check = new HashMap();
    int[] result = new int[]{0,0};

    for(int i = 0; i<(nums.length); i++){

      //We check whether the ith number in the array exists in our HashMap
      // If it does, the current index and the index of the number stored ( as what was stored was its differnce with the target) 
        if(check.containsKey(nums[i])){
           result[0]=check.get(nums[i]);
           result[1]=i;
           return result;

         }else{
          check.put(target-nums[i],i);
          }
        }

    //if no two numbers satisfy our condition, we return empty array
   return result;
     }
  }
                                                                                                              
}
