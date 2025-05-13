package academy.kovalevskyi.codingbootcamp.week2.day1.view;

import java.util.Scanner;

class KeyboardReader implements Reader {
  private final Scanner scanner;

  public KeyboardReader() {
    this.scanner = new Scanner(System.in);
  }

  @Override
  public int getNumber() {
    return scanner.nextInt();
  }

  @Override
  public String getText() {
    return scanner.nextLine();
  }

  public void close() {
    scanner.close();
  }
}
