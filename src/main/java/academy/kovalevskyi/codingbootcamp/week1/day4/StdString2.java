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

    char[] result;

          
    return new StdString2(result);    
  }
  
  public StdString2 toAsciiUpperCase() {
    return new StdString2();
  }

  public StdString2 subString(int from, int to) {
    return new StdString2();
  }
  
  public StdString2 concat(StdString2... that) {
    return new StdString2();
  }

  /* public StdString2[] split(char separator) {
    return new StdString2[]();
  }*/
  
  public StdString2 trim() {
    return new StdString2();
  }
  
  public StdString2 removeCharacter(char toRemove) {
    return new StdString2();
  }

  public static void main(String[] args) {
    //toAsciiLowerCase(new char['A', 'd', 'G', 'h']);
  }
}
