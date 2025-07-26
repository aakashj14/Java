package mobile;

public class Student {
	String name;
	int rollno;
	Student(String name,int rollno){
	this.name=name;
	this.rollno=rollno;
	
}
	void displayinfo() {
		System.out.println("student name"+name);
		System.out.println("rollno"+rollno);
		
	}
	public static void main(String[] args) {
		Student s1=new Student("mugesh",32);
		s1.displayinfo();
	}

}

