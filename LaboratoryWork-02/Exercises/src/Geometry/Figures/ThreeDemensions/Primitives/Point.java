package Geometry.Figures.ThreeDemensions.Primitives;

public class Point extends Geometry.Figures.TwoDemensions.Primitives.Point
{
	public double z;

	public Point()
	{
		super();
		z = 0;
	}

	public Point(double xCoord, double yCoord, double zCoord)
	{
		super(xCoord, yCoord);
		z = zCoord;
	}
}