import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		//create an array list of doubls
		ArrayList<Double> grades = new ArrayList<Double>();
		grades.add(3.2);
		grades.add(2.7);
		
		double myGrade = grades.get(0);
		//int size = grades.size();
		
		System.out.println(grades.size());
		System.out.println(myGrade);
		
		//build the list of stop words
		ArrayList<String> stopWords = new ArrayList<String>();
		stopWords.add("a");
		stopWords.add("be");
		stopWords.add("by");
		stopWords.add("how");
		stopWords.add("is");
		stopWords.add("it");
		stopWords.add("or");
		stopWords.add("that");
		
		stopWords.add("ducks");
		stopWords.add("duck");
		
		stopWords.add("the");
		stopWords.add("this");
		stopWords.add("to");
		stopWords.add("why");
		
		//process the file printing all but the stop words
		System.out.println(stopWords);
		
		Scanner input = new Scanner(new File("words.txt"));
		
		while(input.hasNext()){
			String next = input.next();
			if(!stopWords.contains(next.toLowerCase())){
				System.out.println(next + " ");
			}

	}

}
}
