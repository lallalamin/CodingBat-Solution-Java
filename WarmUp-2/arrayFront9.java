/*
 * Given an array of ints, return true if one of the first 4 elements in the array 
 * is a 9. The array length may be less than 4.
 */

 public boolean arrayFront9(int[] nums) {
  int ind = nums.length;
  if (ind >= 4){
    ind = 4;
  }
  for(int i = 0; i < ind; i ++){
    if(nums[i] == 9){
      return true;
    }
  }
  return false;
}

/* OR
  if (nums.length <= 4){
    for (int i = 0; i < nums.length; i ++){
      if (nums[i] == 9){
        return true;
      }
    }
  }
  
  else{
    for (int i = 0; i < 4; i ++){
      if (nums[i] == 9){
        return true;
      }
    }
  }
  return false;
**/