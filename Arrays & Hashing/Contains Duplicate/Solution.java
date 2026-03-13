class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Creating an instance of HashMap to keep track of checked numbers.
         HashMap<Integer, Integer> check = new HashMap<>();
      //Traversing the Array
        for (int i : nums){
          //Checking our HashMap if we have already seen the current number.
         if(check.containsKey(i)){
           //If we have, then it means that our array contains duplicate and hence we return true.
            return true;
         } else{
           //otherwise we'll put this number in our HashMap to know that we have seen this number.
            check.put(i,1);
         }
        }
      //if our array does not contain any duplicates, we return false.
        return false;
    }
}
