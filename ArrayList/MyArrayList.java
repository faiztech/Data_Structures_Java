import java.util.Arrays;
	
public class MyArrayList <T> {
	
	private int size = 0;
	private static final int def_cap = 10;
	private Object elements[];

	//constructor
	public MyArrayList() {
		elements = new Object[def_cap];
	}

	//add function
	public void add(T e) {
		if (size == elements.length) {
			increaseCapacity();
		}
		elements[size++] = e;
	}

	//get function
	    @SuppressWarnings("unchecked")
	public T get(int i) {
		if (i >= size || i < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return (T) elements[i];
	}

	//remove function
	public void remove(int i) {
		if (i >= size || i < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		elements[i] = null;
		int temp = i;

		while (temp < size) {
			elements[temp] = elements[temp + 1];
			elements[temp + 1] = null;
			temp++;
		}
		size--;
	}

	//size function
	public int size() {
		return size;
	}

	//increase capacity
	public void increaseCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

}