package studenttestreport;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			total += s.getScore();
			System.out.println("학생" + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScore() + "점 입니다");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
	
}
