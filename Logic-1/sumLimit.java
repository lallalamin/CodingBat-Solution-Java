/*
 * Given 2 non-negative ints, a and b, return their sum, so long 
 * as the sum has the same number of digits as a. If the sum has 
 * more digits than a, just return a without b. (Note: one way 
 * to compute the number of digits of a non-negative int n is to
 * convert it to a string with String.valueOf(n) and then check 
 * the length of the string.)
 */

public int sumLimit(int a, int b) {
  int sum = a + b;
  String sumdi = String.valueOf(sum);
  String adi = String.valueOf(a);
  if (sumdi.length() == adi.length()){
    return sum;
  }
  else{
    return a;
  }
}
