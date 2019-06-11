//ArrayList examples

import java.util.ArrayList;


public class Test3 {

	public static void main(String[] args) {
		//create an arraylist of Integers
				ArrayList<Integer> list = new ArrayList<Integer>();
				//ArrayList<Integer> list = new ArrayList<>(); // can leave out second data type <Integer>
				//populate the arraylist
				list.add(13);
				list.add(47);
				list.add(15);
				list.add(9);
			
				int sum = 0;
				//for each loop
				for(int n : list){  //for each element  in the list
					System.out.println("N is: " + n);
					System.out.println("sum is: " + sum);
					sum+=n;
				}
				
				System.out.println(list);
				System.out.println("Sum: " + sum);
				


	}

}
