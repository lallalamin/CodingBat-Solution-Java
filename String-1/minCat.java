/*
 * Given two strings, append them together (known as "concatenation") and return the result. However, if the 
 * strings are different lengths, omit chars from the longer string so it is the same length as the shorter 
 * string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
 */

public String minCat(String a, String b) {
  int al = a.length();
  int bl = b.length();
  if (al < bl){
    return a + b.substring(Math.abs(al-bl), b.length());
  }
  else if (al > bl){
    return a.substring(Math.abs(al-bl), a.length()) + b;
  }
  else{
    return "";
  }
}
