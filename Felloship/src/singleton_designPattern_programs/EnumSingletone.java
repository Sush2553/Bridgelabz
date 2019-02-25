package singleton_designPattern_programs;

public enum EnumSingletone {
	INSTANCE; //instance of class
	public int i;

	public void display() {
		System.out.println("i = " + i);
	}
}
