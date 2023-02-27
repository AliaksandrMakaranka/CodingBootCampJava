package academy.kovalevskyi.codingbootcamp.week1.day0;
 
public class NumberUtils {
  
  public static void factorialVerify(int number) {
    if (number < 0 || number >= 21) {
      throw new IllegalArgumentException();
    }
  }  
  
  public static void verifyPositive(int number) {
    if (number < 0) {
      throw new IllegalArgumentException();
    }
  }

  public static long getFactorial(final int number) {
    factorialVerify(number);

    long result = number;
    
    if (number == 0) { 
      return 1;
    }

    for (int i = 2; i < number; i++) {
      result *= i;
    }

    return result;
  } 
  
  public static long factorialRecursive(final int number) {
    factorialVerify(number);

    if (number == 0) {
      return 1;
    }

    return number * factorialRecursive(number - 1);
  } 
  
  public static double power(final int base, final int power) {

    double result = 1;

    if (power > 0) {
      for (int i = 1; i <= power; i++) {
        result *= base; 
      } 
    } else {
      for (int i = 0; i > power; i--) {
        result /= base;
      } 
    }

    return result;   
  }
  
  public static double powerRecursive(final int base, final int power) {
    if (base == 0 && power > 0) {
      return 0;
    }

    if (power == 0) {
      return 1;
    } 

    if (power > 0) {
      return base * powerRecursive(base, power - 1);
    }

    return  1 / powerRecursive(base, -power);
  }    

  public static int fibRecursive(final int index) {
    verifyPositive(index);

    if (index == 0) {
      return 0;
    }

    if (index < 3) {
      return 1;
    }

    return fibRecursive(index - 1) + fibRecursive(index - 2); 
  }

  public static int[] fibSequence(final int length) {
    verifyPositive(length);

    int[] arr = new int[length];

    for (int i = 0; i < length; i++) {
      arr[i] = fibRecursive(i);
    }
    return arr;
  }
  
  public static boolean isPrime(final int target) {
    verifyPositive(target);

    if (target < 2) {
      return false;
    }

    for (int i = 2; i <= target / 2; i++) {

      if (target % i == 0) {
        return false;     
      }
    }

    return true;
  }  

  public static int findNextPrime(final int target) {

    int result = target;

    while (isPrime(result) == false) {
      result++;
    }

    return result;
  }
  
  public static int sqrt(final int target) {
    verifyPositive(target);
  
    int result = 0;

    while (result * result <= target) {

      if (result * result == target) {
        return result;
      }

      result++;
    }

    return -1;
  }

  public static void swap(int[] array, int i, int j) {
    int swap = array[i];
    array[i] = array[j];
    array[j] = swap;
  }
  
  public static void sort(int[] target) {
    if (target == null) {
      return;
    }

    int tarLen = target.length;

    for (int i = 0; i < tarLen - 1; i++) {
      for (int j = 0; j < tarLen - i - 1; j++) {

        if (target[j] > target[j + 1]) {
          swap(target, j, j + 1);
        }

      }
    } 
  } 

}
