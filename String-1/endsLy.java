/*
 * Given a string, return true if it ends in "ly".
 */

public boolean endsLy(String str) {
  if (str.length() < 2){
    return false;
  }
  String end = str.substring(str.length()-2, str.length());
  return end.equals("ly");
}
 // or you can do in one line
 // return str.endsWith("ly");