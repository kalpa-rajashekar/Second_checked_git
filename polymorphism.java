package FileOperation;

import java.util.Scanner;

public class polymorphism {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		circle1 c=new circle1();
		rectangle1 r=new rectangle1();
		geometry g=new geometry();
		g.usage(c);
		g.usage(r);
		
		

	}

}
class geometry
{
	void usage(shapes1 s)
	{
		s.getData();
		s.calculate();
		s.disp();
	}
	
}

abstract class shapes1
{
	double area;
	abstract void getData();
	abstract void calculate();
	void disp()
	{
		System.out.println("AREA:"+area);
	}
	
}

class circle1 extends shapes1
{
     float r;
	@Override
	void getData() 
	{
		// TODO Auto-generated method stub
		System.out.println("enter radius\n");
		Scanner sc=new Scanner(System.in);
		r=sc.nextFloat();
				
		
	}
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		System.out.println("AREA OF A CIRCLE IS:"+(2*3.14*r));
	}
}


class rectangle1 extends shapes1
{
     float length,breadth;
	@Override
	void getData() 
	{
		// TODO Auto-generated method stub
		System.out.println("enter length and breadth\n");
		Scanner sc=new Scanner(System.in);
		length=sc.nextFloat();
		breadth=sc.nextFloat();
		
		
				
		
	}
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		System.out.println("AREA OF A rectangle IS:"+(length*breadth));
	}
}
