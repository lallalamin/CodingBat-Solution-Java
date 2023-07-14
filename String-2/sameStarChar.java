/*
 * Returns true if for every '*' (star) in the string, if 
 * there are chars both immediately before and after the 
 * star, they are the same.
 */

 public boolean sameStarChar(String str) {
  if(str.length() < 3) return true;
  boolean valid = true;
  
  for (int i = 1; i < str.length() - 1; i ++){
    if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)){
      valid = false;
    }
  }
  return valid;
}
