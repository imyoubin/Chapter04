package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {
	
	public static void main(String[] args) {
		
		//HashMap 준비 ->키(String), 벨류를 2가지를 정해줘야함
		Map<String, Point> pMap =new HashMap<String, Point>();

		//포인트
		Point p01 = new Point(2,4); 	
		Point p02 = new Point(2,4);		       
        Point p03 = new Point(43,78);
		
        //Map네 포인트(주소)넣기 -->키 중복되지 않게 정해준다
        pMap.put("정우성", p01);
        pMap.put("이효리", p02);
        pMap.put("유재석", p03);
        //갯수
        System.out.println(pMap.size());
        
        System.out.println("-------------------------");
        //pMap.toString()
        System.out.println(pMap.toString());
        
        System.out.println("-------------------------");
        //유재석의 toString()
        System.out.println(pMap.get("유재석").toString());
        System.out.println(pMap.get("유재석").getX());
        System.out.println("-------------------------");
        //유재석 삭제
        pMap.remove("유재석");	//포인트(유재석) 삭제
        System.out.println(pMap.toString());
        System.out.println("-------------------------");
        //서장훈 추가
        Point p04 = new Point(100,120);
        pMap.put("서장훈", p04);	//서장훈 포인트(주소) 추가
        System.out.println(pMap.toString());
        System.out.println("-------------------------");
        
        //같은 키값 사용했를때        
		Point p05 = new Point(20,40);
	    pMap.put("이효리", p05);	//이효리 넣었을때 (이미 들어가 있음)
	    System.out.println(pMap.toString());	//나중에 들어가 있는 주소값으로 대체
	    System.out.println("-------------------------");
	    
	    //전체출력	    
	    //1. 키세트를 달락고한다
	    Set<String> keys = pMap.keySet();
	    //2. 키세트의 키값을 1나씩 꺼내서 해당 키값의 정보출력
	    for(String name : keys) {
	    	System.out.println(pMap.get(name).toString());
	    }
	    System.out.println("-------------------------");
	    
	   Map<String,String> boardMap = new HashMap<String,String>();
	   boardMap.put("title", "게시판 제목입니다.");
	   boardMap.put("data", "2025-05.14");
	   boardMap.put("id", "jus");
	   boardMap.put("content", "게시판 글 내용 입니다");
	   
	   System.out.println(boardMap.get("title"));
	   System.out.println(boardMap.get("data"));
	   System.out.println(boardMap.get("id"));
	   System.out.println(boardMap.get("content"));
	   
	}
}
	
