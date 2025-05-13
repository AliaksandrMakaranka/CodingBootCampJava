package academy.kovalevskyi.codingbootcamp.week2.day0;

import academy.kovalevskyi.codingbootcamp.week0.day4.Numbers1;

public class Numbers2 extends Numbers1 {


  /*public static char[][] generateTriplets() {
    int size = 9;
    
        
   
    char[][] result = new char[size][];
    int end = 2;
      
    for (int i = 0; i < size; i++) {
      result[i] = new int[]{end - 2, end - 1, end}; 
    }  
    //Numbers1.convertToCharArray(result);
           
     
    return result;
  }*/
  
  public static char[][] generateTuple() {
    char[][] result = new char[1][2];
    result[0][0] = '0';
    result[0][1] = '1';
    return result;
  }

  public static char[][] generateTuples(int amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be positive");
    }
    
    char[][] result = new char[amount][2];
    for (int i = 0; i < amount; i++) {
      result[i][0] = (char)('0' + i);
      result[i][1] = (char)('0' + (i + 1));
    }
    return result;
  }
}
