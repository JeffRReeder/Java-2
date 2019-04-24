import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


//HashMap test
public class MapTest {
	
	public static void main (String[] args) {
		//create a map
		Map<String, Double> salaryMap = new HashMap<String, Double>();
		
		//add key value pairs to it
		salaryMap.put("Stuart Reges", 100000.00);
		salaryMap.put("Marty Stepp", 90000.00);
		salaryMap.put("Mickey Mouse", 85000.00);
		
		System.out.println(salaryMap);
		
		//look up a value
		double mickeySalary = salaryMap.get("Mickey Mouse");
		System.out.printf("Mickey's salary is $%.2f\n", mickeySalary);
		
		//create SSN(keys) and name(values) map
		Map<Integer, String> ssnMap = new TreeMap<Integer, String>();
		ssnMap.put(111111111, "Stuart Reges");
		ssnMap.put(222222222, "Marty Stepp");
		ssnMap.put(333333333, "Mickey Mouse");
		
		//loop over and print every person's SSN
		Set<Integer> ssnSet = ssnMap.keySet();
		for (int ssn: ssnSet) {
			System.out.println("SSN: " + ssn);
		}
		
		//loop over each person's name
		Collection<String> names = ssnMap.values();
		for(String name: names) {
			System.out.println("Name: " + name);
		}
		//can't use "MAPS" with iterator so need to do this below
		//print both SSN(key) and the name(Value)
		for(int ssn : ssnMap.keySet()) { //we got the keys here
			//pass the key to the get method which will return corresponding value
			String name = ssnMap.get(ssn);
			System.out.println(ssn + " " + name);
		}
		
	}
}
