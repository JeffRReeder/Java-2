import java.io.File;
import java.util.Scanner;

public class DirectoryCrawler {
	
	public static void main (String [] args) {
		System.out.println("Test");
		
		Scanner console = new Scanner(System.in);
		System.out.println("Dir or file name? ");
		String name = console.nextLine();
		
		File f = new File(name);
		if(!f.exists()) {
			System.out.println("No such file or dir");
		} else {
			print(f, 0);
		}
		
		
	}

	private static void print(File f, int level) {
		for(int i = 0; i < level; i++) {
			System.out.print("    ");
		}
		
		System.out.println(f.getName());
		if(f.isDirectory()) {
			for(File subF : f.listFiles()) {
				print(subF, level + 1);
			}
		}
		
	}

	
	
}
