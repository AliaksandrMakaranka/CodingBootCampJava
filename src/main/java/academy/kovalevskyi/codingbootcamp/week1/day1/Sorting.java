package academy.kovalevskyi.codingbootcamp.week1.day1;

import java.util.Comparator;

public class Sorting {
  
  public static <T> void swap(T[] target, int i, int j) {
    T swap = target[i];
    target[i] = target[j];
    target[j] = swap;
  }  
  
  public static <T> void sort(T[] target, Comparator<T> comparator) {
    if (target == null) {
      throw new NullPointerException();
    } 
    
    for (int i = 0; i < target.length - 1; i++) {
      for (int j = 0; j < target.length - i - 1; j++) {

        if (comparator.compare(target[j], target[j + 1]) > 0) {
          swap(target, j, j + 1);
        }

      }
    }
  }
  
  public static <T> void sortReversedOrder(T[] target, Comparator<T> comparator) {
    sort(target, comparator.reversed());  
  }
}
