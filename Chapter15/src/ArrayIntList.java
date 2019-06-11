import java.util.Arrays;

//stores and works with a list of integers

public class ArrayIntList {
	
	private int[] elementData;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 100;
	
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayIntList(int capacity) {
		if(capacity < 0 ) {
			throw new IllegalArgumentException("Capacity: " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
	}
	
	//return the size, current elemtns in the list (size vs capacity)
	public int size() {
		return this.size; //or return size;
	}
	
	//return the integer at given index
	public int get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	//check if the index in bounds for current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index" + index);
		}
	}
	
	//is the list empty
	public boolean isEmpty() {
		return size == 0;
	}

	//create a bracketed string representaion of the list
	public String toString() {
		if(size == 0) {
			return "[]";
		} else {
			String result = "[" + elementData[0];
			for (int i = 0; i < size; i++) {
				result += ", " + elementData[i];
			}
			result += "]";
			return result;
		}
		
	}
	
	//return the position of the first occurrence of a value (-1 if not found)
	public int indexOf(int value) {
		for(int i = 0; i < size; i++) {
			if(elementData[i] == value) {
				return i;
			}
		}
		return -1; //value not found
	}
	
	//returns true if a value is contained in the list; false otherwise.
	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}
	
	//append a value to the end of the list
	public void add(int value) {
		ensureCapacity(size + 1);
		elementData[size] = value;
		size++;
	}

	//ensure array capacity is sufficient, if not size is doubled
	private void ensureCapacity(int capacity) {
		if(capacity > elementData.length) {
			int newCapacity = elementData.length * 2 + 1;
			if(capacity > newCapacity) {
				newCapacity = capacity;
			}
			
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}
	
	//insert a given value at a given index; must shift the subsequent values to the right
	public void add(int index, int value) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index" + index);
		}
		ensureCapacity(size + 1);
		for(int i = size; i > index; i--) {
			elementData[i] = elementData[i-1];
		}
		elementData[index] = value;
		size++;
	}
	
	//remove a value at a specified index, shift values to left
	public void remove(int index) {
		checkIndex(index);
		for(int i = index; i < size -1; i++) {
			elementData[i] = elementData[i+1];
		}
		size--;
	}
	
	//replace the value at a given index with the new value
	public void set(int index, int value) {
		checkIndex(index);
		elementData[index] = value;
	}
	
	//append all values from a given list the the end of this list
	public void addAll(ArrayIntList other) {
		ensureCapacity(size + other.size());
		for(int i = 0; i < other.size(); i++) {
			add(other.elementData[i]);
		}
	}
	
	//return an iterator for the list
	public ArrayIntListIterator iterator() {
		return new ArrayIntListIterator(this);
		
	}
	
	
	
	
	
}




