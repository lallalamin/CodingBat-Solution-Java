/*The number 6 is a truly great number. Given two int values, 
a and b, return true if either one is 6. Or if their sum or 
difference is 6. Note: the function Math.abs(num) computes 
the absolute value of a number.*/

public boolean love6(int a, int b) {
  if (a == 6 || b == 6){
    return true;
  }
  else{
    int sum = a + b;
    int dif = Math.abs(a-b);
    return (sum == 6 || dif == 6);
  }
}
