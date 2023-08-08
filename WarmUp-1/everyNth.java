/*
 * Given a non-empty string and an int N, return the string made starting with char 0, 
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so 
 * on. N is 1 or more.
 */

public String everyNth(String str, int n) {
  String result = str.substring(0,1);
  for(int i = n; i < str.length(); i += n){
    result = result + str.charAt(i);
  }
  return result;
}

// we only keep the everyNth letter. 
// if N is 2. Miracle - M (0) r(2) c(4) e(6)