package Training;

public class TopicStatic {
	
	// static is a keyword  
	// static che je kahi method , variables ahet tyana apan class name ni call karu shakto
	
	int a=10;  // Non-static variable Global variable
	static String s="india";
	
	public static void run() {
		 
		System.out.println("This is run method for static keyword");
	}
	
	public  void test() {
		int a=20;  // Local Variable
	//	System.out.println(a);
		System.out.println(this.a);
		System.out.println("This is run method for Non-static keyword");
	}

	public static void main(String[] args) {
		
		TopicStatic ts=new TopicStatic();
		ts.test();
		
//	    System.out.println(ts.a);
		
		System.out.println(TopicStatic.s);
		TopicStatic.run();
		

	}

}
