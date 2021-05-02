package ders3Odev;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engındemırog@gmail.com");
		instructor.setPassword("12345");
		instructor.setAbout("Certificates=MCT,PMP,ITIL");
		instructor.setType("Instructor");
		
		System.out.println("Eğitmen Adı :" + instructor.getFirstName());
		
		
		
		
		Student student= new Student();
		student.setId(1);
		student.setFirstName("Meryem");
		student.setLastName("Şehitoğlu");
		student.setEmail("meryemsehitoglu@gmail.com");
		student.setPassword("78910");
		student.setStudentNumber("Std101");
		student.setType("Student");
		
		System.out.println("Öğrenci Adı :" + student.getFirstName());
		

		UserManager userManager = new UserManager();
		userManager.login(instructor);
		userManager.logout(student);
		
		User[] users = {instructor, student};
		
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.attendanceComplete(student);
		
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.addHomework(instructor);
		instructorManager.attendancaOpen(instructor);
		
		
		
		
		
		
				
			
				
		

	}

}
