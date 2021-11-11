package hashmap.left.join;

import java.util.*;

public class LeftJoin {

  public static List leftJoin(HashMap hashOne , HashMap hashTwo){
    List<String> result = new ArrayList<>();

    hashOne.forEach((key,value)->{
      if (hashTwo.containsKey(key)){
        result.add(key + ": " + hashOne.get(key) + ", " + hashTwo.get(key));
      }else{
        result.add(key + ": " + hashOne.get(key) + ", " + "Null");
      }
    });
    return result;
  }


  public static String findFrequentWord(String str){
//       str = "Alice is girl and Bob is boy";
    final String[] result = {""};
    Map<String, Integer> hashMap = new HashMap<>();
    String[] words = str.split(" ");
    for (String word : words) {
      if (hashMap.containsKey(word))
        hashMap.put(word, hashMap.get(word) + 1);
      else
        hashMap.put(word, 1);
    }
    int max = Collections.max(hashMap.values());
    System.out.println(hashMap);
    hashMap.forEach((key, value) -> {
      if (value.equals(max)) {
        System.out.print(key + " repeated most for " + max + " times");
        result[0] = key + " repeated most for " + max + " times";
      }
    });
    return result[0];
  }

  public static String unique(String str){
    String result=null;
    HashSet hashSet = new HashSet();
    for (int i=0; i<str.length(); i++){
      hashSet.add(str.charAt(i));
    }
    if (hashSet.size() == str.length()){
      result= "All characters are unique";
    }else {
      result= "characters aren't unique";
    }
    System.out.println("\n"+result);

    return result;
  }
}
