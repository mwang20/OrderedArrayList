import java.lang.IllegalArgumentException;
import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  private int ordered(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    for (int i = 0; i < super.size(); i++){
      if (value.compareTo(super.get(i)) < 0){
        return i;
      }
    }
    return super.size();
  }

  public boolean add(T value){
    super.add(ordered(value), value);
    return true;
  }

  public void add(int index, T value){
    super.add(ordered(value), value);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    T removed = super.get(ordered(value));
    super.remove(ordered(value));
    super.add(ordered(value), value);
    return removed;
  }
}
