package academy.kovalevskyi.codingbootcamp.week0.day3;

public class JavaEntryChallenge {
  
  private static final int SECONDS = 60;  
 
  public static void printHello() {
    System.out.println("Hello World!");
  }
  
  public static int sumOfTwoNumbers(int a, int b) {
    return a + b;
  }
  
  public static int convertMinToSec(int minutes) {
    return minutes * SECONDS;
  }
  
  public static void compareTwoNumbers(int a, int b) {
    String result = "Result: ";

    if (a > b) {
      System.out.print(result + "a is bigger");
    } else if (b > a) {
      System.out.print(result + "b is bigger");
    } else {
      System.out.print(result + "numbers are equal");
    }
  }

  public static void concatTwoStrings(String firstName, String lastName) {
    System.out.print(firstName + " " + lastName);
  }
    
  public static int remainder(int a, int b) {
    return a % b;
  }  
   
  public static boolean divisibleBy5(int sum) {
    return sum % 5 == 0;
  } 
  
  public static int firstElementOfArray(int[] arr) {
    return arr[0];
  } 
    
  public static int smallestElementOfArray(int[] arr) {
    //TODO next solution with stream!
    int minElement = arr[0];

    for (int number : arr) {
      if (number < minElement) {
        minElement = number;
      }  
    }
    return minElement;
  }
  
  public static void checkResultOfWork(boolean quick, boolean efficient, boolean reliable) {
    String result = "Result of work: ";

    if (quick && efficient && reliable) {
      System.out.print(result + "excellent, but you are dreaming");
    } else if (efficient && reliable) {
      System.out.print(result + "good, but tired of waiting");
    } else if (quick && efficient) {
      System.out.print(result + "excellent, but pricey");
    } else if (quick && reliable) {
      System.out.print(result + "poor, but fast enough");
    } else {
      System.out.print("Pick at least two");
    }
  }
}

