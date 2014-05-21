class Person {
	int age=0;
	public Person() {
		System.out.println("Person is called!");
	}
	public Person(int a) {
		System.out.println("Person2 is called!" + a);
	}
	private String name;
	String setname(String name) {
		this.name = name;
		return name;
	}
	String getname() {
		return name;
	}
	void fun1() {
		System.out.println("Person->fun1()");
	}
	static void fun2() {
		System.out.println("Person->fun2()");
	}
	void fun3() {
		System.out.println("Student->fun3()");
	}
}

class Student extends Person {
	int age=1;
	public Student() {
//		super(3);
		System.out.println("Student is called!");
	}
	public Student(int a) {
//		super(3);
		System.out.println("Student2 is called!" + a);
	}
	void Student() {
		System.out.println(this.age + "+" + "hfjaksf");
	}
	void fun1() {
		System.out.println("Student->fun1()");
	}
	void fun4() {
		System.out.println("Student->fun4()");
	}
}

public class ClassTrain {

	public static void main(String[] args) {
		Student s = new Student();
		s.fun1();
		s.fun2();
		s.fun3();
		s.setname("123");
		System.out.println(s.getname());
	}

}
