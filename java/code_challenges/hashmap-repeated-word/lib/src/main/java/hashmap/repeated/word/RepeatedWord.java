package hashmap.repeated.word;

import java.util.HashMap;

public class RepeatedWord {

  public static String deleteComma(String str){
    str = str.substring(0, str.length() - 1);
    return str;
  }

  public static String repeatedWord(String words){
    String result="";
    HashMap<String,Integer> array = new HashMap<>();

    String[] arrayOfWords = words.split(" ");

    for (int i = 0; i < arrayOfWords.length; i++) {

      if (arrayOfWords[i].contains(",")){
        arrayOfWords[i] = deleteComma(arrayOfWords[i]);
      }

      if (array.containsKey(arrayOfWords[i].toLowerCase())){
        result = arrayOfWords[i];
        break;
      }else{
        array.put(arrayOfWords[i].toLowerCase(),i);
      }
    }
    return result;
  }

}
