import java.util.Scanner;
import java.util.function.Function;

import Geometry.Figures.ThreeDemensions.Sphere;
import Geometry.Figures.ThreeDemensions.Primitives.Point;

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		Function<String, Point> typePoint = (String pointType) -> {
			System.out.println("Type " + pointType + " point: ");
			
			System.out.print("\tx: ");
			double x = console.nextDouble();
			
			System.out.print("\ty: ");
			double y = console.nextDouble();

			System.out.print("\tz: ");
			double z = console.nextDouble();
			
			return new Point(x, y, z);
		};
		
		Point sphereCenter = typePoint.apply("Sphere's position");
		
		System.out.print("Type Shpere's radius: ");
		double sphereRadius = console.nextDouble();

		Sphere sphere = new Sphere(sphereCenter, sphereRadius);

		Point checkedPoint = typePoint.apply("must be checked");

		if(sphere.isInsided(checkedPoint))
			System.out.print("Point lies inside of sphere.");
		else
			System.out.print("Point don't lies inside of sphere.");
	}
}
