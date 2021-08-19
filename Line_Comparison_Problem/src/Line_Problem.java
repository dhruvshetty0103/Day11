import java.util.Scanner;
public class Line_Problem {

	public static void main(String[] args) 
	{
		double x1,x2,y1,y2,length_of_line1,length_of_line2;
		Scanner reader=new Scanner(System.in);
		System.out.println("Welccome to Line Comparison Computation");
		System.out.println("Enter end points of first line (x1,y1) and (x2,y2)");
		x1=reader.nextDouble();
		y1=reader.nextDouble();
		x2=reader.nextDouble();
		y2=reader.nextDouble();
		length_of_line1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Enter end points of first line (x3,y3) and (x4,y4)");
		x1=reader.nextDouble();
		y1=reader.nextDouble();
		x2=reader.nextDouble();
		y2=reader.nextDouble();
		reader.close();
		length_of_line2=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		if(length_of_line1==length_of_line2)
			System.out.println("Length of both lines are equal and it's length:"+length_of_line1);
		else
			{
				System.out.println("Length of both lines are not equal");
				System.out.println("Length of line 1:"+length_of_line1);
				System.out.println("Length of line 2:"+length_of_line2);
			}
		
	}

}
