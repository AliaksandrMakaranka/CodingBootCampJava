package academy.kovalevskyi.codingbootcamp.week2.day0;

public class MainPrintReversedParam {

  public static void main(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) {
      System.out.println(args[i]);
    }
  }
}
