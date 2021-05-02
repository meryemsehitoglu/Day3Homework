package ders3Odev;

public class UserManager {
	
	public void login(User user) {
		
		System.out.println(user.getType() + " : Giri� yap�ld�");
	}
	
	public void logout(User user) {
		
		System.out.println(user.getType() + " : ��k�� yap�ld�");
		
	}
	
	public void add(User user){
		
		System.out.println(user.getType() + " : Kullan�c� eklendi");
		
	}
	
	public void delete(User user) {
		
		System.out.println(user.getType() + " : Kullan�c� silindi");
	}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			add(user);
			
		}
		
	}

	

}
