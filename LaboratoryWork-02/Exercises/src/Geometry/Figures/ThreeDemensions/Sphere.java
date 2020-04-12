package Geometry.Figures.ThreeDemensions;

import java.util.function.DoubleUnaryOperator;
import Geometry.Figures.ThreeDemensions.Primitives.Point;

public class Sphere
{
	private Point position;
	private double radius;

	public Sphere(Point position, double radius)
	{
		this.position = position;
		this.radius = radius;
	}

	public boolean isInsided(Point point)
	{
		DoubleUnaryOperator square = (double x) -> { return x * x; };

		return square.applyAsDouble(position.x - point.x) + 
			   square.applyAsDouble(position.y - point.y) + 
			   square.applyAsDouble(position.z - point.z) < square.applyAsDouble(radius);
	}

	public Point getPosition() { return position; }
	public double getRadius() { return radius; }

}