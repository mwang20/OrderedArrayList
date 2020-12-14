import java.lang.IllegalArgumentException;
import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
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
    int correct = ordered(value);
    if (correct == super.size()){
      correct = super.size() - 1;
    }
    T removed = super.get(index);
    super.remove(index);
    add(correct, value);
    return removed;
  }
}
