import java.awt.Point;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1= new Point(1,1);
		Point p2= new Point (3,3);
		Point p3= new Point (1,2);
		Point p4= new Point (5,3);
		
		Rect rect1=new Rect(p1,p2);
		Rect rect2=new Rect(p3,p4);
		
		if(rect1.check(rect2)){
			System.out.println("Intersecting");
			
		}
		else System.out.println("not itersecting");
	}

}
