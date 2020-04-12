import java.util.Scanner;
import java.util.function.Function;
import Geometry.Figures.TwoDemensions.Rectangle;
import Geometry.Figures.TwoDemensions.Primitives.Point;

public class Exercise1
{
	public static void main(String[] args)
	{
		Function<String, Point> typePoint = (String pointPosition) -> {
			Scanner console = new Scanner(System.in);
			
			System.out.println("Type " + pointPosition + " point: ");
			
			System.out.print("\tx: ");
			double x = console.nextDouble();
			
			System.out.print("\ty: ");
			double y = console.nextDouble();
			
			return new Point(x, y);
		};

		Rectangle rect = new Rectangle(typePoint.apply("Top-Left"), typePoint.apply("Bottom-Right"));

		System.out.println("Rectangle:\n" +
			"\tTop-Left Point: (" + rect.getTopLeftPoint().x + ", " + rect.getTopLeftPoint().y + ")\n" +
			"\tBottom-Right Point: (" + rect.getBottomRightPoint().x + ", " + rect.getBottomRightPoint().y + ")");	
	}
}
