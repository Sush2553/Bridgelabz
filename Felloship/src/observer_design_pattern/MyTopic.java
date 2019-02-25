package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private String productname;
	private boolean isAvailable;
	List<Observer> list = new ArrayList<Observer>(); // arraylist of type Onberver

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if (isAvailable == true) // if item is availablr then notify user
			notifyObserver();
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}

	@Override
	public void registeredObserver(Observer observer) {
		list.add(observer);

	}

	@Override
	public void notifyObserver() {
		System.out.println("Notify all registered subscribers");
		for (Observer observer : list) {
			observer.update(productname);
		}
	}

}
