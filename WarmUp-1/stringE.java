/*
 * Return true if the given string contains between 1 and 3 'e' chars.
 */

public boolean stringE(String str) {
  int three = 0;
  for (int i = 0; i < str.length(); i ++){
    if (str.charAt(i) == 'e'){
      three = three + 1;
    }
  }
  
  if (three >= 1 && three <= 3){
    return true;
  }
  else{
    return false;
  }
  
}
