package academy.kovalevskyi.codingbootcamp.week1.day0;


public class Point implements Comparable<Point> {

  private final int coordinateX;
  private final int coordinateY;

  public Point(final int coordinateX, final int coordinateY) {

    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
  }
  
  public int getX() {
    return coordinateX;
  }
  
  public int getY() {
    return coordinateY;
  }
  
  public Point sum(final Point that) {
    int newX = this.getX() + that.getX();
    int newY = this.getY() + that.getY();
    
    return new Point(newX, newY);
  }
  
  public Point updateX(final int newX) {
    return new Point(newX, this.getY()); 
  }
  
  public Point updateY(final int newY) {
    return new Point(this.getX(), newY);
  }
  
  public int distanceTo(Point that) {
    int a = this.getX() - that.getX();
    int b = this.getY() - that.getY();
    int result = (a * a) + (b * b);

    return result;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Point point = (Point) o;
    
    if (getX() == point.getX() && getY() == point.getY()) {
      return true;
    }
    
    return false;
  } 
  
  @Override
  public int hashCode() {
    return coordinateX + coordinateY;
  }
  
  @Override
  public String toString() {
    return String.format("Point{X: %d, Y: %d}", this.getX(), this.getY());
  }

  @Override
  public int compareTo(Point that) {
    return this.hashCode() - that.hashCode();
  }
}
