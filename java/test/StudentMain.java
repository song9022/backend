package test;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;
import java.util.Comparator.*;


class Student {
	String name;
	boolean sexIsMale;
	int grade;
	int classNum;
	int score;
	public Student(String name, boolean sexIsMale, int grade, int classNum, int score) {
		super();
		this.name = name;
		this.sexIsMale = sexIsMale;
		this.grade = grade;
		this.classNum = classNum;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public boolean isSexIsMale() {
		return sexIsMale;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return String.format("[ %d학년, %d반, %s, %s, %d점",
				grade, classNum, sexIsMale? "남":"여", name, score);
	}
	
	enum Level {
		High, Middle, Low
	}
	
	

}


public class StudentMain {
	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("나자바", true,	1,	1,	300),
				new Student("김자스", false,	1,	1,	250),
				new Student("김자바", true,	1,	1,	200),
				new Student("이자스", false,	1,	2,	150),
				new Student("남자바", true,	1,	2,	100),
				new Student("안자스", false,	1,	2,	 50),
				new Student("왕자스", false,	1,	3,	100),
				new Student("강자스", false,	1,	3,	150),
				new Student("이자바", true,	1,	3,	200),
				new Student("나자바", true,	2,	1,	300),
				new Student("김자스", false,	2,	1,	250),
				new Student("김자바", true,	2,	1,	200),
				new Student("이자스", false,	2,	2,	150),
				new Student("남자바", false,	2,	2,	100),
				new Student("안자스", false,	2,	2,	 50),
				new Student("황자스", false,	2,	3,	100),
				new Student("강자스", false,	2,	3,	150),
				new Student("이자바", true,	2,	3,	200),	
		};
		
		System.out.println("1. 단순 그룹화");
		Map<Integer, List<Student>> stuByClassNum = 
				Stream.of(stuArr).collect(Collectors.groupingBy(Student::getClassNum));
		for (List<Student> classNum : stuByClassNum.values()) {
			for (Student s:classNum) {
				System.out.println(s);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
