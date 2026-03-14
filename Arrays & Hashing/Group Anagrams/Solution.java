class Solution {
  
    public List<List<String>> groupAnagrams(String[] strs) {
        
         Map<Map<Character,Integer>, Integer> h1 = new HashMap();
         List<List<String>> ga = new ArrayList();
          
         int track = 0;
        for (int i = 0; i < strs.length ; i++ ){
           String curr = strs[i];
          
          Map<Character,Integer> data = new HashMap(); 
          List<String> sub = new ArrayList<>();

           for(int j = 0; j< curr.length(); j++){

           
              
              if(data.containsKey(curr.charAt(j))){
                int temp = data.get(curr.charAt(j));
                data.put(curr.charAt(j),temp+1);
              }else{
                 data.put(curr.charAt(j),1);
              }

               
           }

            if(h1.containsKey(data)){
                    int ind = h1.get(data);
                    ga.get(ind).add(curr);
                }else{
                   h1.put(data,track);
                   sub.add(curr);
                   ga.add(sub);
                   track += 1;
                }
           }

           return ga;

        }

    }

