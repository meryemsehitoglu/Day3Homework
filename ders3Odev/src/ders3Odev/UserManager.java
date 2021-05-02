package ders3Odev;

public class UserManager {
	
	public void login(User user) {
		
		System.out.println(user.getType() + " : Giriþ yapýldý");
	}
	
	public void logout(User user) {
		
		System.out.println(user.getType() + " : Çýkýþ yapýldý");
		
	}
	
	public void add(User user){
		
		System.out.println(user.getType() + " : Kullanýcý eklendi");
		
	}
	
	public void delete(User user) {
		
		System.out.println(user.getType() + " : Kullanýcý silindi");
	}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			add(user);
			
		}
		
	}

	

}
