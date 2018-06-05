package Training;

interface Car {

	public String name = "vani";

	default void method() {
		System.out.println("inside");

	}

	public static void method1() {
		System.out.println("Method1");
	}

}
