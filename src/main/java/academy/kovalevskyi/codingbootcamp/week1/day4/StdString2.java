package academy.kovalevskyi.codingbootcamp.week1.day4;

import academy.kovalevskyi.codingbootcamp.week1.day2.StdString1;
import academy.kovalevskyi.codingbootcamp.week1.day2.StringUtils;

public class StdString2 extends StdString1 {
 
  StdString2(char[] base) {
    super(base);  
  }

  StdString2() {
    super();
  }

  StdString2(StdString2 that) {
    super();
  }
  
  public StdString2 toAsciiLowerCase() {

    char[] resultArray = new char[super.length()];
    
    for (int i = 0; i < resultArray.length; i++) {
      resultArray[i] = StringUtils.toAsciiLowercase(super.base[i]);
    }

    return new StdString2(resultArray);    
  }
  
  public StdString2 toAsciiUpperCase() {

    char[] resultArray = new char[super.length()];
    
    for (int i = 0; i < resultArray.length; i++) {
      resultArray[i] = StringUtils.toAsciiUppercase(super.base[i]);
    }

    return new StdString2(resultArray);    
  }

  public StdString2 subString(int from, int to) {
    if (from > to) {
      throw new IllegalArgumentException();
    }

    int newArrayLength = to - from;
    char[] newString = new char[newArrayLength];

    System.arraycopy(super.base, from, newString, 0, newArrayLength);

    return new StdString2(newString);
  }
  
  public StdString2 concat(StdString2... that) {
    if (that == null) {
      throw new NullPointerException();
    }
    
    int totalLength = super.length();
    for (StdString2 str : that) {
      if (str == null) {
        throw new NullPointerException();
      }
      totalLength += str.length();
    }
    
    char[] result = new char[totalLength];
    System.arraycopy(super.base, 0, result, 0, super.length());
    
    int currentPos = super.length();
    for (StdString2 str : that) {
      System.arraycopy(str.base, 0, result, currentPos, str.length());
      currentPos += str.length();
    }
    
    return new StdString2(result);
  }

  /* public StdString2[] split(char separator) {
    return new StdString2[]();
  }*/
 
  
  public StdString2 trim() {

      
    int len = super.length();
    int from = 0;
    int to = 0;
    
    for (int i = 0; i <= super.length(); i++) {
      if (!StringUtils.isAsciiNumeric(super.base[i]) 
          || !StringUtils.isAsciiAlphabetic(super.base[i])) {
        //System.out.printf(" Char: %s| from: %d", super.base[i], from);
        from++;
      }
      
      if (StringUtils.isAsciiNumeric(super.base[i])
          || StringUtils.isAsciiAlphabetic(super.base[i])) {
        from--;
        break;
      }
    }     
    
    for (int i = super.length() - 1; i > 0; i--) {
      if (!StringUtils.isAsciiNumeric(super.base[i]) 
          || !StringUtils.isAsciiAlphabetic(super.base[i])) {
        to++;
      }
      
      if (StringUtils.isAsciiNumeric(super.base[i]) 
          || StringUtils.isAsciiAlphabetic(super.base[i])) {
        to--;
        break;
      }
      
    }
    
    int delta = super.length() - (from + to);

    char[] trimArr = new char[delta];
    
    //System.out.printf("\nfrom: %d| delta: %d", from, delta);    

    System.arraycopy(super.base, from, trimArr, 0, delta); 

    return new StdString2(trimArr);
  }
  
  
  /*

  public StdString2 trim() {
    
    //int len = StdString1.toCharArray().length();
    int from = 0;
    int to = super.length();

    while (StringUtils.isSpace() && from < to) {
      from++;
    }
  
  }    
  
  */

  public StdString2 removeCharacter(char toRemove) {
    
    return new StdString2();
  }
}
