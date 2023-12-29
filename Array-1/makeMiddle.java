public int[] makeMiddle(int[] nums) {
  int midarraylen = (nums.length/2) - 1;
  
  int[] result = {nums[midarraylen], nums[midarraylen + 1]};
  
  return result;
}
