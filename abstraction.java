package FileOperation;

import java.util.Scanner;

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		rectangle r=new rectangle();
		
		c.getdata();
		
         c.calulate();
        r.getdata();
		r.calulate();
		

	}

	
	
}

abstract class shapes{
	double area;
	abstract void getdata();
	abstract void calulate();
	void disp()
	{
		System.out.println("AREA IS:"+area);
		
	
	}
}

class circle extends shapes{
    float r;
	@Override
	void getdata() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextFloat();
		
		
	}

	@Override
	void calulate() 
	{
		// TODO Auto-generated method stub
		area=3.14*r*r;
		System.out.println("area is"+area);
		
	}
	
}


class rectangle extends shapes
{   float ln,bth;

	@Override
	void getdata() {
		// TODO Auto-generated method stub
  	System.out.println("enter length and breadth\n");
		Scanner sc = new Scanner(System.in);
		ln=sc.nextFloat();
		bth=sc.nextFloat();
			
	}

	@Override
	void calulate() {
		// TODO Auto-generated method stub
		System.out.println("the area of the rectangle is:"+(ln*bth));
	}
	
}





