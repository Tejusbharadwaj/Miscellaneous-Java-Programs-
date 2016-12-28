import java.awt.Point;

public class Rect {
	private final Point topLeft;
	private final Point bottomRight;
	
	public Rect(Point topLeft, Point bottomRight) {
		// TODO Auto-generated constructor stub
		this.topLeft= topLeft;
		this.bottomRight=bottomRight;;
	}
	


public boolean check(Rect rect2) {
	// TODO Auto-generated method stub
	if(this.topLeft.x <0 || this.bottomRight.x<0 || this.topLeft.y <0 || this.bottomRight.y<0 ||
			rect2.topLeft.x <0 || rect2.bottomRight.x<0 || rect2.topLeft.y <0 || rect2.bottomRight.y<0)
		return false;
	if((this.topLeft.x>rect2.bottomRight.x || this.bottomRight.x>rect2.topLeft.x)&& 
			(this.topLeft.y>rect2.bottomRight.y || this.bottomRight.y>rect2.topLeft.y))
		return true;
	else
	return false;
}
}

	



