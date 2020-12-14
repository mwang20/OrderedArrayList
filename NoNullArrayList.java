import java.lang.IllegalArgumentException;
import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
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
    T removed = super.get(index);
    super.remove(index);
    super.add(index, value);
    return removed;
  }
}
