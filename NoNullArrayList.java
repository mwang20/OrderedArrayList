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

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    super.add(index, value);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    super.set(index, value);
    return super.set(index, value);
  }
}
