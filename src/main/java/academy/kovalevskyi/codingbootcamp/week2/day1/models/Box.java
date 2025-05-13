package academy.kovalevskyi.codingbootcamp.week2.day1.models;

public record Box(int width, int height, String wall, String corner, String message) {

  public class Builder {
    
    private int width;
    private int height;
    private String wall;
    private String corner;
    private String message;
    
    public Builder(int width, int height, String wall, String corner, String message) {
      
      this.width = width;
      this.height = height;
      this.wall = wall;
      this.corner = corner;
      this.message = message;     
    }

    
    public void setWall(String wall) {
      if (wall != null) {
        this.wall = wall;
      }
    }

    public void setWidth(int width) {
      if (width > 4) {
        this.width = width;
      } else {
        throw new NoSuchMethodError();
      }
    }
 
    @Override
    public String toString() {
      return String.format("Box[width=%d, height=%d, wall=%s, corner=%s, message=%s]",
          width, height, wall, corner, message);
    }

  }

}
