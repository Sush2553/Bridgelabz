package autowiredByConstructor;

public class College {
	private Exam exam;
	private String cName;

	public College(Exam exam, String cName) {
		this.exam = exam;
		this.cName = cName;
	}

	void show() {
		System.out.println("College :cName=" + cName);
		exam.startExam();
	}
}
