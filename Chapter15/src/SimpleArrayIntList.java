//simple version of ArrayList of Ints

public class SimpleArrayIntList {
	
	//fields or instance variables
	private int[] elementData;
	private int size;
	
	//constructor
	public SimpleArrayIntList() {
		elementData = new int[100];
		size = 0;
	}
	
	public void add(int value) {
		elementData[size] = value;
		size++;
	}
	
	public String toString() {
		
		if (size == 0) {
			return "[]";
		} else {

			// fence post
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}

			result += "]";
			return result;
		}
	}

	
}
