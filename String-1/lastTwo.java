/*
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, 
 * so "coding" yields "codign".
 */

 public String lastTwo(String str) {
  if (str.length() <= 1){
    return str;
  }
  else{
    String last = str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
    return str.substring(0, str.length() - 2) + last;
  }
}
