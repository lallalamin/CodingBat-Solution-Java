/*
 * Given 2 int values, return whichever value is nearest to the value 10, or 
 * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute 
 * value of a number.
 */

public int close10(int a, int b) {
  int anum = Math.abs(10 - a);
  int bnum = Math.abs(10 - b);
  if (anum > bnum){
    return b;
  }
  else if (anum < bnum){
    return a;
  }
  else{
    return 0;
  }
}
