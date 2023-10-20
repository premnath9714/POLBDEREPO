package Training;

public class TopicAccessifier {

	// public,private,protector,default // Modified Accessifier
	// Scope
	
	public String as="Pune";   // Through Out in Project
	private String st="Mumbai"; // Within Class
	String s="jw";   // Within Packages Where we Declared
	
	// Methods 
	// System Defined  print(),max(),length()
	// User Defined
	
	public void walk() {
		System.out.println("This is user Defined Method");
	}
	
	
	
	
	
	public static void main(String[] args) {
		TopicAccessifier a=new TopicAccessifier();
		a.walk();
		
	}

}
