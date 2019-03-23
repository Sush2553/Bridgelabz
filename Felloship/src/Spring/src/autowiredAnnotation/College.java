package autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	private Exam exam;
	private String cName;

	@Autowired
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	void show() {
		System.out.println("College :cName=" + cName);
		exam.startExam();
	}
}
