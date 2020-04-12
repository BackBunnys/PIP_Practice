package Geometry.Figures.TwoDemensions;

import Geometry.Figures.TwoDemensions.Primitives.Point;

public class Rectangle
{
	private Point topLeftPoint, bottomRightPoint;

	public Rectangle(Point topLeftPoint, Point bottomRightPoint)
	{
		this.topLeftPoint = topLeftPoint;
		this.bottomRightPoint = bottomRightPoint;
	}

	public Point getTopLeftPoint()
	{
		return topLeftPoint;
	}

	public Point getBottomRightPoint()
	{
		return bottomRightPoint;
	}
}