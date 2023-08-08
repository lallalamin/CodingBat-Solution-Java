/*
 * Given a string, return a string made of the first 2 chars (if present), 
 * however include first char only if it is 'o' and include the second only 
 * if it is 'z', so "ozymandias" yields "oz".
 */

public String startOz(String str) {
  String temp = "";
    
  if (str.length() >= 1 && str.charAt(0) == ('o')){
    temp = temp + str.charAt(0);
  }
  
  if(str.length() >= 2 && str.charAt(1) == ('z')){
    temp = temp + str.charAt(1);
  }
  
  return temp;
}
