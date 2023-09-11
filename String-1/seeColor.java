/*
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise 
 * return the empty string.
 */

public String seeColor(String str) {
  // or we can use the function call "startsWith()"
  
  if (str.startsWith("red")){
    return "red";
  }
  else if (str.startsWith("blue")){
    return "blue";
  }
  else{
    return "";
  }
}
/*
  
  if(str.length() < 3){
    return "";
  }
  
  if(str.length() == 3){
    if (str.equals("red")){
      return str;
    }
    else{
      return "";
    }
  }
  
  String red = str.substring(0, 3);
  String blue = str.substring(0, 4);
  
  if (red.equals("red")){
   return red;
  }
  else if (blue.equals("blue")){
    return blue;
  }
  else{
    return "";
  }
**/