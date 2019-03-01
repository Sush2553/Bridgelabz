package facade_pattern;

public class Laptop {
	
	private String name;
	private int price;
	private String model;
	private String processor;

	Laptop(String n, int p, String m, String pr) {
		name = n;
		price = p;
		model = m;
		processor = pr;

	}

	void setName(String n) {
		name = n;
	}

	void setPrice(int p) {
		price = p;
	}

	void setModel(String m) {
		model = m;
	}

	void setProcessor(String pr) {
		processor = pr;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	String getModel() {
		return model;
	}

	String getProcessor() {
		return processor;
	}

	@Override
	public String toString() {
		return String
				.format("Laptop name: " + name + " price : " + price + " model :" + model + " processor :" + processor);

	}

}
