/*
 * Given three ints, a b c, return true if two or more of them have 
 * the same rightmost digit. The ints are non-negative. Note: the % 
 * "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 */

 public boolean lastDigit(int a, int b, int c) {
  int as = a % 10;
  int bs = b % 10;
  int cs = c % 10;
  return (as == bs || bs == cs || as == cs);
}
