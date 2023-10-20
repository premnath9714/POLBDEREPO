package Training;

public class Sample {
	
	// Constructor Topic
	// class name=constructor name
	// No return type for constructor
	
	public Sample() {  // Zero Argument Constructor
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public Sample(int d) {   // With Argument Constructor
		int a=10;
		int b=50;
		int c=a+b;
		System.out.println(c);
	}
	
	public void test() {
		System.out.println("This is test method");
		String str="india";  // Local Variable
	}
	
	String str="china";  // Global Variable
	
	public static void main(String[] args) {
		
		new Sample();
		new Sample(2);
		Sample s=new Sample();
		s.test();
		System.out.println();
        
	}

}
