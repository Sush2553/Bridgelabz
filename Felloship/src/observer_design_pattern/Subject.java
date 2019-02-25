package observer_design_pattern;


public interface Subject {
	public void registeredObserver(Observer observer);

	public void notifyObserver();
}
