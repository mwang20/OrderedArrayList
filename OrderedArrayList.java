import java.lang.IllegalArgumentException;
import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

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
}
