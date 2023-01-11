package academy.kovalevskyi.codingbootcamp.week0.day4;

public class Alphabet {
  public static char[] generateAlphabet() {
    char[] arr = new char[26];
    for (char i = 'a'; i <= 'z'; i++) {
      arr[i - 'a'] = i;
    }
    return arr;
  }
  
  public static char[] generateReversedAlphabet() {
    char[] arr = new char[26];
    for (char i = 'z'; i >= 'a'; i--) {
      arr['z' -  i] = i;
    }
    return arr;
  }
}
