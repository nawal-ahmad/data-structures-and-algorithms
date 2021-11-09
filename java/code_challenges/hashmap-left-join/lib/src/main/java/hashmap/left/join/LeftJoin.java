package hashmap.left.join;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
}
