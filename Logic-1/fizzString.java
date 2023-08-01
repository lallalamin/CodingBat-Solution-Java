/*
 * Given a string str, if the string starts with "f" return "Fizz".
 * If the string ends with "b" return "Buzz". If both the "f" and "b"
 * conditions are true, return "FizzBuzz". In all other cases, return 
 * the string unchanged. (See also: FizzBuzz Code)
 */

public String fizzString(String str) {
  String result = "";
  if (str.startsWith("f")){
    result += "Fizz";
  }
  if (str.endsWith("b")){
    result += "Buzz";
  }
  if (result.equals("")){
    result = str;
  }

  return result;
}
