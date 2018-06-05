package Training;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,s1;
		a=10;
		b=20;
		s1=addSum(a,b);
		s1=addSum(10,20,30);
		System.out.println("sum of a= "+a+" and b = "+b+ " is "+s1);
		System.out.println("sum of three .. "+s1);

	}
	public static int addSum(int x,int y,int z) {
		int result;
		result=x+y+z;
		return result;
		
	}
	public static int addSum(int x) {
		return 9;
		
	}
	public static int addSum(int x,int y) {
		int result;
		result=x+y;
		return result;
		
	}

}
