/*
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to 
 * the end. The string length will be at least 2.
 */

public String left2(String str) {
  String left1 = str.substring(0, 2);
  String left2 = str.substring(2, str.length());
  return left2 + left1;
}