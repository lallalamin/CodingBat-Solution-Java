/*
 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields 
 * "ri". The string length will be at least 2.
 */

public String middleTwo(String str) {
  int mid = str.length()/2;
  return str.substring(mid - 1, mid + 1);
}
