/*
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise, 
 * return the string unchanged.
 */

public String delDel(String str) {
  if (str.length() <= 3){
    return str;
  }
  else{
     String del = str.substring(1, 4);
     if (del.equals("del")){
        String first = str.substring(0,1);
        String last = str.substring(4, str.length());
        return first + last;
     }
     else{
       return str;
     }
  }

}
