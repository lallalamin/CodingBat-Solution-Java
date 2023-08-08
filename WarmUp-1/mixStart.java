/*
 * Return true if the given string begins with "mix", except the 'm' can be anything, 
 * so "pix", "9ix" .. all count.
 */

public boolean mixStart(String str) {
  if (str.length() < 3){
    return false;
  }
  else{
    String mix = str.substring(1, 3);
    if (mix.equals("ix")){
        return true;
     }
     else{
       return false;
     }
  }
}