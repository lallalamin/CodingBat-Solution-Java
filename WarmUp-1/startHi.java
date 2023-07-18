/*
 * Given a string, return true if the string starts with "hi" and false otherwise.
 */

public boolean startHi(String str) {
  
  if (str.length() <= 1){
    return false;
  }
  else{
    String w = str.substring(0, 2);
    return w.equals("hi");
  }
}
