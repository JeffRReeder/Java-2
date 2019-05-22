import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] numbers = {2,5,-2,4,42,3};
		
		int n = 100000;
		int[] numbers1 = createRandomInArray(n);
		
		
		//test selection sort time
		long start = System.currentTimeMillis();
		
		selectionSort(numbers1);
		
		double elapsed = (System.currentTimeMillis() - start) / 1000.0;
		
		System.out.println("selection sort " + elapsed + "seconds");
		//System.out.println(Arrays.toString(numbers));
		
		Random r = new Random();
		String[] list1 = new String[n];
		
		for(int i = 0; i < n; i++) {
			String text = "some text with #" + r.nextInt(2 * n);
			list1[i] = text;
		}
		
		//test merge sort time
		
		start = System.currentTimeMillis();
				
		mergeSort(list1);
				
		double elapsed2 = (System.currentTimeMillis() - start) / 1000.0;
		System.out.println("merge sort " + elapsed2 + "seconds");
		
	}

	
	private static int[] createRandomInArray(int size) {
		int[] numbers1 = new int[size];
		Random rand = new Random();
		
		int min = rand.nextInt(size);
		int max = rand.nextInt(size - min) + min;
		for(int i = 0; i < size; i++) {
			numbers1[i] = rand.nextInt(max - min + 1) + min;	//2 versions to randomize numbers1 array.
			//numbers1[i] = rand.nextInt(size * 2);
		}
		
		
		return numbers1;
	}


	//selection sort: Place elements of the array into a sorted order.
	//Post: Array is sorted in nondecreasing order
	public static void selectionSort(int[] a) {
		for(int i = 0; i < a.length -1; i++) {
			//find the smallest element
			int smallest = i;
			for(int j = i+1; j < a.length; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}
			
			swap(a, i, smallest); //swap the  smallest to the front
		}
	}

	//swap a[i] with a[j]
	private static void swap(int[] a, int i, int smallest) {
		if(i != smallest) {
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
		
	}
	
	
	public static void mergeSort(String[] array) {
		if(array.length > 1) {
			//spllt the array into 2 smaller arrays
			int size1 = array.length /2;
			int size2 = array.length - size1;
		
			String[] half1 = new String[size1];
			String[] half2 = new String[size2];
			
			for(int i = 0; i < size1; i++) {
				half1[i] = array[i];
			}
			for (int i = 0; i < size2; i++) {
				half2[i] = array[i + size1];
			}
			
			mergeSort(half1);
			mergeSort(half2);
			
			//merge the sorted halves into a sorted whole array
			merge(array, half1, half2);
			
		}
	}


	private static void merge(String[] result, String[] list1, String[] list2) {
		int i1 = 0;
		int i2 = 0;
		
		for(int i = 0; i < result.length; i++) {
			if(i2 >= list2.length || (i1 < list1.length && list1[i1].compareTo(list2[i2]) <= 0 )){//stay "inbounds" of array
				result[i] = list1[i1]; //pull from list 1
				i1++;
			} else {
				result[i] = list2[i2]; // pull from list 2
				i2++;
			}
		}
		
	}
	
	
}
