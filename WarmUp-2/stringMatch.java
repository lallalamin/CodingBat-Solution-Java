/*
 * Given 2 strings, a and b, return the number of the positions where they 
 * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
 * since the "xx", "aa", and "az" substrings appear in the same place in 
 * both strings.
 */

public int stringMatch(String a, String b) {
  int count = 0;
  int len = Math.min(a.length(), b.length());
  
  for (int i = 0 ; i < len - 1; i ++){
    String as = a.substring(i, i+2);
    String bs = b.substring(i, i+2);
    if (as.equals(bs)){
      count += 1;
    }
  }
  return count;
}

  
  /*OR
  if (a.length() > b.length()){
    len = b.length();
  }
  else{
    len = a.length();
  }
  **/