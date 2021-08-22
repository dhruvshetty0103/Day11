import java.util.Scanner;

class Distance
{
	Scanner reader=new Scanner(System.in);
	double read()
	{
		
		double point=reader.nextDouble();
		
		return point;
	}
	double Distance_Calculation(double x1,double y1,double x2,double y2)
	{
		
		return (double)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	}
}

public class Line_Problem 
{
	public static void main(String[] args) 
	{
		Distance d=new Distance();
		double x1,x2,y1,y2,length_of_line1,length_of_line2;
		System.out.println("Welccome to Line Comparison Computation");
		System.out.println("Enter end points of first line (x1,y1) and (x2,y2)");
		x1=d.read();
		y1=d.read();
		x2=d.read();
		y2=d.read();
		length_of_line1=d.Distance_Calculation(x1, y1, x2, y2);
		Double l1=new Double(length_of_line1);
		System.out.println("Enter end points of first line (x3,y3) and (x4,y4)");
		x1=d.read();
		y1=d.read();
		x2=d.read();
		y2=d.read();
		length_of_line2=d.Distance_Calculation(x1, y1, x2, y2);
		Double l2=new Double(length_of_line2);
		if(l1.equals(l2))
			System.out.println("Length of both lines are equal and it's length:"+length_of_line1);
		else
		{
			int result=l1.compareTo(l2);
			if(result==1)
			{
				System.out.println("Line 1 is greater than line 2");
				System.out.println("Line 1 length:"+length_of_line1);
				System.out.println("Line 2 length:"+length_of_line2);
			}
			else
			{
				System.out.println("Line 2 is greater than line 1");
				System.out.println("Line 2 length:"+length_of_line2);
				System.out.println("Line 1 length:"+length_of_line1);
				
			}
		}
	}

}
