package com.javaex.ex03;

import com.javaex.ex02.Circle;
import com.javaex.ex02.MyList;
import com.javaex.ex02.Point;

public class MyApp {

	public static void main(String[] args) {
		
		
		 MyList<Point> pList = new MyList<Point>();

	        // 포인트 객체 추가
	        pList.add(new Point(2, 2));
	        pList.add(new Point(3, 3));
	        pList.add(new Point(4, 4));

	        // 포인트 출력
	        for (int i = 0; i < pList.size(); i++) {
	            System.out.println(pList.get(i).toString());
	        }

	        System.out.println("------------------------");

	        MyList<Circle> cList = new MyList<Circle>();

	        cList.add(new Circle(10));
	        cList.add(new Circle(20));
	        cList.add(new Circle(30));

	        // 원 출력
	        for (int i = 0; i < cList.size(); i++) {
	            Circle c = cList.get(i);  // 제네릭 덕분에 캐스팅 필요 없음
	            System.out.println(c.toString());
	            System.out.println(cList.get(i) + c.getRadius());
	        }

	    }

	}
