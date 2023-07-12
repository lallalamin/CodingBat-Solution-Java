/*
 * Given a string and a non-empty word string, return a 
 * version of the original String where all chars have
 * been replaced by pluses ("+"), except for appearances 
 * of the word string which are preserved unchanged.
 */

public String plusOut(String str, String word) {
  int wordlen = word.length();
  String result = "";
  
  // EX. 12xy34 -> ++xy+ (this is the result if we dont have length checker)
  // when i = 4, the upper for loop will compare if "34"(str.substring(4,6)) is equals 
  // to "xy". It is not equal and "i" reach the str.length() - wordlen (6-2 = 4).
  // As we can see, we did not get to go to the index of "4" and add "+" to the result.
  for(int i = 0; i <= str.length() - wordlen; i ++){
    if(str.substring(i, i + wordlen).equals(word)){
      result += word;
      i = i + (wordlen-1);
    }
    else{
      result += "+";
    }
  }
  
  //this chuck of code solve the problem of the result length is not equal to the 
  //"str" length. When we compare the substring and it is equal to the "word", we increment 
  //the "i" value so that it will start after the end letter of the "word". However, when
  //"i" reach the number of str length() and done comparing the last substring, we will
  //miss the rest of the letter of the substring.
  
  //this is like length checker.
  if (result.length() != str.length()){
    int left = str.length() - result.length();
    for (int i = 0; i < left; i ++){
      result += "+";
    }
  }
  
  return result;
}

// Looking at mm911 solution after able to solve the problem by myself, what i learn 
// from this code is that I can combine my two for loop together and this will improve
// the neatness of the code. 
// the code below is from:
// https://github.com/mm911/codingbat-solutions/blob/master/java/String-2/plusOut.java

/*
  int slen = str.length();
  int wlen = word.length();
  String fin = "";
  
  for (int i = 0; i < slen; i++) {
    if (i <= slen - wlen) {
      String tmp = str.substring(i,i+wlen);
      if (tmp.equals(word)) {
        fin += word;
        i += wlen-1;
      }
      else
        fin += "+";
    }
    else
      fin += "+";
  }
  
  return fin;
*/

