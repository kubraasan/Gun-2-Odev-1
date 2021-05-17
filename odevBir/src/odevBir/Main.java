package odevBir;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Ayşe",18);
		Student student2 = new Student(2, "Fatma", 25);
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student1);
		studentManager.Add(student2);
		
		System.out.println( "-----------------------------" );
		
		Course course1 = new Course(1,"Programlamaya Giriş için Temel Kurs", "Engin Demiroğ");
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin Demiroğ");
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
	}

}
