
public class TestGreeter {

	public static void main(String[] args) {
		Greeter test = new Greeter();
		System.out.println(test.toString());
		Greeter[] learn = new Greeter[5];
		for (Greeter fun : learn) {
			fun.toString();
		}
	}

}
