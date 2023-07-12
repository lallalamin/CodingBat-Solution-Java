/*
 * Return a version of the given string, where for every star 
 * (*) in the string the star and the chars immediately to its 
 * left and right are gone. So "ab*cd" yields "ad" and "ab**cd" 
 * also yields "ad".
 */

public String starOut(String str) {
  String result = "";
  
  //if the string do not contain any star, just return the original.
  if (!str.contains("*")) return str; 
  
  // this if statement solved the problem the first letter not included 
  // since our for loop start at index 1
  if (!str.startsWith("*") && str.charAt(1) != '*') result += str.substring(0,1);
  
  for(int i = 1; i < str.length()-1; i ++){
    if (str.charAt(i) == '*' || str.charAt(i-1) == '*' || str.charAt(i+1) == '*'){
      result += "";
    }
    else{
      result += str.substring(i, i + 1);
    }
  }
  
  // this if statement solved the problem the last letter not included 
  // when there is no star around the end of the string
  if(!str.endsWith("*") && str.charAt(str.length()-2) != '*') {
    result += str.substring(str.length() - 1);
  }
  
  return result;
}