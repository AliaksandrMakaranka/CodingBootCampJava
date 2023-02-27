package academy.kovalevskyi.codingbootcamp.week1.day3;

public class ListNode<T> {
      
  private ListNode<T> prev;
  private ListNode<T> next;
  private T value;
  
  public ListNode(ListNode<T> prev, ListNode<T> next, T value) {
    setPrev(prev);
    setNext(next);
    this.value = value;
  }
  
  public void setPrev(final ListNode<T> prev) {
    if (this.prev == prev) {
      return;
    }

    this.prev = prev;

    if (prev != null) {
      prev.setNext(this);
    } 
  }
    
  public void setNext(final ListNode<T> next) {
    if (this.next == next) {
      return;
    }
  
    this.next = next;
    
    if (next != null) {
      next.setPrev(this);
    }
  }
  
  public ListNode<T> getNext() {
    return next;
  }
  
  public ListNode<T> getPrev() {
    return prev;
  }
  
  public T getValue() {
    return value;
  }
  
  @Override
  public String toString() {
    var prevNode = this.prev == null ? null : this.prev.value; 
    var nextNode = this.next == null ? null : this.next.value; 
    return "Node{" 
           + "prevValue=" + prevNode 
           + ", nextValue=" + nextNode 
           + ", thisValue=" + this.value 
           + '}'; 
  }  
}

