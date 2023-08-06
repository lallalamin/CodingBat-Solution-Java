/*
 * Given a string, return true if the first instance of "x" in the string
 *  is immediately followed by another "x".
 */
boolean doubleX(String str) {
  int index = str.indexOf("x");
  if (index == -1) return false; // -1 happen when there is no one in the string
  if (index + 1 >= str.length()) return false; // checking if the str will out of bound or not
  
  return (str.charAt(index) == str.charAt(index + 1));
}
