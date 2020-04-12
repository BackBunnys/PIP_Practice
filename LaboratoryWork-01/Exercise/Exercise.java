import java.util.Scanner;

public class Exercise
{

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		System.out.print("N: ");
		int N = console.nextInt();

		System.out.print("M: ");
		long M = console.nextLong();

		new Exercise(N, M);
	}

	public Exercise(int N, long M)
	{
		long factorial = 1;
		int i;

		for(i = 1; i <= N && factorial <= M; ++i) {
			factorial *= i;

			System.out.print(factorial + " ");
		}

		if(i == 1)
		 	System.out.println("NO");
	}

}