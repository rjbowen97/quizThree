package base;

public class Triangle
{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	Triangle()
	{
		
	}
	
	Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side1;
		this.side3 = side1;
	}
	
	public double getSide1()
	{
		return(this.side1);
	}
	
	public double getSide2()
	{
		return(this.side1);
	}
	
	public double getSide3()
	{
		return(this.side1);
	}
	
	public double getArea()
	{
		/*
		 * Returns the area of the triangle using heron's formula.
		 * 
		 * @param  none
		 * @return 		The area of the instance of Triangle
		*/
		//herons formula
		double height = (this.side1 + this.side2 + this.side3)*0.5;
		return(Math.sqrt(height * (height - side1) * (height - side2) * (height - side3)));
	}
	
	public double getPerimeter()
	{
		/*
		 * Returns the perimeter of the triangle using its side lengths.
		 * 
		 * @param  none
		 * @return 		The perimeter of instance triangle
		*/
		return(side1+side2+side3);
	}
	
	
	/*
	 * Returns the perimeter of the triangle using its side lengths.
	 * 
	 * @param  none
	 * @return 		The perimeter of instance triangle
	*/
	public String getDescription()
	{
		return("The triangle has lengths " + side1 + ", " + side2 + ", and " + side3 + ".");
	}
	
}
