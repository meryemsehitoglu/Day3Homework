package ders3Odev;

public class InstructorManager extends UserManager{
	
	public void addHomework(Instructor instructor) {
		
		
		System.out.println("Ödev eklendi");
	}
	
	public void attendancaOpen(Instructor instructor) {
		
		System.out.println("Katýlým açýk");
		
	}
	
	public void attendanceClosed(Instructor instructor) {
		
		System.out.println("Katýlým kapalý");
	}
	

}
