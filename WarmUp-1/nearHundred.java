/*
 * Given an int n, return true if it is within 10 of 100 or 
 * 200. Note: Math.abs(num) computes the absolute value of 
 * a number.
 */
public boolean nearHundred(int n) {
  if (n < 100 || n == 110){
    n = Math.abs(100 - n);
    if(n <= 10){
      return true;
    }
    else{
      return false;
    }
  }
  else{
    n = Math.abs(200 - n);
    if(n <= 10){
      return true;
    }
    else {
      return false;
    }
  }

  // or you can do in one line
  //return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10))
}


