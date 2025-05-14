package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<>();
		 //주소 x+y-->주소 만드는 공식을 잘 만들면 횟수 줄일수 있음
		Point p01 = new Point(1,2); 	//11111-->3
		Point p02 = new Point(10,20);	//22222-->30	       
        Point p03 = new Point(2,1);		//33333-->3        
        Point p04 = new Point(1,2);		//44444-->3 
        
        Point p05 = new Point(0,3);		//55555-->3	주소 x*y 
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		pSet.add(p05);
		
		System.out.println("------------------");
		System.out.println(pSet.toString());
		
		System.out.println("------------------");
		for (Point p : pSet) {
			
			//System.out.println(pSet.get(x).toString());
			System.out.println(p.hashCode());
			System.out.println(p.toString());
		}
		
	}
}
