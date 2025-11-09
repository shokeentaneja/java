package p1;

import p2.Teacher;

//Protected only calling only by making relation b/w parent and child with extends keyword
public class student1 extends Teacher
{
	

	protected student1(int i) {
		System.out.println("Child protected parameterized constructor");
		System.out.println("Child protected parameterized constructor");
		System.out.println("Child protected parameterized constructor");
		System.out.println("Child protected parameterized constructor");
		System.out.println("Child protected parameterized constructor");
		
		
		
	}

	public student1() {
		super(90);
		System.out.println("Child public constructor");
		System.out.println("Child public constructor");
	}

	public static void main(String[] args) {
		
		student1 s1 = new student1();
		student1 s2 = new student1(100);
		s1.t1(100);
		s1.t2();
		Teacher.min('h');
		
		
		
		}
	}


