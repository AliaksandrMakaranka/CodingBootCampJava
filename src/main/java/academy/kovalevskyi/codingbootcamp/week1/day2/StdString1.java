package academy.kovalevskyi.codingbootcamp.week1.day2;

import java.lang.String;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class StdString1 implements Iterable<Character> {
  char[] base;

  public StdString1(char[] base) {
    this.base = base.clone();
  }
  
  public StdString1() {
    this.base = new char[0];
  }
  
  public StdString1(StdString1 stdString1) {
    //this.base = stdString1.toCharArray().clone();
    this(stdString1.base);   
  }
  
  public int length() {
    return this.base.length;
  }

  public StdString1 append(StdString1 that) {
    if (that == null) {
      throw new NullPointerException(); 
    }
    
    char[] newStr = new char[this.length() + that.length()];
          
    for (int i = 0; i < this.length(); i++) {
      newStr[i] = this.base[i];
    }

    for (int j = 0; j < that.length(); j++) {
      newStr[j + this.length()] = that.base[j];
    }

    return new StdString1(newStr);
  }

  public char[] toCharArray() {
    return this.base.clone();
  }

  public char charAt(final int index) {
    for (char ch : base) {
      if (ch == base[index]) {
        return ch;
      } 
    }
    return (char) 0;
  }

  public int indexOf(final char target) {
    for (int index = 0; index < this.base.length; index++) {
      if (target == this.base[index]) {
        return index;
      } 
    }
    return - 1;
  }
  
  @Override
  public boolean equals(final Object otherObj) {
    if (otherObj == this) {
      return true;
    }
    
    if (otherObj == null || getClass() != otherObj.getClass()) {
      return false;
    }
    
    StdString1 st = (StdString1) otherObj;
    if (Arrays.equals(st.base, this.base)) {
      return true;
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    int result = 0;

    for (int i = 0; i < base.length; i++) {
      result += base[i];
    }
    return result;
  }
  
  @Override
  public String toString() {
    return String.valueOf(base);
  }
  
  @Override
  public Iterator<Character> iterator() {
    return new NewIterator();
  }

  public class NewIterator implements Iterator<Character> {
    int position;

    @Override
    public boolean hasNext() {
      return position < length();
    }
    
    @Override
    public Character next() {
      if (hasNext() == false) {
        throw new NoSuchElementException();
      }
      return base[position++];
    }
  }
  
  @Override
  public void forEach(final Consumer<? super Character> action) {
    Iterable.super.forEach(action);
  }
}
