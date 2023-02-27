package academy.kovalevskyi.codingbootcamp.week0.day2;

import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    //Stream solution
    Stream.of("Hello World").forEach(System.out::println);
    
    //General solution
    //System.out.println("Hello World");
  }
}
