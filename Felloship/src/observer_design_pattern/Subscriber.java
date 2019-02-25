package observer_design_pattern;

public class Subscriber implements Observer {
	private String customername;
	private Subject subject;

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update(String productName) {
		System.out.println("Hello " + customername + " ," + productName + " is now available");
	}
}
