package academy.kovalevskyi.codingbootcamp.week1.day2;

import academy.kovalevskyi.codingbootcamp.week1.day2.StdString1;

public class StringUtils {

  public static int strToInt(String str) {

    int i = 0;
    int num = 0;
    boolean isNeg = false;

    if (str.charAt(0) == '-') {
      isNeg = true;
      i = 1;
    }
    
    while (i < str.length()) {
      char c = str.charAt(i);
      if (!isAsciiNumeric(c) || (c == '-' && str.length() < 2)) {
        throw new NumberFormatException();
      }
      num *= 10;
      num += c - 48;
      i++;
    }
      
    if (isNeg) {
      num = -num;
    }
    return num;
  }

  public static void asciiVerify(char ch) {
    if (ch > 256) {
      throw new IllegalArgumentException();    
    }
  }  
  
  public static boolean isSpace(char ch) {
    asciiVerify(ch);
    return ' ' == ch;
  } 

  public static boolean isAsciiUppercase(char ch) {
    asciiVerify(ch);
    
    for (char i = 'A'; i <= 'Z'; i++) {
      if (i == ch) {
        return true;
      }
    }

    return false;
  }
  
  public static boolean isAsciiLowercase(char ch) {
    asciiVerify(ch);

    for (char i = 'a'; i <= 'z'; i++) {
      if (i == ch) {
        return true;
      }
    }  

    return false;
  }
  
  public static boolean isAsciiNumeric(char ch) {
    asciiVerify(ch);

    for (int i = 0; i <= 9; i++) {
      if ((char) (i + '0') == ch) {
        return true;
      }
    }
    return false;
  } 
  
  public static boolean isAsciiAlphabetic(char ch) {
    return (isAsciiUppercase(ch) || isAsciiLowercase(ch));
  }
   
  public static char toAsciiUppercase(char ch) {
    return isAsciiLowercase(ch) ? (char) (ch - 32) : ch;  
  }
  
  public static char toAsciiLowercase(char ch) {
    return isAsciiUppercase(ch) ? (char) (ch + 32) : ch; 
  }
  

  public static StringBuilder makeUppercase(char[] input) {

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length; i++) {
      sb.append(toAsciiUppercase(input[i]));
    }  

    return sb;
  }
  
  public static StringBuilder makeLowercase(char[] input) {

    StringBuilder sb = new StringBuilder();
  
    for (int i = 0; i < input.length; i++) {
      sb.append(toAsciiLowercase(input[i]));
    }

    return sb;
  }

  public static StringBuilder makeCamel(char[] input) {

    StringBuilder sb = new StringBuilder();
       
    for (int i = 0; i < input.length; i++) {

      if (i % 2 == 0) {
        sb.append(toAsciiLowercase(input[i]));
      } else {
        sb.append(toAsciiUppercase(input[i]));
      }
    }   

    return sb;
  }
  
  public static boolean isStringAlphaNumerical(char[] input) {

    for (int i = 0; i < input.length; i++) {

      if (input[i] > 256) {
        throw new IllegalArgumentException();
      }

      if (!isAsciiAlphabetic(input[i]) && !isAsciiNumeric(input[i]) && !isSpace(input[i])) {
        return false;
      }
    }

    return true;
  }  

  public static char[] concatStrings(char[][] input) {
    //flat map stream -> to array from under array 
    if (input == null) {
      throw new NullPointerException();
    }
    
    int newArrayLength = 0;

    for (int i = 0; i < input.length; i++) {
      newArrayLength += input[i].length;
    }
    
    char[]result = new char[newArrayLength]; 
    int k = 0;

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {
        asciiVerify(input[i][j]);
        result[k++] = input[i][j];
      }
    }
 
    return result;
  }
  
  public static int toInt(char[] input) {

    if (input.length < 1) {
      throw new IllegalArgumentException();
    }
  
    String result = "";

    for (int i = 0; i < input.length; i++) {
      result += input[i];
    }
      
    return strToInt(result);
  }
}
