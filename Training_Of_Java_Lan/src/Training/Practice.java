package Training;

public class Practice {

	public void username(int u) {
		System.out.println("This is Username Method");
	}
	
	public void username(int u,int y) {
		System.out.println("This is Username Method");
	}
	public void username() {
		System.out.println("This is Username Method 2");
	}

	public void password() {
		System.out.println("This is Password Method");
	}

	public void login() {
		System.out.println("This is Login Method");
	}

	public static void main(String[] args) {
	
		Practice p = new Practice();
		// p.username(10);
		p.password();
		p.login();
		p.username();
	}

}
