import java.util.Scanner;

public class PreFixEvaluator {
	public static void main (String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("This program evaluates prefix expressions");
		System.out.println("For operators +, -, *, / and % ");
		
		System.out.println("Expression? ");
		System.out.println("value = " + evaluate(console));
		
	}
	
	//pre: input contains valid prefix expression
	//post: expression is consumed and the result returned (ex. - 8 5 "value = 3.0")
	public static double evaluate(Scanner input) {
		if(input.hasNextDouble()) {
			return input.nextDouble();
		} else {
			String operator = input.next();
			double operand1 = evaluate(input);
			double operand2 = evaluate(input);
			return evaluate(operator, operand1, operand2);
		}
		
	}

	private static double evaluate(String operator, double operand1, double operand2) {
		if(operator.contentEquals("+")) {
			return operand1 + operand2;
		} else if (operator.contentEquals("-")) {
			return operand1 - operand2;
		} else if (operator.contentEquals("*")) {
			return operand1 * operand2;
		} else if (operator.contentEquals("/")) {
			return operand1 / operand2;
		} else if (operator.contentEquals("%")) {
			return operand1 % operand2;
		} else {
			throw new RuntimeException("Illegal operator " + operator);
		}
	
	}
}
