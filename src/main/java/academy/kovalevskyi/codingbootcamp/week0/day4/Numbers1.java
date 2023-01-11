package academy.kovalevskyi.codingbootcamp.week0.day4;

public class Numbers1 {

  public static int[] generateNumbers() {
    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    return arr;
  }
  
  public static int findBiggest(int left, int right) {
    return (left < right) ? right : left;
  }
    
  public static int findBiggest(int left, int mid, int right) {
    return findBiggest(left, findBiggest(mid, right));
  }

  public static int findBiggest(int[] numbers) {
    int biggest = findIndexOfBiggestNumber(numbers);
    return numbers[biggest];
  }
  
  public static boolean isNegative(int number) {
    return number < 0;
  }
  
  public static int findIndexOfBiggestNumber(final int[] numbers) {
    //TODO with stream!
    int indexArr = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[indexArr] < numbers[i]) {
        indexArr = i;
      }
    }
    return indexArr;
  }
  
  private static int len(int number) {
    int result = 1;

    if (number < 0) {
      result++;
    }
 
    while (number >= 10 || number <= -10) {
      number /= 10;
      result++;
    }
    return result;
  } 
 
  public static char[] convertToCharArray(final int number) {
    int len = len(number);
    int tmpNumber = number;

    char[] result = new char[len];

    if (number >= 0 && number <= 9) {
      return new char[]{(char) (number + '0')};
    } 

    for (int i = len - 1; i >= 0; i--) {
      int tmp = tmpNumber % 10;
      if (number < 0) {
        tmp = -tmp;
      }
      tmpNumber  /= 10;
      result[i] = (char) (tmp + '0');
    }
  
    if (number < 0) {
      result[0] = '-';
    }

    return result;
  }
}
