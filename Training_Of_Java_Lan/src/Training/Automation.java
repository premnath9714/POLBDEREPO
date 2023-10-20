package Training;

import java.util.Scanner;

public class Automation {
	
	public void run() {
		
		System.out.println("This is Run Method");
		
	}
	
   public void walk() {
		
		System.out.println("This is Walk Method");
		
	}
	
	public static void main(String[] args) {
		
		// Object is a Copy of a Class Or instance of a Class
		// Object creation
		new Automation().run();
		new Automation().walk();
//		a.run();
//		a.walk();
		
		int a; //declaration
		a=0; //initialization
		System.out.println(a);
	}

}
