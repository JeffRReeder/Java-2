import java.util.Random;

public class BigOh {
	public static void main(String[] args) {

		// call method to calculate runtime for the range method
		timeRange();

	}

	// Returns the range of numbers in the given array.
	public static int range(int[] numbers) {
		int maxDiff = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				int diff = Math.abs(numbers[j] - numbers[i]);
				maxDiff = Math.max(maxDiff, diff);
			}
		}
		return maxDiff;
	}

	// Returns the largest of all integers in the given array.
	public static int range2(int[] numbers) {
		int maxDiff = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int diff = Math.abs(numbers[j] - numbers[i]);
				maxDiff = Math.max(maxDiff, diff);
			}
		}
		return maxDiff;
	}

	// Returns the largest of all integers in the given array.
	public static int range3(int[] numbers) {
		int max = numbers[0];
		int min = max;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		return max - min;
	}

	public static void timeRange() {
		System.out.printf("%10s %10s %10s (ms)\n", "n", "Range", "Runtime");
		for (int n = 1000; n <= 999999999; n *= 2) {
			int[] numbers = createRandomIntArray(n);

			long time = System.currentTimeMillis();
			int range = range3(numbers);
			//int range = range2(numbers);
			time = System.currentTimeMillis() - time;

			System.out.printf("%10d %10d %10d\n", n, range, time);
		}
	}

	public static int[] createRandomIntArray(int size) {
		int[] numbers = new int[size];
		Random rand = new Random();
		int min = rand.nextInt(size);
		int max = rand.nextInt(size - min) + min;
		for (int i = 0; i < size; i++) {
			numbers[i] = rand.nextInt(max - min + 1) + min;
		}
		return numbers;
	}

}