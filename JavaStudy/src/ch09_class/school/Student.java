package ch09_class.school;

import ch09_class.commons.UtillClass;

public class Student {
	// 1. 필드 변수 선언
	// 접근제어자
	// public : 공개, 프로젝트 내부 어디서든 접근 가능
	// private : 비공개, 현재 클래스 내에서만 접근 가능
	// (default) : 같은 폴더 내에 있는 클래스에서만 접근 가능
	// 캡슐화는 필드 변수 접근제어자를 전부 private 로 만든다.
	private String name;
	private int korean;
	private int math; 
	private int english;
	private double avg;
	
	// 2. 생성자 만들기 (+ 기본 생성자)
	public Student() {}
	
	public Student(String name, int korean, int math, int english, double avg) {
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
		this.avg = avg;
	}
	
	public Student(String name, int korean, int math, int english) {
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
		setAvg();
	}
	
	// 변경된 점수에 대해 평균을 고치는 메소드
	// 현재 클래스 내부에서만 사용되므로 private 으로 한다.
	private void setAvg() {
		avg = UtillClass.weRound((korean + english + math)/ 3.0, 1);
	}
	
	
	
	
	
	// 3. toSting() 추가 

	@Override
	public String toString() {
		return "[" + name + ", 국어: " + korean + ", 수학: " + math + ", 영어: " + english + ", 평균: "
				+ avg + "]";
	}

	// private 으로 접근을 막은 필드변수에 대해 Getters and Setters 로 접근을 허용한다.
	// 단축키 art shift s 
	//Generate Getters and Setters.. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
		setAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setAvg();
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
		setAvg();
	}

	public double getAvg() {
		return avg;
	}
	

	
	
	
	
	
	

}