/*
 * Count the number of "xx" in the given string. We'll say that overlapping 
 * is allowed, so "xxx" contains 2 "xx".
 */

 int countXX(String str) {
  int x = 0;
  // 
  for(int i = 0; i < str.length()-1; i ++){
    if (str.substring(i, i + 2).equals("xx")){
      x += 1;
    }
    else{
      x += 0;
    }
  }
  return x;
}
