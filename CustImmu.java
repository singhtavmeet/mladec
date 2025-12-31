final class Person{
	private final String name ="Tavmeet Singh";
	private final int age = 22;
	
	private String getName() {
		return name;
	}
	private int getAge() {
		return age;
	}
	public void getDetails() {
		System.out.println(getName());
		System.out.println(getAge());
	}
	
}

public class CustImmu {

	public static void main(String[] args) {
		Person p = new Person();
		p.getDetails();

	}

}
