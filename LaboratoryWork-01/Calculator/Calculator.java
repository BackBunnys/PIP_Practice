import java.util.Scanner;

public class Calculator
{
	public static final char ADD = 43;
	public static final char SUBTRACT = 45;
	public static final char MULTIPLY = 42;
	public static final char DIVIDE = 47;

	public static void main(String[] args)
	{
		new Calculator();
	}

	public Calculator()
	{
		Scanner console = new Scanner(System.in);

		while(true) {
			System.out.print("First Number: ");
			double num1 = console.nextDouble();

			System.out.print("Second Number: ");
			double num2 = console.nextDouble();

			System.out.print("Operator (+-/*): ");
			String input = console.next("[+-/*]");
			char operator = input.charAt(0);

			double result = Double.NaN;

			switch(operator) {
				case ADD:
					result = num1 + num2;
					break;

				case SUBTRACT:
					result = num1 - num2;
					break;

				case MULTIPLY:
					result = num1 * num2;
					break;

				case DIVIDE:
					result = num1 / num2;
					break;

				default: break;
			}

			System.out.println(num1 + " " + operator + " " + num2 + " = " + 
							   result + "\n");
		}
	}
}