import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Homework11_3 {

	public static void main(String[] args) {
		//

	}
	
	//is Unique tests if a map has unique values
	public static boolean isUnique(Map <String, String> map) {
		Set<String> values = new HashSet();
		
		for(String value : map.values()) {
			if(values.contains(value)) {
				return false; //the value is already there
			} else {
				values.add(value);
			}
		}
		return true;
	}

}
