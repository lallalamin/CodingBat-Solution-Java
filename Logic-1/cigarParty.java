/*
 * When squirrels get together for a party, they like to have cigars. 
 * A squirrel party is successful when the number of cigars is between 
 * 40 and 60, inclusive. Unless it is the weekend, in which case there 
 * is no upper bound on the number of cigars. Return true if the party 
 * with the given values is successful, or false otherwise.
 */

 public boolean cigarParty(int cigars, boolean isWeekend) {

  if (isWeekend){
    return (cigars >= 40);
  }
  else{
    return (cigars >= 40 && cigars <= 60);
  }
}
