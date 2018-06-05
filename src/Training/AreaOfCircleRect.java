package Training;

class Area{
	
	    void area(float x, float y)
	    {
	        System.out.println("the area of the rectangle is "+x*y+" sq units");
	    }
	    void area(double x)
	    {
	        double z = 3.14 * x * x;
	        System.out.println("the area of the circle is "+z+" sq units");
	    }
	
}



public class AreaOfCircleRect {

	 public static void main(String args[]) 
		{
		 Area ob = new Area();
		   ob.area(11,12);
		   ob.area(2.5);
	        }
}
