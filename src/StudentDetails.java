
public class StudentDetails {

	int a = 10;

	public void student(String name) {
		System.out.println("Student name is " + name);
	}

	public void student(int id) {
		System.out.println("Student id is" + id);
	}

	public void student(int id, String name) {
		System.out.println("Student id and name are " + id + "," + name);
	}

	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.student("Arun");
	}

}
