package exercise5;

import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {
		next = null;
	}
	
	public void setNext(Shape obj) {
		next = obj;
	}
	
	public Shape getNext() {
		return next;
	}
	
	public abstract void draw(); // 추상 메소드
}

class Line extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{

	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor{
	    Scanner sc = new Scanner(System.in);
	    
	    private Shape start,end;
	    private int num;
	    
	    public void run() {
	        System.out.println("그래픽 에디터 beauty를 실행합니다.");
	        boolean point=true;
	        while(point) {
	            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
	            num = sc.nextInt();
	            switch(num) {
	            case 1:
	                System.out.print("Line(1), Rect(2), Circle(3)>>");
	                int a = sc.nextInt();
	                insert(a);
	                break;
	            case 2:
	                System.out.print("삭제할 도형의 위치>>");
	                int loc = sc.nextInt();
	                delete(loc);
	                break;
	            case 3:
	                Shape f = start;
	                while(true) {
	                    if(start==null) {    //아무것도 없을떄
	                        System.out.println("아무것도 없어요");
	                        break;
	                    }
	                    if(start.equals(end)) {    //하나만 있을때
	                        start.draw();
	                        break;
	                    }
	                    else {
	                        f.draw();
	                        f = f.getNext();
	                        if(f.equals(end)) {
	                            f.draw();
	                            break;
	                        }
	                    }
	                }
	                break;
	            case 4:
	                System.out.println("beauty를 종료합니다.");
	                point=false;
	                
	            }
	        }
	    }
	    
	    public void delete(int loc) {
	        Shape cur=start;
	        Shape next=start;
	        int i=1;
	        for(; i<loc; i++) {
	            cur = next;
	            next = cur.getNext();
	            
//	            if(cur==null) {
//	                System.out.println("삭제할 수 없습니다(입력수보다 노드 적음)");
//	            }
	        }
	        if(i==loc) {
	            cur.setNext(next.getNext());
	            end = cur;
	        }else {
	            cur.setNext(cur.getNext());
	        }
	    }
	    
	    public void insert(int a) {
	        Shape obj;
	        switch(a) {
	        case 1:
	            if(start==null) {
	                obj = new Line();
	                start=obj;
	                end=obj;
	            }
	            else {
	                obj = new Line();
	                end.setNext(obj);
	                end = obj;
	            }
	            break;
	        case 2:
	            if(start==null) {
	                obj = new Rect();
	                start=obj;
	                end = obj;
	            }
	            else {
	                obj = new Rect();
	                end.setNext(obj);
	                end = obj;
	            }
	            break;
	        case 3:
	            if(start==null) {
	                obj = new Circle();
	                start=obj;
	                end=obj;
	            }
	            else {
	                obj = new Circle();
	                end.setNext(obj);
	                end = obj;
	            }
	            break;
	        }
	    }
	}

public class Exercise5_12 {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		ge.run();
		}
	}