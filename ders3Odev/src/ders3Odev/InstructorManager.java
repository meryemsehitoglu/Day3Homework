package ders3Odev;

public class InstructorManager extends UserManager{
	
	public void addHomework(Instructor instructor) {
		
		
		System.out.println("�dev eklendi");
	}
	
	public void attendancaOpen(Instructor instructor) {
		
		System.out.println("Kat�l�m a��k");
		
	}
	
	public void attendanceClosed(Instructor instructor) {
		
		System.out.println("Kat�l�m kapal�");
	}
	

}
