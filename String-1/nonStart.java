/*
 * Given 2 strings, return their concatenation, except omit the first char of each. The 
 * strings will be at least length 1.
 */

public String nonStart(String a, String b) {
  String aw = a.substring(1, a.length());
  String bw = b.substring(1, b.length());
  return aw + bw;
}
