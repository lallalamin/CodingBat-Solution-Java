/*
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" 
 * yields "ya". If either string is length 0, use '@' for its missing char.
 */

public String lastChars(String a, String b) {
  if (a.length() >=  1 && b.length() >= 1){
    return a.substring(0, 1) + b.substring(b.length()-1);
  }
  else if (a.length()>= 1){
    return a.substring(0,1) + "@";
  }
  else if (b.length()>= 1){
    return "@" + b.substring(b.length()-1);
  }
  else{
    return "@@";
  }
}
