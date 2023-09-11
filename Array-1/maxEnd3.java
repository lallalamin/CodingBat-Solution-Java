/*
 * Given an array of ints length 3, figure out which is larger, the first or last element in the 
 * array, and set all the other elements to be that value. Return the changed array.
 */

public int[] maxEnd3(int[] nums) {
  int larger = nums[0];
  
  if (nums[0] < nums[2]) larger = nums[2];

  int[] result = {larger, larger, larger};
  return result;
}
