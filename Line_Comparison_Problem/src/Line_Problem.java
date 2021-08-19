import java.util.Scanner;
public class Line_Problem {

	public static void main(String[] args) 
	{
		double x1,x2,y1,y2,length_of_line;
		Scanner reader=new Scanner(System.in);
		System.out.println("Welccome to Line Comparison Computation");
		
		System.out.println("Enter x1 and y1\n");
		x1=reader.nextDouble();
		y1=reader.nextDouble();
		System.out.println("Enter x2 and y2\n");
		x2=reader.nextDouble();
		y2=reader.nextDouble();
		reader.close();
		length_of_line=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		System.out.println("Length of line:"+length_of_line);
		
	}

}
