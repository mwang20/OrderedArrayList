import java.lang.IllegalArgumentException;
import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    super.add(value);
    return true;
  }

}
