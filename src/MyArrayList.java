import java.lang.reflect.Type;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author zac
 *
 * @param <E>
 */
public class MyArrayList<E> implements List211<E> {

  private int placeHolder;
  private int size = 0;
  private E[] data;
  private E e;
  private boolean finished;
  private Comparator comp;

  MyArrayList() {

    data = (E[]) new Object[10];
  }

  public int indexOf(Object obj){
    
    for(int i = 0; i < size; i++){
      if (obj.equals(data[i])){
        return i;
      }
    }
    return -1;
  }


  public void checkIndex(int index){
    
    if(index < 0 || index >= size){
      throw new ArrayIndexOutOfBoundsException(index);
    }
  }
  @Override
  public boolean add(E element) {

    if (size == data.length) {
      reallocate();
    }
    data[size] = element;
    size ++;

    return true;
  }

  
  @Override
  public void add(int index, E element) {


	    if(size == data.length){
	      reallocate();
	    }
    if(index < 0 || index > size){
      throw new ArrayIndexOutOfBoundsException(index);
    }

    
    for (int i = size; i > index; i --){
      data[i] = data[i -1];
    }
    data[index] = element;

    size ++;
  }

  public void bubbleSort(Comparator<? super E> compare) {

    for (int i = 0; i < size - 1; i++) {

      finished = true;

      for (int j = 0; j < size - 1 - i; j++) {

        if (compare.compare(data[j], data[j + 1]) > 0) {

          finished = false;
          e = data[j];
          data[j] = data[j + 1];
          data[j + 1] = e;
        }
      }

      if (finished == true) {
        break;
      }
    }
  }

  @Override
  public E get(int index) {

    checkIndex(index);

    return data[index];
  }

  public void insertionSort(Comparator<? super E> compare) {

    for (int i = 0; i < size - 1; i++) {

      placeHolder = i;

      while (compare.compare(data[placeHolder], data[placeHolder + 1]) > 0) {

        e = data[placeHolder];
        data[placeHolder] = data[placeHolder + 1];
        data[placeHolder + 1] = e;

        if (placeHolder > 0) {
          placeHolder--;
        }
      }
    }
  }

  private void reallocate() {
    data = Arrays.copyOf(data, data.length * 2);
  }

  @Override
  public E remove(int index) {

    checkIndex(index);

    e = data[index];

    for(int i = index; i < size - 1; i ++){
      data[i] = data[i + 1];
    }
    size --;
    return e;
  }

  public void selectionSort(Comparator<? super E> compare) {

    for (int i = 0; i < size - 1; i++) {

      e = data[i];
      placeHolder = i;

      for (int j = i; j < size; j++) {

        if (compare.compare(e, data[j]) > 0) {

          e = data[j];
          placeHolder = j;
        }
      }

      data[placeHolder] = data[i];
      data[i] = e;
    }
  }

  @Override
  public E set(int index, E element) {

    checkIndex(index);		

    e = data[index];
    data[index] = element;
    return e;
  }

  @Override
  public int size() {
    return size;
  }

}
