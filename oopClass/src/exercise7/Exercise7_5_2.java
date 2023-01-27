package exercise7;

import java.util.*;

class Student2{
	private String name;
	private String major;
	private String studentNumber;
	private double grade;
	
	public Student2(String name, String major, String studentNumber, double grade) {
		this.name = name;
		this.major = major;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public double getGrade() {
		return grade;
	}
}

public class Exercise7_5_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student2> info = new HashMap<String, Student2>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 압력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">>");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String studentNumber = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student2 s = new Student2(name, major, studentNumber, grade);
			info.put(name, s);
		}
		
		Set<String> key = info.keySet(); // 해시맵 info에 있는 모든 키 Set 컬렉션으로 리턴
		Iterator<String> it = key.iterator(); // Set을 순차검색하는 iterator 리턴
		while(it.hasNext()) {
			String name = it.next();
			Student2 student = info.get(name); // 이름을 키로 하여 객체를 얻음
			System.out.println("--------------------------------------");
			System.out.println("이름: " + student.getName());
			System.out.println("학과: " + student.getMajor());
			System.out.println("학번: " + student.getStudentNumber());
			System.out.println("학점: " + student.getGrade());
			System.out.println("--------------------------------------");
		}
		
		while(true) {
			System.out.print("학생 이름 >>");
			String name = scanner.nextLine();
			if(name.equals("그만")) {
				break;
			}
			
			Student2 student = info.get(name); // 해시맵에서 이름을 키로 검색
			if(student == null) {
				System.out.println(name + "학생 없습니다.");
			}
			else { // 해시맵에서 검색된 Student 객체
				System.out.print(student.getName() + ", ");
				System.out.print(student.getMajor() + ", ");
				System.out.print(student.getStudentNumber() + ", ");
				System.out.println(student.getGrade());
			}
		}
		scanner.close();
	}
}