package academy.kovalevskyi.codingbootcamp.week2.day1.view;

import java.util.Scanner;

class KeyboardReader implements Reader {
 

  @Override
  public int getNumber() {
    Scanner sc = new Scanner(System.in); 
    return sc.nextInt();
  }

  @Override
  public String getText() {
    Scanner sc = new Scanner(System.in); 
    return sc.nextLine();
  }

}
