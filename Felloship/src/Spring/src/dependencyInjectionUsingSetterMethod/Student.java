package dependencyInjectionUsingSetterMethod;

public class Student {
	int id;
	String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Student id=" + id + ", name=" + name );
	}

}