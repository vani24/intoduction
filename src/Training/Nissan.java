package Training;

class Nissan implements Car {

	public static void main(String[] args) {
		Nissan n = new Nissan();
		n.method();
		Car.method1();
		String value = Car.name;
		System.out.println("name..." + value);
	}
}
