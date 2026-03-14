class Solution {
    public boolean isAnagram(String s, String t) {
      
       int s1 = s.length();
       int s2 = t.length();

      //If the two strings are not equal in length then they cannot be valid anagram, hence we return false.
       if (s1!=s2){
         return false;
       }
      
       HashMap<Character, Integer> check = new HashMap<>();

      //creating a frequence map for string 1 for each unique character
       for(int i = 0; i<s1 ; i++){
        if(check.containsKey(s.charAt(i))){
          int temp = check.get(s.charAt(i));
          check.put(s.charAt(i),temp+1);
        }else{
         check.put(s.charAt(i),1);
        }
       }

      //creating a frequence map for string 2 for each unique character
  HashMap<Character, Integer> check2 = new HashMap<>();
      for(int i = 0; i<s2 ; i++){

        if(check2.containsKey(t.charAt(i))){
          int temp = check2.get(t.charAt(i));
          check2.put(t.charAt(i),temp+1);
        }else{
         check2.put(t.charAt(i),1);
        }
       }

      //if both maps are same then the two strings are valid anagram
       if(check.equals(check2)){
         return true;
       }else{
         return false;
       }

          

    }
}
