
public class Greeter {
	private String name;
	private int age;

	public Greeter() {
		name = "DOME";
		age = 17;
	}

	public Greeter(String xName, int xAge) {
		name = xName;
		age = xAge;
	}

	public String toString() {
		return "Name:" + name + " Age: " + age;
	}
}
