package academy.kovalevskyi.codingbootcamp.week1.day1;

import academy.kovalevskyi.codingbootcamp.week1.day0.Point;
import academy.kovalevskyi.codingbootcamp.week1.day1.PointWithValue;
import java.util.Comparator;

public class PointWithLabel<T> extends PointWithValue<String> {

  public PointWithLabel(int coordinateX, int coordinateY, String value) {
    super(coordinateX, coordinateY, value); 
  }  
  
  public String getLabel() {
    return this.getValue();
  }
  
  @Override
  public int compareTo(Point point) {
    if (point instanceof PointWithLabel) {
      PointWithLabel z = (PointWithLabel) point;
      return this.getLabel().compareTo(z.getLabel());
    }
    return super.compareTo(point); 
  }
}
