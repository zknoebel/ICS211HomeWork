import java.util.*;
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
	ArrayList<E> contacts = new ArrayList();
	ContactComparator comp = new ContactComparator();
	
	MyArrayList(){
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		contacts.add(e);
		
		insertionSort((Comparator<? super E>) comp);
		
		return true;
	}

	@Override
	public void add(int index, E element) {
		
		contacts.add(index, element);

	}

//	public void bubbleSort(Comparator<? super E> compare) {
//
//		for (int i = 0; i < data.length - 1; i++) {
//
//			finished = true;
//
//			for (int j = 0; j < data.length - 1 - i; j++) {
//
//				if (compare.compare(data[j], data[j + 1]) > 0) {
//
//					finished = false;
//					e = data[j];
//					data[j] = data[j + 1];
//					data[j + 1] = e;
//				}
//			}
//
//			if (finished == true) {
//				break;
//			}
//		}
//	}
	

	public void bubbleSort(Comparator<? super E> compare) {

		for (int i = 0; i < contacts.size() - 1; i++) {

			finished = true;

			for (int j = 0; j < contacts.size() - 1 - i; j++) {

				if (compare.compare(contacts.get(j), contacts.get(j + 1)) > 0) {

					finished = false;
					e = contacts.get(j);
					contacts.set(j, contacts.get(j +1));
					contacts.set(j +1, e);
				}
			}

			if (finished == true) {
				break;
			}
		}
	}

	@Override
	public E get(int index) {
		return contacts.get(index);
	}

//	public void insertionSort(Comparator<? super E> compare) {
//
//		for (int i = 0; i < data.length - 1; i++) {
//
//			placeHolder = i;
//
//			while (compare.compare(data[placeHolder], data[placeHolder + 1]) > 0) {
//
//				e = data[placeHolder];
//				data[placeHolder] = data[placeHolder + 1];
//				data[placeHolder + 1] = e;
//
//				if (placeHolder > 0) {
//					placeHolder--;
//				}
//			}
//		}
//	}
	

	public void insertionSort(Comparator<? super E> compare) {

		for (int i = 0; i < contacts.size() - 1; i++) {

			placeHolder = i;

			while (compare.compare(contacts.get(placeHolder), contacts.get(placeHolder + 1)) > 0) {

				e = contacts.get(placeHolder);
				contacts.set(placeHolder, contacts.get(placeHolder + 1));
				contacts.set(placeHolder + 1, e);

				if (placeHolder > 0) {
					placeHolder--;
				}
			}
		}
	}

	
	@Override
	public E remove(int index) {
		
		E temp = contacts.get(index);
		contacts.remove(index);
		return temp;
	}

//	public void selectionSort(Comparator<? super E> compare) {
//
//		for (int i = 0; i < data.length - 1; i++) {
//
//			e = data[i];
//			placeHolder = i;
//
//			for (int j = i; j < data.length; j++) {
//
//				if (compare.compare(e, data[j]) > 0) {
//
//					e = data[j];
//					placeHolder = j;
//				}
//			}
//
//			data[placeHolder] = data[i];
//			data[i] = e;
//		}
//	}
	

	public void selectionSort(Comparator<? super E> compare) {

		for (int i = 0; i < data.length - 1; i++) {

			e = data[i];
			placeHolder = i;

			for (int j = i; j < data.length; j++) {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

}
