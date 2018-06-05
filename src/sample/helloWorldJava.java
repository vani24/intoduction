package sample;

public class helloWorldJava {

	private String name;
    private static String staticStr = "STATIC-STRING";
     
    public helloWorldJava(String n){
        this.name = n;
    }
     
    public static void testStaticMethod(){
        System.out.println("Hey... I am in static method...");
        //you can call static variables here
        System.out.println(helloWorldJava.staticStr);
        //you can not call instance variables here.
        
    }
     
    public void testObjectMethod(){
        System.out.println("Hey i am in non-static method");
        //you can also call static variables here
        System.out.println(helloWorldJava.staticStr);
        //you can call instance variables here
        System.out.println("Name: "+this.name);
    }
     
    public static void main(String a[]){
        //By using class name, you can call static method
    	helloWorldJava.testStaticMethod();
    	helloWorldJava msm = new helloWorldJava("Java2novice");
        msm.testObjectMethod();
    }

}
