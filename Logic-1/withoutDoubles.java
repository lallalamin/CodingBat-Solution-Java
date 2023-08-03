/*
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. 
 * However, if noDoubles is true, if the two dice show the same value, 
 * increment one die to the next value, wrapping around to 1 if its 
 * value was 6.
 */

 public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = 0;
  
  if (noDoubles){
    if(die1 == 6 && die2 == 6){
      return sum = die2 + 1;
    }
    else if(die1 == die2){
      return sum = die1 + die2 + 1;
    }
    else{
      return sum = die1 + die2;
    }
  }
  
  else{
    return sum = die1 + die2;
  }

}
