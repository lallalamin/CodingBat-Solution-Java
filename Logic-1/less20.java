/*
 * Return true if the given non-negative number is 1 or 2 less than a
 * multiple of 20. So for example 38 and 39 return true, but 40 returns
 * false. See also: Introduction to Mod
 */

public boolean less20(int n) {
 return (n % 20 == 18 || n % 20 == 19);
}

/* OR
 public boolean less20(int n) {
  if (n % 20 == 18 || n % 20 == 19){
    return true;
  }
  else{
    return false;
  }
}
*/