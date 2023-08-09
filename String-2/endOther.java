/*
 * Given two strings, return true if either of the strings appears at the very end 
 * of the other string, ignoring upper/lower case differences (in other words, the 
 * computation should not be "case sensitive"). Note: str.toLowerCase() returns the 
 * lowercase version of a string.
 */

public boolean endOther(String a, String b) {
  String astr = a.toLowerCase();
  String bstr = b.toLowerCase();
  
  if(astr.endsWith(bstr) || bstr.endsWith(astr)){
    return true;
  }
  return false;
}

/*
  String astr = a.toLowerCase();
  String bstr = b.toLowerCase();
  String smallstr = "";
  String largestr = "";
  if(a.length() > b.length()){
    smallstr = bstr;
    largestr = astr;
  }
  else{
    smallstr = astr;
    largestr = bstr;
  }
  if(largestr.endsWith(smallstr)){
    return true;
  }
  return false;
**/
