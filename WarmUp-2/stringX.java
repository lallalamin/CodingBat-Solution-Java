/*
 * Given a string, return a version where all the "x" have been removed. 
 * Except an "x" at the very start or end should not be removed.
 */

public String stringX(String str) {
  String result = "";
  if(str.length() < 2 && str.startsWith("x")) return result = "x";
  
  if(str.startsWith("x")) result += "x";
  
  for(int i = 0; i < str.length(); i ++){
    if(str.charAt(i) != 'x'){
      result += str.substring(i, i + 1);
    }
  }
  
  if (str.endsWith("x")) result += "x";
  
  return result;
}
/* OR
  String result = "";
  if(str.length() < 2 && str.startsWith("x")) return result = "x";
  
  if(str.startsWith("x")) result += "x";
  
  for(int i = 0; i < str.length(); i ++){
    if(str.charAt(i) != 'x'){
      result += str.substring(i, i + 1);
    }
  }
  
  if (str.endsWith("x")) result += "x";
  
  return result;
**/