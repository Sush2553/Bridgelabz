package designPattern_programs;

public class FactoryPattern {
	public static void main(String[] args) {
		Computer computer1 = FactoryObject.getInstance("Server");
		computer1.display();
		Computer computer2 = FactoryObject.getInstance("Computer Factory");
		computer2.display();
		Computer computer = FactoryObject.getInstance(" ");
		computer.display();
	}
}

//interface  computer
interface Computer {
	void display();
}

//class for computer factory
class ComputerFactory implements Computer {
	public void display() {
		System.out.println("This is computer factory");
	}
}

//server factory
class Server implements Computer {
	@Override
	public void display() {
		System.out.println("This is server class");
	}
}

//pc
class PC implements Computer {
	@Override
	public void display() {
		System.out.println("This is PC Class");
	}
}

class FactoryObject {
	public static Computer getInstance(String str) {
		if (str.equals("Computer Factory"))
			return new ComputerFactory();
		else if (str.equals("Server"))
			return new Server();
		else
			return new PC();
	}
}
