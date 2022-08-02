package shape;

import java.util.*;


public class AreaCalculate {
	public static void main(String[] args) {
		square s = new square();
		triangle t = new triangle();
		circle c= new circle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("\n 1.Area of sqaure \n 2.Area of triangle \n Area of circle");
		int ch= sc.nextInt();
		
		while(true) {
		
		if(ch==1) 
		{
			System.out.println("Enter the length of square");
			float a = sc.nextFloat();
			float result = s.Area(a);
			System.out.println("Area of square is:");
			System.out.println(result);
			
			
		}
		if(ch==2) 
		{
			System.out.println("Enter the length and breath of triangle");
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float result = t.Area(a,b);
			System.out.println("Area of triangle is:");
			System.out.println(result);
			
			
		}
		
		if(ch==3) 
		{
			System.out.println("Enter the radius of circle");
			float r = sc.nextFloat();
			float result = c.Area(r);
			System.out.println("Area of circle is:");
			System.out.println(result);
			
			
		}
		
		}
		
	}	
		
		
	}

