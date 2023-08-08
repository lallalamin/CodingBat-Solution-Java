/*
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so 
 * "kittens" yields "kien".
 */

 public String altPairs(String str) {
  String result = "";
  if(str.length() <= 1) return str;
  
  for(int i = 0; i < str.length(); i+= 4){
    //the end is checking if there is 1 number left at the end 
    int end = i + 2;
    if(end > str.length()){
      end = str.length();
    }
    result += str.substring(i, end);
  }
  
  return result;
}
