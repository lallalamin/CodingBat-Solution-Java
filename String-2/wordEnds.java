/*
 * Given a string and a non-empty word string, return a 
 * string made of each char just before and just after 
 * every appearance of the word in the string. Ignore 
 * cases where there is no char before or after the word, 
 * and a char may be included twice if it is between two words.
 */

public String wordEnds(String str, String word) {
  int wordlen = word.length();
  int strlen = str.length();
  int start = 0;
  String result = "";
  
  //this check if the "str" starts with the word
  // the reason i did this is because to solve the problem of stringidexoutofbound
  if(str.startsWith(word) && strlen > wordlen) {
    start = wordlen;
    result += str.substring(wordlen, wordlen + 1);
  }
  
  for(int i = start; i < strlen - wordlen; i ++){
    if(str.substring(i, i + wordlen).equals(word)){
      result += str.substring(i-1, i);
      result += str.substring(i + wordlen, i + wordlen + 1);
    }
  }
  
  //this check if the "str" ends with the word
  // the reason i did this is because to solve the problem of stringidexoutofbound
  if(str.endsWith(word) && strlen > wordlen){
    result += str.substring(strlen-wordlen-1, strlen-wordlen);
  }
  
  return result;
}
